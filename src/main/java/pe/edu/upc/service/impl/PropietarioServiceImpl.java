package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Propietario;
import pe.edu.upc.model.repository.PropietarioRepository;
import pe.edu.upc.service.PropietarioService;

@Service
public class PropietarioServiceImpl implements PropietarioService{
	@Autowired
	private PropietarioRepository propietarioRepository;
	@Override
	public JpaRepository<Propietario, Integer> getRepository() {
		
		return propietarioRepository;
	}

}
