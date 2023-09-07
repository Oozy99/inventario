package com.example.inventario.Servicios;

import com.example.inventario.Modelos.Zona;
import com.example.inventario.Respositorio.ZonaRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZonaServicios {
    @Autowired
    ZonaRespositorio objetoZonaRepositorio;


    public Zona registrarZona(Zona datosARegistrar ) throws Exception{
        try{
            return(this.objetoZonaRepositorio.save(datosARegistrar));

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public Zona modificarZona(Integer id, Zona datosAModificar)throws Exception{
        try{


            Optional<Zona> ZonaEncontrada=this.objetoZonaRepositorio.findById(id);

            if(ZonaEncontrada.isEmpty()){
                throw new Exception("Empresa no encontrada");
            }

            Zona ZonaQueExiste=ZonaEncontrada.get();


            ZonaQueExiste.setDescripcionZona(datosAModificar.getDescripcionZona());
            ZonaQueExiste.setNombreZona(datosAModificar.getNombreZona());

            //3. Guardar la informacion que se acaba de editar (SET)
            return (this.objetoZonaRepositorio.save(ZonaQueExiste));


        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //BUSCAR TODAS LAS ZONAS
    public List<Zona> buscarTodasZonas() throws Exception{
        try{
            List<Zona>listaZonas= this.objetoZonaRepositorio.findAll();
            return listaZonas;

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //BUSCAR UNA SOLA ZONA
    public Zona buscarZonaPorId(Integer id) throws Exception{
        try{
            Optional<Zona> ZonaOpcional= this.objetoZonaRepositorio.findById(id);
            if(ZonaOpcional.isEmpty()){
                throw new Exception("Empresa no encontrada");
            }
            return ZonaOpcional.get();
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //METODO ELIMINAR
    public boolean eliminarZona(Integer id) throws  Exception{
        try{

            Optional<Zona> zonaOpcional=this.objetoZonaRepositorio.findById(id);

            if(zonaOpcional.isPresent()){
                this.objetoZonaRepositorio.deleteById(id);
                return true;
            }else{
                throw new Exception("Zona no encontrada");
            }


        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }


}
