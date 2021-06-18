package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Propiedad;
import pe.edu.upc.model.repository.PropiedadRepository;
import pe.edu.upc.service.PropiedadService;

@Service
public class PropiedadServiceImpl implements PropiedadService{
	@Autowired
	private PropiedadRepository propiedadRepository;
	@Override
	public JpaRepository<Propiedad, Integer> getRepository() {
		
		return propiedadRepository;
	}

}
