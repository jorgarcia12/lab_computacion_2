package ej6;

import java.util.Date;
import java.util.List;

public class Excursion {
    private int codigo;
    private Date dia;
    private Date hora;
    private List<Alojamiento> alojamientos;
    private List<Visitante> visitantesInscritos;

    public Excursion(int codigo, Date dia, Date hora) {
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
    }

    public List<Alojamiento> getAlojamientos() {
        return alojamientos;
    }

    public List<Visitante> getVisitantesInscritos() {
        return visitantesInscritos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        alojamientos.add(alojamiento);
    }

    public void inscribirVisitante(Visitante visitante) {
        visitantesInscritos.add(visitante);
    }
}
