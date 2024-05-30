package ej8;

import java.util.List;

public class Mecanico extends Persona {
    private double salario;
    private String turno;
    private List<String> tiposAvionMantenimiento;

    public Mecanico(String numeroSeguridadSocial, String nombre, String direccion, String telefono,
                    double salario, String turno, List<String> tiposAvionMantenimiento) {
        super(numeroSeguridadSocial, nombre, direccion, telefono);
        this.salario = salario;
        this.turno = turno;
        this.tiposAvionMantenimiento = tiposAvionMantenimiento;
    }

    public List<String> getTiposAvionMantenimiento() {
        return tiposAvionMantenimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
