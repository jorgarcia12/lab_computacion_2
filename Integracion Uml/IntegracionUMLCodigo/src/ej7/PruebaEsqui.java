package ej7;

import javax.xml.crypto.Data;
import java.util.Date;

public class PruebaEsqui {
    private String nombre;
    private String tipo;
    private Date fechaInicio;
    private Date fechaFin;
    private String vencedor;
    private double tiempoVencedor;

    public PruebaEsqui(String nombre, String tipo, Date fechaInicio, Date fechaFin, String vencedor, double tiempoVencedor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.vencedor = vencedor;
        this.tiempoVencedor = tiempoVencedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public double getTiempoVencedor() {
        return tiempoVencedor;
    }

    public void setTiempoVencedor(double tiempoVencedor) {
        this.tiempoVencedor = tiempoVencedor;
    }
}
