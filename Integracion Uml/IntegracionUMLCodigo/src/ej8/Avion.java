package ej8;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Avion {
    private String matricula;
    private String tipo;
    private Hangar hangar;
    private Propietario propietario;
    private Date fechaAdquisicion;
    private List<Servicio> serviciosRealizados;

    public Avion(String matricula, String tipo, Hangar hangar, Propietario propietario, Date fechaAdquisicion) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.hangar = hangar;
        this.propietario = propietario;
        this.fechaAdquisicion = fechaAdquisicion;
        this.serviciosRealizados = new ArrayList<>();
    }

    public List<Servicio> getServiciosRealizados() {
        return serviciosRealizados;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Hangar getHangar() {
        return hangar;
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

}
