package pe.edu.upc.roommate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.roommate.model.entity.TipoVia;
import pe.edu.upc.roommate.model.repository.TipoViaRepository;
import pe.edu.upc.roommate.service.TipoViaService;

@Service
public class TipoViaServiceImpl implements TipoViaService {
	
	@Autowired
	private TipoViaRepository tipoViaRepository;
	@Override
	public JpaRepository<TipoVia, Integer> getRepository() {
		
		return tipoViaRepository;
	}

}
