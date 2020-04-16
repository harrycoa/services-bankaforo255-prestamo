package com.app.aforo255.prestamo.model.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name = "tb_cronograma_prestamos ")
public class Prestamo implements Serializable{
	
	private static final long serialVersionUID = 3587603936409397216L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nroprestamo")
	private Integer nroprestamo;	

	@Column(name = "cuota")
	private Integer cuota;

	@Column(name = "fecha_vencimiento")
	private String fecha_vencimiento;
	
	@Column(name = "dias")
	private Integer dias;
	
	@Column(name = "capital")
	private double capital;
	
	@Column(name = "interes")
	private double interes;
	
	@Column(name = "importe_cuota")
	private double importe_cuota;
	
	@Column(name = "pagado")
	private boolean pagado;

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

	public Integer getCuota() {
		return cuota;
	}

	public void setCuota(Integer cuota) {
		this.cuota = cuota;
	}

	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getImporte_cuota() {
		return importe_cuota;
	}

	public void setImporte_cuota(double importe_cuota) {
		this.importe_cuota = importe_cuota;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	

	
	
	
	
	
	

}
