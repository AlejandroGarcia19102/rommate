package pe.edu.upc.roommate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.roommate.model.entity.Universidad;
import pe.edu.upc.roommate.model.repository.UniversidadRepository;
import pe.edu.upc.roommate.service.UniversidadService;

@Service
public class UniversidadServiceImpl implements UniversidadService
{
	@Autowired
	private UniversidadRepository universidadRepository;
	@Override
	public JpaRepository<Universidad, Integer> getRepository() {
		
		return universidadRepository;
	}

}
