package co.edu.uniquindio.poo.veterinariajavafx.model;

public class Reptil extends Mascota{

    private int temperaturaOptima;
    private NivelPeligro nivelPeligro;
    private TipoHabitat tipoHabitat;

//------------------ CONSTRUCTOR ------------------------
    public Reptil(String id, String nombre, String especie, String raza, int edadMeses, double peso, Propietario propietario, int temperaturaOptima, NivelPeligro nivelPeligro, TipoHabitat tipoHabitat) {
        super(id, nombre, especie, raza, edadMeses, peso, propietario);
        this.temperaturaOptima = temperaturaOptima;
        this.nivelPeligro = nivelPeligro;
        this.tipoHabitat = tipoHabitat;
    }

    //------------------ GET AND SET ------------------------
    public int getTemperaturaOptima() {
        return temperaturaOptima;
    }
    public void setTemperaturaOptima(int temperaturaOptima) {
        this.temperaturaOptima = temperaturaOptima;
    }

    public NivelPeligro getNivelPeligro() {
        return nivelPeligro;
    }
    public void setNivelPeligro(NivelPeligro nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    public TipoHabitat getTipoHabitat() {
        return tipoHabitat;
    }
    public void setTipoHabitat(TipoHabitat tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
}
