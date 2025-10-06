package co.edu.uniquindio.poo.veterinariajavafx.model;

public abstract class Mascota {
    protected String id;
    protected String nombre;
    protected String especie;
    protected String raza;
    protected int edad;
    protected int peso;
    protected CategoriaEdad categoriaEdad;
    protected Propietario propietario;


//------------------ CONSTRUCTOR ------------------------
    public Mascota(String id, String nombre, String especie,String raza, int edad, int peso, Propietario propietario) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.categoriaEdad  = categoriaEdad;
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

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
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
        return "Mascota {\n Nombre: " + nombre + "\n Especie: " + especie + "\n Raza: " + raza + "\n Edad: " + edad + "\n Id: " + id + "\n Dueño: " + propietario.getNombre() + "\n" + "}";
    }

}

