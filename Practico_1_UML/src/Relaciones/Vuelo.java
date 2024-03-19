package Relaciones;

public class Vuelo {
    private String origen;
    private String destino;
    private int num_vuelo;

    public Vuelo() {

    }

    public Vuelo(String origen, String destino, int num_vuelo) {
        this.origen = origen;
        this.destino = destino;
        this.num_vuelo = num_vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getNum_vuelo() {
        return num_vuelo;
    }

    public void setNum_vuelo(int num_vuelo) {
        this.num_vuelo = num_vuelo;
    }
}
