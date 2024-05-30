package ej6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParqueNacional {
    private String nombre;
    private Date fechaDeclaracion;
    private Organismo organismoResponsable;
    private List<Area> areas;


    public List<Area> getAreas() {
        return areas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeclaracion() {
        return fechaDeclaracion;
    }

    public void setFechaDeclaracion(Date fechaDeclaracion) {
        this.fechaDeclaracion = fechaDeclaracion;
    }

    public Organismo getOrganismoResponsable() {
        return organismoResponsable;
    }

    public void setOrganismoResponsable(Organismo organismoResponsable) {
        this.organismoResponsable = organismoResponsable;
    }

    public ParqueNacional(String nombre, Date fechaDeclaracion, Organismo organismoResponsable) {
        this.nombre = nombre;
        this.fechaDeclaracion = fechaDeclaracion;
        this.organismoResponsable = organismoResponsable;
        this.areas = new ArrayList<>();
    }

    public void agregarArea(Area area) {
        areas.add(area);
    }
}
