package co.simplon.laposte.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.laposte.domain.Utilisateur;
import co.simplon.laposte.service.UtilisateurService;

@RestController
public class UtilisateurController {
	
	@Autowired
	UtilisateurService service;
	
	@GetMapping(value="/api/utilisateur/listeUtilisateur")
	public ResponseEntity<?> listerUtilisateur() {
		List<Utilisateur> resultat;				
		resultat = service.getAllUtilisateurs();
		return ResponseEntity.ok(resultat);
	}

}
