package com.app.aforo255.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.aforo255.prestamo.model.entity.Prestamo;
import com.app.aforo255.prestamo.service.IPrestamoService;

@RestController
public class PrestamoController {

	@Autowired
	private IPrestamoService service;	
	
	@GetMapping("/prestamolistar")
	public List<Prestamo> listar(){		
		return (List<Prestamo>) service.findAll();
	}
	
	@GetMapping("/verPrestamo/{id}")
	public Prestamo detalle(@PathVariable Integer id) {
		Prestamo prestamo = service.findById(id);
		return prestamo;
	}
}
