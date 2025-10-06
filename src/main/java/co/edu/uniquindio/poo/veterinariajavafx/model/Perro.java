package co.edu.uniquindio.poo.veterinariajavafx.model;

public class Perro extends Mascota{

    private String nivelAdiestramiento, necesidadPaseos;
    private Tamanio tamanio;

//------------------ CONSTRUCTOR ------------------------
    public Perro(String id, String nombre, String especie, String raza, int edad, int peso, Propietario propietario, String nivelAdiestramiento, String necesidadPaseos, Tamanio tamanio) {
        super(id, nombre, especie, raza, edad, peso, propietario);
        this.nivelAdiestramiento = nivelAdiestramiento;
        this.necesidadPaseos = necesidadPaseos;
        this.tamanio = tamanio;
    }
//------------------ GET AND SET ------------------------
    public String getNivelAdiestramiento() {
        return nivelAdiestramiento;
    }
    public void setNivelAdiestramiento(String nivelAdiestramiento) {
        this.nivelAdiestramiento = nivelAdiestramiento;
    }

    public String getNecesidadPaseos() {
        return necesidadPaseos;
    }
    public void setNecesidadPaseos(String necesidadPaseos) {
        this.necesidadPaseos = necesidadPaseos;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }
    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

}
