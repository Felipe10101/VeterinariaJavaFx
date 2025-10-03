package co.edu.uniquindio.poo.veterinariajavafx.model;

public class Gato extends Mascota{


    private int cantidadHorrasSuenio;
    private String nivelIndependencia;
    private TipoDomesticacion tipoDomesticacion;

    public Gato(String id, String nombre, String especie, String raza, int edad, int peso, Propietario propietario, int cantidadHorrasSuenio, String nivelIndependencia, TipoDomesticacion tipoDomesticacion) {
        super(id, nombre, especie, raza, edad, peso, propietario);
        this.cantidadHorrasSuenio = cantidadHorrasSuenio;
        this.nivelIndependencia = nivelIndependencia;
        this.tipoDomesticacion = tipoDomesticacion;
    }

    public int getCantidadHorrasSuenio() {
        return cantidadHorrasSuenio;
    }

    public void setCantidadHorrasSuenio(int cantidadHorrasSuenio) {
        this.cantidadHorrasSuenio = cantidadHorrasSuenio;
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
