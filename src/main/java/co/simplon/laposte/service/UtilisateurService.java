package co.simplon.laposte.service;

import static co.simplon.laposte.domain.tables.Utilisateur.UTILISATEUR;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.laposte.domain.Utilisateur;
import co.simplon.laposte.domain.tables.records.UtilisateurRecord;




@Service
@Transactional
public class UtilisateurService {
	
	@Autowired
	DSLContext dsl;
	
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
	
	public Utilisateur getUtilisateur(Long id) {
		Record record = dsl.selectFrom(UTILISATEUR)
				.where(UTILISATEUR.ID.equals(id)).fetchOne();
		return getUtilisateur(record);
	}
	
	private Utilisateur getUtilisateur(Record record){
		Long id = record.getValue(UTILISATEUR.ID, Long.class);
		String pseudo = record.getValue(UTILISATEUR.PSEUDO, String.class);
		String motDePasse = record.getValue(UTILISATEUR.MOT_DE_PASSE, String.class);
		String email = record.getValue(UTILISATEUR.EMAIL, String.class);
		Timestamp derniereMaj = record.getValue(UTILISATEUR.DERNIERE_MAJ, Timestamp.class);
		return new Utilisateur(id, motDePasse, pseudo, email, derniereMaj);
	}


}
