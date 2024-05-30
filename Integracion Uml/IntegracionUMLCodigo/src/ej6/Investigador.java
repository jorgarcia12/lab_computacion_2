package ej6;

import java.util.List;
import java.util.ArrayList;

public class Investigador {
    private String titulacion;
    private List<ProyectoInvestigacion> proyectosInvestigacion;

    public Investigador(String titulacion, List<ProyectoInvestigacion> proyectosInvestigacion) {
        this.titulacion = titulacion;
        this.proyectosInvestigacion = proyectosInvestigacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public List<ProyectoInvestigacion> getProyectosInvestigacion() {
        return proyectosInvestigacion;
    }

    public Investigador(String titulacion) {
        this.titulacion = titulacion;
        this.proyectosInvestigacion = new ArrayList<>();
    }

    public void agregarProyectoInvestigacion(ProyectoInvestigacion proyecto) {
        proyectosInvestigacion.add(proyecto);
    }
}
