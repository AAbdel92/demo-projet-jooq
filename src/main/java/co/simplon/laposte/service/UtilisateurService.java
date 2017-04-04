package co.simplon.laposte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.laposte.dao.UtilisateurDAO;
import co.simplon.laposte.domain.Utilisateur;






@Service
public class UtilisateurService {
	
	@Autowired
	private UtilisateurDAO dao;
	
	public Utilisateur insererUtilisateur(Utilisateur utilisateur) {		
		return dao.insererUtilisateur(utilisateur);		
	}
	
	public List<Utilisateur> getAllUtilisateurs() {
		return dao.getAllUtilisateurs();
	}
	
	public Utilisateur getUtilisateur(int id) {
		return dao.getUtilisateur(id);
	}
	public List<Utilisateur> getUtilisateurByRole( int roleId) {
		return dao.getUtilisateurByRole(roleId);
	}
	public Utilisateur insertTest(Utilisateur utilisateur) {
		return dao.insertTest(utilisateur);
	}
}
