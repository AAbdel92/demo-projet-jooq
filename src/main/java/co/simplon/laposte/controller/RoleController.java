package co.simplon.laposte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.laposte.domain.Role;
import co.simplon.laposte.service.RoleService;

@RestController
@RequestMapping(value="/api/role")
public class RoleController {
	
	@Autowired
	private RoleService service;
	
	@GetMapping
	public ResponseEntity<?> selectRoles() {
		List<Role> resultat;
		resultat = service.selectRoles();
		return ResponseEntity.ok(resultat);
	}
}
