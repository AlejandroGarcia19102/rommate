package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Alquiler;
import pe.edu.upc.model.repository.AlquilerRepository;
import pe.edu.upc.service.AlquilerService;

@Service
public class AlquilerServiceImpl implements AlquilerService {

	@Autowired
	private AlquilerRepository alquilerRepository;
	@Override
	public JpaRepository<Alquiler, Integer> getRepository() {
		
		return alquilerRepository;
	}

}
