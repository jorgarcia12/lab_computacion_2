package ej7;

import java.util.List;

public class EquipoEsqui {
    private String codigo;
    private String entrenador;
    private List<String> esquiadores;

    public EquipoEsqui(String codigo, String entrenador, List<String> esquiadores) {
        this.codigo = codigo;
        this.entrenador = entrenador;
        this.esquiadores = esquiadores;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<String> getEsquiadores() {
        return esquiadores;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
}
