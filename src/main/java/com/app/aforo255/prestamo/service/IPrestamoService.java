package com.app.aforo255.prestamo.service;

import java.util.List;

import com.app.aforo255.prestamo.model.entity.Prestamo;

public interface IPrestamoService {
	
	public List<Prestamo> findAll();
	public Prestamo findById(Integer id);
	public Prestamo save(Prestamo prestamo);

}
