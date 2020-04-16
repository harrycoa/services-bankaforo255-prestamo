package com.app.aforo255.prestamo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.aforo255.prestamo.model.entity.Customer_p;

@Repository
public interface Customer_pRepository extends CrudRepository<Customer_p, Integer>{

}
