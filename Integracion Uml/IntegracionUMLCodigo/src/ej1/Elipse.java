package ej1;

public abstract class Elipse extends Figura {
    private double ejeMayor;
    private double ejeMenor;

    public Elipse(double ejeMayor, double ejeMenor) {
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    }

    public double getEjeMayor() {
        return ejeMayor;
    }

    public void setEjeMayor(double ejeMayor) {
        this.ejeMayor = ejeMayor;
    }

    public double getEjeMenor() {
        return ejeMenor;
    }

    public void setEjeMenor(double ejeMenor) {
        this.ejeMenor = ejeMenor;
    }
}
