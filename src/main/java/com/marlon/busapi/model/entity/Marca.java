package com.marlon.busapi.model.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "marca")
public class Marca {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;



}
