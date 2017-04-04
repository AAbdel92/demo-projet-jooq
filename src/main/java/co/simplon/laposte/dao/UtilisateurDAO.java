package co.simplon.laposte.dao;

import static co.simplon.laposte.domain.tables.Utilisateur.UTILISATEUR;
import static co.simplon.laposte.domain.tables.Role.ROLE;
import static co.simplon.laposte.domain.tables.UtilisateurRole.UTILISATEUR_ROLE;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.laposte.domain.Utilisateur;
import co.simplon.laposte.domain.tables.records.UtilisateurRecord;

@Repository
@Transactional
public class UtilisateurDAO {
	
	@Autowired
	private DSLContext dsl;
	
	public Utilisateur insererUtilisateur(Utilisateur utilisateur) {
		Timestamp derniereMaj = new Timestamp(System.currentTimeMillis());
		UtilisateurRecord record = dsl.insertInto(UTILISATEUR)
				.set(UTILISATEUR.PSEUDO, utilisateur.getPseudo())
				.set(UTILISATEUR.MOT_DE_PASSE, utilisateur.getMotDePasse())
				.set(UTILISATEUR.EMAIL, utilisateur.getEmail())
				.set(UTILISATEUR.DERNIERE_MAJ, derniereMaj)
				.returning(UTILISATEUR.ID)
				.fetchOne();
		utilisateur.setDerniereMaj(derniereMaj);
		utilisateur.setId(record.getId());
		return utilisateur;				
	}
	
	public List<Utilisateur> getAllUtilisateurs() {
		List<Utilisateur> resultat = new ArrayList<>();
		Result<Record> records = dsl.select().from(UTILISATEUR)
				.fetch();
		for (Record record : records) {
			resultat.add(getUtilisateur(record));
		}
		return resultat;
	}
	
	public Utilisateur getUtilisateur(int id) {
		Record record = dsl.selectFrom(UTILISATEUR)
				.where(UTILISATEUR.ID.equal(id)).fetchOne();
		return getUtilisateur(record);
	}
	
	public List<Utilisateur> getUtilisateurByRole(int id) {
		List<Utilisateur> resultat = new ArrayList<>();
		Result<Record> records = 
				dsl.select()
				.from(UTILISATEUR)
				.join(UTILISATEUR_ROLE)
				.on(UTILISATEUR.ID.eq(UTILISATEUR_ROLE.UTILISATEUR_ID))
				.join(ROLE)
				.on(UTILISATEUR_ROLE.ROLE_ID.eq(ROLE.ID))
				.where(ROLE.ID.eq(id))
				.fetch();		
//		Result<UtilisateurRecord> utilisateur = records.into(UTILISATEUR);
//		for (UtilisateurRecord utilisateurRecord : utilisateur) {
//			resultat.add(getUtilisateur(utilisateurRecord));
//		}
		for (Record record : records) {
			resultat.add(getUtilisateur(record));
		}
		return resultat;
	}
	
	private Utilisateur getUtilisateur(Record record){
		int id = record.getValue(UTILISATEUR.ID, Integer.class);
		String pseudo = record.getValue(UTILISATEUR.PSEUDO, String.class);
		String motDePasse = record.getValue(UTILISATEUR.MOT_DE_PASSE, String.class);
		String email = record.getValue(UTILISATEUR.EMAIL, String.class);
		Timestamp derniereMaj = record.getValue(UTILISATEUR.DERNIERE_MAJ, Timestamp.class);
		return new Utilisateur(id, pseudo, motDePasse, email, derniereMaj);
	}
}
