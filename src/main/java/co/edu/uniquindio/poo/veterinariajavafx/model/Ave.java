package co.edu.uniquindio.poo.veterinariajavafx.model;

public class Ave extends Mascota{
    private String tipoPlumaje;
    private boolean capacidadVuelo;

//------------------ CONSTRUCTOR ------------------------


    public Ave(String id, String nombre, String especie, String raza, int edadMeses, double peso, Propietario propietario, String tipoPlumaje, boolean capacidadVuelo) {
        super(id, nombre, especie, raza, edadMeses, peso, propietario);
        this.tipoPlumaje = tipoPlumaje;
        this.capacidadVuelo = capacidadVuelo;
    }

    //------------------ GET AND SET ------------------------
    public String getTipoPlumaje() {
        return tipoPlumaje;
    }
    public void setTipoPlumaje(String tipoPlumaje) {
        this.tipoPlumaje = tipoPlumaje;
    }

    public boolean isCapacidadVuelo() {
        return capacidadVuelo;
    }
    public void setCapacidadVuelo(boolean capacidadVuelo) {
        this.capacidadVuelo = capacidadVuelo;
    }

    @Override
    public String getEspecie() {
        return "Ave";
    }
}
