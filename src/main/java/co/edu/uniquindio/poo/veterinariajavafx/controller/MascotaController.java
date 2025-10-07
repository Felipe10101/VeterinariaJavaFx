package co.edu.uniquindio.poo.veterinariajavafx.controller;
import co.edu.uniquindio.poo.veterinariajavafx.model.Mascota;
import co.edu.uniquindio.poo.veterinariajavafx.model.Veterinaria;


import java.util.LinkedList;

public class MascotaController {

    Veterinaria veterinaria;


    public MascotaController(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }


    public boolean crearMascota(Mascota mascota) {
        return veterinaria.agregarMascota(mascota);
    }


    public LinkedList<Mascota> obtenerListaMascotas() {
        return veterinaria.getMascotas();
    }


    public boolean eliminarMascota(String id) {
        return veterinaria.eliminarMascota(id);
    }


    public boolean actualizarMascota(String id, Mascota mascota) {
        return veterinaria.actualizarMascota(id, mascota);
    }


}
