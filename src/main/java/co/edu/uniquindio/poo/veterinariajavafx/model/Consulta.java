package co.edu.uniquindio.poo.veterinariajavafx.model;
import java.time.LocalDate;


public class Consulta {
    private String numeroConsulta;
    private LocalDate Fecha;
    private Mascota mascota;
    private TipoConsulta TipoConsulto;


    public Consulta(String numeroConsulta, LocalDate fecha, Mascota mascota, TipoConsulta tipoConsulto) {
        this.numeroConsulta = numeroConsulta;
        Fecha = fecha;
        this.mascota = mascota;
        TipoConsulto = tipoConsulto;
    }

    public TipoConsulta getTipoConsulto() {
        return TipoConsulto;
    }

    public void setTipoConsulto(TipoConsulta tipoConsulto) {
        TipoConsulto = tipoConsulto;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public String getNumeroConsulta() {
        return numeroConsulta;
    }

    public void setNumeroConsulta(String numeroConsulta) {
        this.numeroConsulta = numeroConsulta;
    }
}
