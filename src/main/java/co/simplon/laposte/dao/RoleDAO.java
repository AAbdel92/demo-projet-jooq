package co.simplon.laposte.dao;

import static co.simplon.laposte.domain.tables.Role.ROLE;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.simplon.laposte.domain.Role;

@Repository
public class RoleDAO {
	
	@Autowired
	private DSLContext dsl;
	
	public Role insererRole(Role role) {
		return role;
	}
	
	public List<Role> selectRoles() {
		List<Role> resultat = new ArrayList<>();		
		Result<Record> record = dsl.select()
								.from(ROLE)
								.fetch();
		for (Record role : record) {
			resultat.add(getRole(role));
		}
		return resultat;
	}
	
	private Role getRole(Record record) {
		int id = record.getValue(ROLE.ID, Integer.class);
		String nom = record.getValue(ROLE.NOM, String.class);
		Timestamp derniereMaj = record.getValue(ROLE.DERNIERE_MAJ, Timestamp.class);
		return new Role(id, nom, derniereMaj);
	}
}
