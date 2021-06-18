package pe.edu.upc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.entity.Distrito;
import pe.edu.upc.model.repository.DistritoRepository;
import pe.edu.upc.service.DistritoService;

@Service
public class DistritoServiceImpl implements DistritoService
{
	@Autowired
	private DistritoRepository distritoRepository;
	@Override
	public JpaRepository<Distrito, Integer> getRepository() {
		
		return distritoRepository;
	}

}
