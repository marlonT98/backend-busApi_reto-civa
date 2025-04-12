package com.marlon.busapi.model.dao;


import com.marlon.busapi.model.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaDao  extends JpaRepository<Marca ,Integer > {
}
