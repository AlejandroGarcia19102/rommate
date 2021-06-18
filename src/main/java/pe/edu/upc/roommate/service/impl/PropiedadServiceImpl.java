package pe.edu.upc.roommate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.roommate.model.entity.Propiedad;
import pe.edu.upc.roommate.model.repository.PropiedadRepository;
import pe.edu.upc.roommate.service.PropiedadService;

@Service
public class PropiedadServiceImpl implements PropiedadService{
	@Autowired
	private PropiedadRepository propiedadRepository;
	@Override
	public JpaRepository<Propiedad, Integer> getRepository() {
		
		return propiedadRepository;
	}

}
