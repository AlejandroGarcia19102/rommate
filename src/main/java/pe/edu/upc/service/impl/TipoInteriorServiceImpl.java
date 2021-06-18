package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.TipoInterior;
import pe.edu.upc.model.repository.TipoInteriorRepository;
import pe.edu.upc.service.TipoInteriorService;

@Service
public class TipoInteriorServiceImpl implements TipoInteriorService{

	@Autowired
	private TipoInteriorRepository tipoInteriorRepository;
	@Override
	public JpaRepository<TipoInterior, Integer> getRepository() {
		
		return tipoInteriorRepository;
	}

}
