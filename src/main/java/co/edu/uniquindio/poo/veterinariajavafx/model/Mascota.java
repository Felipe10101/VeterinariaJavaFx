package co.edu.uniquindio.poo.veterinariajavafx.model;

public abstract class Mascota {
    protected String id;
    protected String nombre;
    protected String raza;
    protected int edadMeses;
    protected double peso;
    protected CategoriaEdad categoriaEdad;
    protected Propietario propietario;


//------------------ CONSTRUCTOR ------------------------
public Mascota(String id, String nombre, String especie, String raza, int edadMeses, double peso,
               CategoriaEdad categoriaEdad, Propietario propietario) {
    this.id = id;
    this.nombre = nombre;
    this.raza = raza;
    this.edadMeses = edadMeses;
    this.peso = peso;
    this.categoriaEdad = categoriaEdad;
    this.propietario = propietario;
}
//------------------ GET AND SET ------------------------
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edadMeses;
    }
    public void setEdad(int edadMeses) {
        this.edadMeses = edadMeses;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public CategoriaEdad getCategoriaEdad() {
        return categoriaEdad;
    }
    public void setCategoriaEdad(CategoriaEdad categoriaEdad) {
        this.categoriaEdad = categoriaEdad;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

//------------------ TO STRING ------------------------
    @Override
    public String toString(){
        return "Mascota {\n Nombre: " + nombre + "\n Especie: " + "\n Raza: " + raza + "\n Edad: " + edadMeses + "\n Id: " + id + "\n Dueño: " + propietario.getNombre() + "\n" + "}";
    }

}

