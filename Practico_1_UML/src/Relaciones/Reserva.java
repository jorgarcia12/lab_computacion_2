package Relaciones;

public class Reserva {
    private int num_reserva;
    private int cant_asientos;

    public Reserva (){
    }

    public Reserva(int num_reserva, int cant_asientos) {
        this.num_reserva = num_reserva;
        this.cant_asientos = cant_asientos;
    }

    public int getNum_reserva() {
        return num_reserva;
    }

    public void setNum_reserva(int num_reserva) {
        this.num_reserva = num_reserva;
    }

    public int getCant_asientos() {
        return cant_asientos;
    }

    public void setCant_asientos(int cant_asientos) {
        this.cant_asientos = cant_asientos;
    }
}
