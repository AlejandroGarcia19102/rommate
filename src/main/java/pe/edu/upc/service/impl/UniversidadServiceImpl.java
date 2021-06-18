package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Universidad;
import pe.edu.upc.model.repository.UniversidadRepository;
import pe.edu.upc.service.UniversidadService;

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
