package com.example.inventario.Respositorio;

import com.example.inventario.Modelos.Zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaRespositorio extends JpaRepository<Zona,Integer> {
}
