package pe.edu.upc.roommate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.roommate.model.entity.Interes;
import pe.edu.upc.roommate.model.repository.InteresRepository;
import pe.edu.upc.roommate.service.InteresService;

@Service
public class InteresServiceImpl implements InteresService
{

	@Autowired
	private InteresRepository interesRepository;
	@Override
	public JpaRepository<Interes, Integer> getRepository() {
		
		return interesRepository;
	}

}
