package co.edu.uniquindio.poo.veterinariajavafx.model;

import java.util.LinkedList;

public class Veterinaria {
    private String nombre;
    private String nit;
    private LinkedList<Mascota> mascotas;
    private LinkedList<Propietario> propietarios;

//------------------ CONSTRUCTOR ------------------------
    public Veterinaria(String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
        mascotas = new LinkedList<>();
        propietarios = new LinkedList<>();
    }

//------------------ GET AND SET ------------------------

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(LinkedList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public LinkedList<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(LinkedList<Propietario> propietarios) {
        this.propietarios = propietarios;
    }


//------------------ CRUD MASCOTA ------------------------

    public boolean almacenarMascota(String id, String nombre, String especie, String raza, int edadMeses, double peso, Propietario propietario) {

        // Evitar duplicados
        for (Mascota m : mascotas) {
            if (m.getId().equals(id)) {
                return false;
            }
        }


        Mascota nuevaMascota = new Perro (id, nombre, especie, raza, edadMeses, peso, propietario);
        mascotas.add(nuevaMascota);

        // Agregarla también al propietario
        propietario.getMascotas().add(nuevaMascota);

        return true;
    }

    public Mascota obtenerMascota(String id) {
        for (Mascota m : mascotas) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public LinkedList<Mascota> obtenerListaMascotas() {
        return mascotas;
    }

    public boolean actualizarMascota(String id, String nombre, String especie, String raza, int edadMeses, double peso) {
        Mascota m = obtenerMascota(id);
        if (m == null) return false;

        m.setNombre(nombre);
        m.setEspecie(especie);
        m.setRaza(raza);
        m.setEdadMeses(edadMeses);
        m.setPeso(peso);
        return true;
    }

    public boolean eliminarMascota(String id) {
        Mascota m = obtenerMascota(id);
        if (m == null) return false;

        // También se elimina del propietario
        m.getPropietario().getMascotas().remove(m);
        mascotas.remove(m);
        return true;
    }
//------------------ CRUD PROPIETARIO ------------------------

    public boolean agregarPropietario(String nombre, String telefono, String direccion, String puntaje) {
        for (Propietario p : propietarios) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return false; // ya existe con ese nombre (o podrías usar otro identificador)
            }
        }

        Propietario nuevoPropietario = new Propietario(nombre, telefono, direccion, puntaje);
        propietarios.add(nuevoPropietario);
        return true;
    }

    public Propietario obtenerPropietario(String nombre) {
        for (Propietario p : propietarios) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public LinkedList<Propietario> obtenerListaPropietarios() {
        return propietarios;
    }

    public boolean actualizarPropietario(String nombre, String telefono, String direccion, String puntaje) {
        Propietario p = obtenerPropietario(nombre);
        if (p == null) return false;

        p.setTelefono(telefono);
        p.setDireccion(direccion);
        p.setPuntaje(puntaje);
        return true;
    }

    public boolean eliminarPropietario(String nombre) {
        Propietario p = obtenerPropietario(nombre);
        if (p == null) return false;

        // Eliminar también sus mascotas
        mascotas.removeIf(m -> m.getPropietario().equals(p));

        propietarios.remove(p);
        return true;
    }
//------------------ METODOS ------------------------
    public double calcularCostoConsulta(Mascota mascota) {
        double valorBase = 30000; // valor fijo base de la consulta
        double costoFinal = valorBase;

        // Incremento según la especie
        if (mascota.getEspecie().equalsIgnoreCase("perro")) {
            costoFinal += 10000;
        } else if (mascota.getEspecie().equalsIgnoreCase("gato")) {
            costoFinal += 8000;
        } else {
            costoFinal += 5000; // otras especies
        }

        // Incremento según la edadMeses
        if (mascota.getEdadMeses() > 10) {
            costoFinal += 7000; // mascotas mayores de 10 años
        } else if (mascota.getEdadMeses() < 2) {
            costoFinal += 4000; // cachorros o muy jóvenes
        }

        return costoFinal;
    }
}