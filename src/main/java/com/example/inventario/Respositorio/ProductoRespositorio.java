package com.example.inventario.Respositorio;

import com.example.inventario.Modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRespositorio extends JpaRepository<Producto,Integer> {
}
