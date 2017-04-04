package co.simplon.laposte.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Role {
	
	private int id;
	private String nom;
	private Timestamp derniereMaj;
	private List<Utilisateur> listeUtilisateurs = new ArrayList<>();

}
