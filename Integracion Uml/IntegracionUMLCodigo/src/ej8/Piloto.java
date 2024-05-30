package ej8;

import java.util.List;

public class Piloto extends Persona {
    private String numeroLicencia;
    private List<String> tiposAvionAutorizado;

    public Piloto(String numeroSeguridadSocial, String nombre, String direccion, String telefono,
                  String numeroLicencia, List<String> tiposAvionAutorizado) {
        super(numeroSeguridadSocial, nombre, direccion, telefono);
        this.numeroLicencia = numeroLicencia;
        this.tiposAvionAutorizado = tiposAvionAutorizado;
    }

    public List<String> getTiposAvionAutorizado() {
        return tiposAvionAutorizado;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
}
