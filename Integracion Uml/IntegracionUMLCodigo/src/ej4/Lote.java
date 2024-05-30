package ej4;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private TipoLote tipo;
    private List<Mineral> minerales;

    public Lote(TipoLote tipo) {
        this.tipo = tipo;
        this.minerales = new ArrayList<>();
    }

    public void agregarMineral(Mineral mineral) {
        minerales.add(mineral);
    }

    public boolean contieneMineral(Mineral mineral) {
        return minerales.contains(mineral);
    }

    public TipoLote getTipo() {
        return tipo;
    }
}

