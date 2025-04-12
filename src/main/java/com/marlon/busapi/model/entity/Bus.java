package com.marlon.busapi.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity // le estamos diciendo que es una entidad
@Data // para los get y set
@Table(name = "buses")

public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero_bus", nullable = false)
    private String numeroBus;

    @Column(nullable = false)
    private String placa;

    @Column(name = "fecha_creacion", updatable = false)
    private LocalDateTime fechaCreacion;


    private  String caracteristicas;

    @Enumerated(EnumType.STRING)
    private  Estado estado;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;


    //para autogenerar la fecha antes de que guarde
    @PrePersist
    public  void prePersist (){
        this.fechaCreacion = LocalDateTime.now();
    }


    //SE USA PARA DEFINIR CONSTANTES
public enum  Estado {
    ACTIVO ,
    INACTIVO


}








}
