package co.edu.uniquindio.poo.veterinariajavafx.model;

public class Gato extends Mascota{


    private int cantidadHorasSuenio;
    private String nivelIndependencia;
    private TipoDomesticacion tipoDomesticacion;

//------------------ CONSTRUCTOR ------------------------


    public Gato(String id, String nombre, String especie, String raza, int edadMeses, double peso, Propietario propietario, int cantidadHorasSuenio, String nivelIndependencia, TipoDomesticacion tipoDomesticacion) {
        super(id, nombre, especie, raza, edadMeses, peso, propietario);
        this.cantidadHorasSuenio = cantidadHorasSuenio;
        this.nivelIndependencia = nivelIndependencia;
        this.tipoDomesticacion = tipoDomesticacion;
    }

    //------------------ GET AND SET ------------------------
    public int getCantidadHorasSuenio() {
        return cantidadHorasSuenio;
    }
    public void setCantidadHorasSuenio(int cantidadHorasSuenio) {
        this.cantidadHorasSuenio = cantidadHorasSuenio;
    }

    public String getNivelIndependencia() {
        return nivelIndependencia;
    }
    public void setNivelIndependencia(String nivelIndependencia) {
        this.nivelIndependencia = nivelIndependencia;
    }

    public TipoDomesticacion getTipoDomesticacion() {
        return tipoDomesticacion;
    }
    public void setTipoDomesticacion(TipoDomesticacion tipoDomesticacion) {
        this.tipoDomesticacion = tipoDomesticacion;
    }
}
