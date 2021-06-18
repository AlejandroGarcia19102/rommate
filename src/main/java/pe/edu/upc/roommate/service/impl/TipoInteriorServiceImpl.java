package pe.edu.upc.roommate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.roommate.model.entity.TipoInterior;
import pe.edu.upc.roommate.model.repository.TipoInteriorRepository;
import pe.edu.upc.roommate.service.TipoInteriorService;

@Service
public class TipoInteriorServiceImpl implements TipoInteriorService{

	@Autowired
	private TipoInteriorRepository tipoInteriorRepository;
	@Override
	public JpaRepository<TipoInterior, Integer> getRepository() {
		
		return tipoInteriorRepository;
	}

}
