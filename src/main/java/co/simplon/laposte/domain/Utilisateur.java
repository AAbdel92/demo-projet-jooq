package co.simplon.laposte.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Utilisateur {
	
	private long id;
	private String pseudo;
	private String motDePasse;
	private String email;
	private Timestamp derniereMaj;
	private List<Role> listeRoles = new ArrayList<>();
	
	public Utilisateur() {
		
	}
	
	public Utilisateur(long id, String pseudo, String motDePasse, String email, Timestamp derniereMaj) {
		super();
		this.id = id;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.email = email;
		this.derniereMaj = derniereMaj;
	}
	

}
