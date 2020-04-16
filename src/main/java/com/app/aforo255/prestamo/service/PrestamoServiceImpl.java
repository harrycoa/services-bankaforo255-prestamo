package com.app.aforo255.prestamo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.aforo255.prestamo.model.entity.Prestamo;
import com.app.aforo255.prestamo.model.repository.PrestamoRepository;


@Service
public class PrestamoServiceImpl implements IPrestamoService {
	

	@Autowired
	private PrestamoRepository prestamoRepo;
	@Override
	public List<Prestamo> findAll() {
		// TODO Auto-generated method stub
		return (List<Prestamo>) prestamoRepo.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Prestamo findById(Integer id) {
		// TODO Auto-generated method stub
		return prestamoRepo.findById(id).orElse(null);
	}
	@Override
	public Prestamo save(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return prestamoRepo.save(prestamo);
	}
}
