package co.simplon.laposte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.laposte.dao.RoleDAO;
import co.simplon.laposte.domain.Role;

@Service
public class RoleService {
	
	@Autowired
	private RoleDAO dao;
	
	public List<Role> selectRoles() {
		return dao.selectRoles();
	}
}
