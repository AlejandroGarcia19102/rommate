package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Habitacion;
import pe.edu.upc.model.repository.HabitacionRepository;
import pe.edu.upc.service.HabitacionService;

@Service
public class HabitacionServiceImpl implements HabitacionService 
{
	@Autowired
	private HabitacionRepository habitacionRepository;
	
	@Override
	public JpaRepository<Habitacion, Integer> getRepository() {
		
		return habitacionRepository;
	}

}
