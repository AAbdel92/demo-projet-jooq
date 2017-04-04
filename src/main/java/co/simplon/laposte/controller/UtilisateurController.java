package co.simplon.laposte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.laposte.domain.Utilisateur;
import co.simplon.laposte.service.UtilisateurService;

@RestController
@RequestMapping(value="/api/utilisateur")
public class UtilisateurController {
	
	@Autowired
	UtilisateurService service;
	
	@GetMapping(value="/listeUtilisateur")
	public ResponseEntity<?> listerUtilisateur() {
		List<Utilisateur> resultat;				
		resultat = service.getAllUtilisateurs();
		return ResponseEntity.ok(resultat);
	}	
	
//	@GetMapping(value="/{roleId}") 
//		public ResponseEntity<?> getByRole(@PathVariable(value="roleId") int roleId) {
//		List<Utilisateur> resultat = service.getUtilisateurByRole(roleId);
//		return ResponseEntity.ok(resultat);
//	}
	
	@PostMapping
	public ResponseEntity<?> sauverUtilisateur(@RequestBody Utilisateur utilisateur) {
		Utilisateur resultat;
		resultat = service.insertTest(utilisateur);
		return ResponseEntity.ok(resultat);		
	}
	
}
