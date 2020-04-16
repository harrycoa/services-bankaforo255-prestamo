package com.app.aforo255.prestamo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.app.aforo255.prestamo.model.entity.Prestamo;

@Repository

public interface PrestamoRepository extends CrudRepository<Prestamo, Integer> {

}
