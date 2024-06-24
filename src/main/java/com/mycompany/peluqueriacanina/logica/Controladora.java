package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    //Modelado de capas, la interfaz grafica(IGU) instancia a la logica y la logica a la persistencia 
    //Instancia de logica a persistencia 
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Metodo para guardar
    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {

        //Instancias
        
        //Creamos al usuario dueño y asignamos sus valores 
        Duenio duenio = new Duenio();
        
        //Set a dueño
        duenio.setNombre(nombreDuenio);
        duenio.setCelDueno(celDuenio);

        //Creamos la mascota y le asignamos sus valores 
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);

        /*Instanciar con persistencia de la logica a partir de los 2 obejtos,
        crear la base de datos y asociarlos */
        controlPersis.guardar(duenio, masco);
    }

    public List<Mascota> traerMascotas() {

        return controlPersis.traerMascotas();

    }

    public void borrarMascota(int num_cliente) {

        controlPersis.borrarMascota(num_cliente);

    }

    public Mascota traerMascota(int num_cliente) {

        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza,
            String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {

        //A la Mascota (masco), asignar nuevos valores por Setter
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atenEsp);
        masco.setAlergico(alergico);

        //Modificar la mascota
        controlPersis.modificarMascota(masco);

        //Asignar valores al dueño 
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setCelDueno(celDuenio);
        dueno.setNombre(nombreDuenio);
        
        //Instanciar a modificar Dueño
        this.modificarDuenio(dueno);
        

    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
        
       
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificaDuenio(dueno);
    }

}
