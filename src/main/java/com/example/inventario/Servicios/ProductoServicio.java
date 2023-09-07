package com.example.inventario.Servicios;

import com.example.inventario.Modelos.Producto;
import com.example.inventario.Respositorio.ProductoRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio {

    @Autowired
    ProductoRespositorio objetoProductoRepositorio;

    public Producto registrarProducto(Producto datosARegistrar) throws Exception {
        try {
            return objetoProductoRepositorio.save(datosARegistrar);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public Producto modificarProducto(Integer id, Producto datosAModificar) throws Exception {
        try {
            Optional<Producto> productoEncontrado = objetoProductoRepositorio.findById(id);
            if (productoEncontrado.isEmpty()) {
                throw new Exception("Producto no encontrado");
            }
            Producto productoExistente = productoEncontrado.get();

            productoExistente.setDescripcion(datosAModificar.getDescripcion());
            productoExistente.setNombre(datosAModificar.getNombre());

            return objetoProductoRepositorio.save(productoExistente);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Producto> buscarTodosProductos() throws Exception {
        try {
            List<Producto> listaProductos = objetoProductoRepositorio.findAll();
            return listaProductos;
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // BUSCAR UN SOLO PRODUCTO POR ID
    public Producto buscarProductoPorId(Integer id) throws Exception {
        try {
            Optional<Producto> productoOpcional = objetoProductoRepositorio.findById(id);
            if (productoOpcional.isEmpty()) {
                throw new Exception("Producto no encontrado");
            }
            return productoOpcional.get();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // METODO ELIMINAR
    public boolean eliminarProducto(Integer id) throws Exception {
        try {
            Optional<Producto> productoOpcional = objetoProductoRepositorio.findById(id);

            if (productoOpcional.isPresent()) {
                objetoProductoRepositorio.deleteById(id);
                return true;
            } else {
                throw new Exception("Producto no encontrado");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
