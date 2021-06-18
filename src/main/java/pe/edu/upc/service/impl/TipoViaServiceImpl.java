package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.TipoVia;
import pe.edu.upc.model.repository.TipoViaRepository;
import pe.edu.upc.service.TipoViaService;

@Service
public class TipoViaServiceImpl implements TipoViaService {
	
	@Autowired
	private TipoViaRepository tipoViaRepository;
	@Override
	public JpaRepository<TipoVia, Integer> getRepository() {
		
		return tipoViaRepository;
	}

}
