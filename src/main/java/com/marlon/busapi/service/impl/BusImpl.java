package com.marlon.busapi.service.impl;

import com.marlon.busapi.model.dao.BusDao;
import com.marlon.busapi.model.entity.Bus;
import com.marlon.busapi.service.IBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class BusImpl  implements IBus {




    @Autowired
    private BusDao busDao;

   // @Transactional
    @Override
    public Bus crear(Bus bus) {
        return busDao.save( bus);
    }

    @Override
    public Page<Bus> obtenerBuses(Pageable pageable ) {

        return busDao.findAll(pageable);
    }

   //@Transactional(readOnly = true)
    @Override
    public Optional<Bus> obtenerBusPorId(Integer id) {
        return busDao.findById(id);
    }
}
