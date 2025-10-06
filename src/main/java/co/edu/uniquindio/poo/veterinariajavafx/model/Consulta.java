package co.edu.uniquindio.poo.veterinariajavafx.model;
import java.time.LocalDate;


public class Consulta {
    private String numeroConsulta;
    private LocalDate Fecha;

    private Mascota mascota;
    private TipoConsulta tipoConsulta;

//------------------ CONSTRUCTOR ------------------------
    public Consulta(String numeroConsulta, LocalDate fecha, Mascota mascota, TipoConsulta tipoConsulta) {
        this.numeroConsulta = numeroConsulta;
        Fecha = fecha;
        this.mascota = mascota;
        this.tipoConsulta = tipoConsulta;
    }
//------------------ GET AND SET ------------------------
    public String getNumeroConsulta() {
        return numeroConsulta;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public Mascota getMascota() {
        return mascota;
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public TipoConsulta getTipoConsulta() {
        return tipoConsulta;
    }
    public void setTipoConsulta(TipoConsulta tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
}
