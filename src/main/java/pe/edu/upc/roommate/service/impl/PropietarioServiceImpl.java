package pe.edu.upc.roommate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.roommate.model.entity.Propietario;
import pe.edu.upc.roommate.model.repository.PropietarioRepository;
import pe.edu.upc.roommate.service.PropietarioService;

@Service
public class PropietarioServiceImpl implements PropietarioService{
	@Autowired
	private PropietarioRepository propietarioRepository;
	@Override
	public JpaRepository<Propietario, Integer> getRepository() {
		
		return propietarioRepository;
	}

}
