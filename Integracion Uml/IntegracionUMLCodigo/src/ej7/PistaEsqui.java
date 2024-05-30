package ej7;

public class PistaEsqui {
    private String codigoEstacion;
    private int numeroPista;
    private double longitudKilometros;
    private DificultadPista dificultad;

    public PistaEsqui(String codigoEstacion, int numeroPista, double longitudKilometros, DificultadPista dificultad) {
        this.codigoEstacion = codigoEstacion;
        this.numeroPista = numeroPista;
        this.longitudKilometros = longitudKilometros;
        this.dificultad = dificultad;
    }

    public String getCodigoEstacion() {
        return codigoEstacion;
    }

    public void setCodigoEstacion(String codigoEstacion) {
        this.codigoEstacion = codigoEstacion;
    }

    public int getNumeroPista() {
        return numeroPista;
    }

    public void setNumeroPista(int numeroPista) {
        this.numeroPista = numeroPista;
    }

    public double getLongitudKilometros() {
        return longitudKilometros;
    }

    public void setLongitudKilometros(double longitudKilometros) {
        this.longitudKilometros = longitudKilometros;
    }

    public DificultadPista getDificultad() {
        return dificultad;
    }

    public void setDificultad(DificultadPista dificultad) {
        this.dificultad = dificultad;
    }
}
