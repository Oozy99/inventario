package com.example.inventario.Modelos;

import jakarta.persistence.*;

@Entity
@Table (name = "zona")
public class Zona {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idZona;
    private String nombreZona;
    private String descripcionZona;
    private String ubicacion;
    private Integer cantidad;


    public Zona() {
    }
public Zona (Integer idZona,String nombreZona,String descripcionZona,String ubicacion, Integer cantidad){
        this.idZona=idZona;
        this.nombreZona=nombreZona;
        this.descripcionZona=descripcionZona;
        this.ubicacion=ubicacion;
        this.cantidad=cantidad;
}
    public Integer getIdZona() {

        return idZona;
    }

    public void setIdZona(Integer idZona) {
        this.idZona = idZona;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public String getDescripcionZona() {
        return descripcionZona;
    }

    public void setDescripcionZona(String descripcionZona) {
        this.descripcionZona = descripcionZona;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
