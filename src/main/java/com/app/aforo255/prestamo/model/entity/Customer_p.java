package com.app.aforo255.prestamo.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_p")
public class Customer_p implements Serializable {

	private static final long serialVersionUID = 8598326960768876601L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_customer_p")
	private Integer IdCustomer_p ;
	@Column(name="full_name")
	private String FullName ;
	
	public Integer getIdCustomer_p() {
		return IdCustomer_p;
	}
	public void setIdCustomer_p(Integer idCustomer_p) {
		IdCustomer_p = idCustomer_p;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}		
	
}
