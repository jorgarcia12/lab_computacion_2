package Relaciones;

public class Piloto extends Persona{
    private String compania;
    private int id;

    public Piloto (){

    }

    public Piloto(int edad, String nombre, String apellido, String compania, int id) {
        super(edad, nombre, apellido);
        this.compania = compania;
        this.id = id;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
