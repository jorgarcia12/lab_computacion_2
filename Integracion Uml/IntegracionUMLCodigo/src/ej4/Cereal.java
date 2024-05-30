package ej4;

import java.util.ArrayList;
import java.util.List;

public class Cereal {
    private TipoCereal tipo;
    private List<Mineral> mineralesRequeridos;

    public Cereal(TipoCereal tipo) {
        this.tipo = tipo;
        this.mineralesRequeridos = new ArrayList<>();
    }

    public void agregarMineralRequerido(Mineral mineral) {
        mineralesRequeridos.add(mineral);
    }

    public boolean sePuedeSembrar(Lote lote) {
        for (Mineral mineral : mineralesRequeridos) {
            if (!lote.contieneMineral(mineral)) {
                return false;
            }
        }
        return true;
    }

    public TipoCereal getTipo() {
        return tipo;
    }
}
