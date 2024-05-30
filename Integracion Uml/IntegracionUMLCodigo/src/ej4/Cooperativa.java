package ej4;

import java.util.ArrayList;
import java.util.List;

public class Cooperativa {

    public Cereal asesorarCereal(Lote lote) {
        List<Cereal> cerealesDisponibles = obtenerCerealesDisponibles();
        for (Cereal cereal : cerealesDisponibles) {
            if (cereal.sePuedeSembrar(lote)) {
                return cereal;
            }
        }
        return null;
    }

    private List<Cereal> obtenerCerealesDisponibles() {
        List<Cereal> cereales = new ArrayList<>();

        Cereal girasol = new Cereal(TipoCereal.GRANOS_COSECHA_GRUESA);
        girasol.agregarMineralRequerido(new Mineral(TipoMineral.PRIMARIO));
        cereales.add(girasol);
        return cereales;
    }
}

