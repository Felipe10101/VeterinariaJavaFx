package co.edu.uniquindio.poo.veterinariajavafx.model;

import java.util.LinkedList;

public class Propietario {
    private String nombre;
    private String telefono;
    private String direccion;
    private String puntaje;
    private LinkedList<Mascota> mascotas ;

//------------------ CONSTRUCTOR ------------------------
    public Propietario(String nombre,String telefono,String direccion, String puntaje){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.puntaje = puntaje;
        mascotas = new LinkedList<>();
    }

//------------------ GET AND SET ------------------------
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }


    public void setMascotas(LinkedList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
//------------------ TO STRING ------------------------
    @Override
    public String toString(){
        return "Propietario: {\n Nombre: " + nombre + "\n Telefono: " + telefono + "\n Direccion: " + direccion + "\n Id: " + + "}\n";

    }
}