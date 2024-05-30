package ej6;

import java.util.ArrayList;
import java.util.List;

public class Especie {
    private String nombreCientifico;
    private String nombreVulgar;
    private int numeroIndividuos;
    private boolean tieneFloracion;
    private String periodoFloracion;
    private String periodoCelo;
    private TipoAlimentacion tipoAlimentacion;
    private List<Especie> alimentos; // Lista de especies que sirven de alimento

    public Especie(String nombreCientifico, String nombreVulgar, int numeroIndividuos, boolean tieneFloracion,
                   String periodoFloracion, String periodoCelo, TipoAlimentacion tipoAlimentacion) {
        this.nombreCientifico = nombreCientifico;
        this.nombreVulgar = nombreVulgar;
        this.numeroIndividuos = numeroIndividuos;
        this.tieneFloracion = tieneFloracion;
        this.periodoFloracion = periodoFloracion;
        this.periodoCelo = periodoCelo;
        this.tipoAlimentacion = tipoAlimentacion;
        this.alimentos = new ArrayList<>();
    }


    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public int getNumeroIndividuos() {
        return numeroIndividuos;
    }

    public void setNumeroIndividuos(int numeroIndividuos) {
        this.numeroIndividuos = numeroIndividuos;
    }

    public boolean isTieneFloracion() {
        return tieneFloracion;
    }

    public void setTieneFloracion(boolean tieneFloracion) {
        this.tieneFloracion = tieneFloracion;
    }

    public String getPeriodoFloracion() {
        return periodoFloracion;
    }

    public void setPeriodoFloracion(String periodoFloracion) {
        this.periodoFloracion = periodoFloracion;
    }

    public String getPeriodoCelo() {
        return periodoCelo;
    }

    public void setPeriodoCelo(String periodoCelo) {
        this.periodoCelo = periodoCelo;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(TipoAlimentacion tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public List<Especie> getAlimentos() {
        return alimentos;
    }

    public void agregarAlimento(Especie especie) {
        alimentos.add(especie);
    }
}
