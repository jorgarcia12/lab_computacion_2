package ej7;

public class EstacionEsqui {
    private String codigoIdentificativo;
    private String nombre;
    private String personasContacto;
    private String direccion;
    private String telefono;
    private int totalKilometrosEsquiables;
    private int numeroPistas;

    public EstacionEsqui(String codigoIdentificativo, String nombre, String personasContacto, String direccion,
                         String telefono, int totalKilometrosEsquiables, int numeroPistas) {
        this.codigoIdentificativo = codigoIdentificativo;
        this.nombre = nombre;
        this.personasContacto = personasContacto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.totalKilometrosEsquiables = totalKilometrosEsquiables;
        this.numeroPistas = numeroPistas;
    }

    public String getCodigoIdentificativo() {
        return codigoIdentificativo;
    }

    public void setCodigoIdentificativo(String codigoIdentificativo) {
        this.codigoIdentificativo = codigoIdentificativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonasContacto() {
        return personasContacto;
    }

    public void setPersonasContacto(String personasContacto) {
        this.personasContacto = personasContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getTotalKilometrosEsquiables() {
        return totalKilometrosEsquiables;
    }

    public void setTotalKilometrosEsquiables(int totalKilometrosEsquiables) {
        this.totalKilometrosEsquiables = totalKilometrosEsquiables;
    }

    public int getNumeroPistas() {
        return numeroPistas;
    }

    public void setNumeroPistas(int numeroPistas) {
        this.numeroPistas = numeroPistas;
    }
}
