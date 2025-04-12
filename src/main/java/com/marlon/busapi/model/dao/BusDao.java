package com.marlon.busapi.model.dao;

import com.marlon.busapi.model.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusDao extends JpaRepository<Bus , Integer> {
}
