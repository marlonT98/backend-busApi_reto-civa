package com.marlon.busapi.controller;


import com.marlon.busapi.model.entity.Bus;
import com.marlon.busapi.service.IBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class BusController {


    //llamamos a nuestro servicio
    @Autowired
    private IBus busService;

    @PostMapping("bus")
    @ResponseStatus(HttpStatus.CREATED)
    public Bus create(  @RequestBody  Bus bus) {
        return busService.crear(bus);
    }


    @GetMapping("buses")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Page<Bus>> obtenerTodosLosBuses(Pageable pageable ) {

        return ResponseEntity.ok(busService.obtenerBuses(pageable));
    }



    @GetMapping("bus/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Bus> obtenerBusPorId(@PathVariable Integer id) {
        return busService.obtenerBusPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }






}
