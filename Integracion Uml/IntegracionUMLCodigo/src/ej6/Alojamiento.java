package ej6;

import java.util.Date;

public class Alojamiento {
    private String nombre;
    private int capacidad;
    private String categoria;
    private int visitantesUtilizados;
    private String habitacion;
    private Date fechaInicio;
    private Date fechaFin;

    public Alojamiento(String nombre, int capacidad, String categoria, int visitantesUtilizados, String habitacion, Date fechaInicio, Date fechaFin) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.visitantesUtilizados = visitantesUtilizados;
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVisitantesUtilizados() {
        return visitantesUtilizados;
    }

    public void setVisitantesUtilizados(int visitantesUtilizados) {
        this.visitantesUtilizados = visitantesUtilizados;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
