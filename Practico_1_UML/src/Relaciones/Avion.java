package Relaciones;

public class Avion {
    private int capacidad;
    private String modelo;
    private Vuelo v1;

    public Avion() {

    }

    public Avion(int capacidad, String modelo, Vuelo v1) {
        this.capacidad = capacidad;
        this.modelo = modelo;
    }



    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void despegar(){
        System.out.println("Despegando....");
    }
    public void aterrizar(){
        System.out.println("Aterrizando el avion");
    }
}
