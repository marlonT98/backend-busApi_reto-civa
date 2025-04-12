package com.marlon.busapi.service;

import com.marlon.busapi.model.entity.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBus {

    Bus crear ( Bus bus);

   Page<Bus> obtenerBuses( Pageable pageable);

    Optional< Bus > obtenerBusPorId( Integer id );



}
