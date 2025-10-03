package co.edu.uniquindio.poo.veterinariajavafx.model;

public class Propietario {
    private String nombre;
    private String telefono;
    private String direccion;
    private String puntaje;
    private Mascota[] mascotas;

    public Propietario(String nombre,String telefono,String direccion, String puntaje){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.puntaje = puntaje;
        this.mascotas = new Mascota[3];
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public Mascota[] getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return "Propietario: {\n Nombre: " + nombre + "\n Telefono: " + telefono + "\n Direccion: " + direccion + "\n Id: " + id + "}\n";
    }
}