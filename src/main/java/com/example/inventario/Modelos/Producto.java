package com.example.inventario.Modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;
    private  String nombre;
    private String descripcion;
    private Double precioVenta;
    private String numeroSerie;
    private LocalDate fechaAdquisicion;

    public Producto() {
    }

    public Producto(Integer idProducto,String nombre,String descripcion,Double precioVenta,String numeroSerie,LocalDate fechaAdquisicion){
        this.idProducto=idProducto;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precioVenta=precioVenta;
        this.numeroSerie=numeroSerie;
        this.fechaAdquisicion=fechaAdquisicion;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
}
