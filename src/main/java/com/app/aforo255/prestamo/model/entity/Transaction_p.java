package com.app.aforo255.prestamo.model.entity;

import java.io.Serializable;

public class Transaction_p implements Serializable{

	private static final long serialVersionUID = 2346429413245895726L;
	
	private Integer id;	
	private Integer nroprestamo;
	private double importe_cuota;
	private Integer cuota;
	private String creationDate ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNroprestamo() {
		return nroprestamo;
	}
	public void setNroprestamo(Integer nroprestamo) {
		this.nroprestamo = nroprestamo;
	}
	public double getImporte_cuota() {
		return importe_cuota;
	}
	public void setImporte_cuota(double importe_cuota) {
		this.importe_cuota = importe_cuota;
	}
	public Integer getCuota() {
		return cuota;
	}
	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}	
	
}
