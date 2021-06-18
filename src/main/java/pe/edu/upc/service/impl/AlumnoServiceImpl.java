package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Alumno;
import pe.edu.upc.model.repository.AlumnoRepository;
import pe.edu.upc.service.AlumnoService;


@Service
public class AlumnoServiceImpl implements AlumnoService
{
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public JpaRepository<Alumno, Integer> getRepository() {
		
		return alumnoRepository;
	}

}
