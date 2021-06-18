package pe.edu.upc.roommate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.roommate.model.entity.TipoNMz;
import pe.edu.upc.roommate.model.repository.TipoNMzRepository;
import pe.edu.upc.roommate.service.TipoNMzService;

@Service
public class TipoNMzServiceImpl implements TipoNMzService{
	
	@Autowired
	private TipoNMzRepository tipoNMzRepository;
	
	@Override
	public JpaRepository<TipoNMz, Integer> getRepository() {
		
		return tipoNMzRepository;
	}

}
