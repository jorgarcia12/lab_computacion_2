package ej4;

public class Main {
    public static void main(String[] args) {
        // Creamos un lote
        Lote lote = new Lote(TipoLote.ESPECIAL);
        lote.agregarMineral(new Mineral(TipoMineral.PRIMARIO));

        // Creamos una instancia de la cooperativa
        Cooperativa cooperativa = new Cooperativa();

        // Asesoramos sobre qué cereal sembrar en el lote
        Cereal cerealRecomendado = cooperativa.asesorarCereal(lote);

        if (cerealRecomendado != null) {
            System.out.println("Se recomienda sembrar el cereal de tipo: " + cerealRecomendado.getTipo());
        } else {
            System.out.println("No se encontró ningún cereal adecuado para sembrar en este lote.");
        }
    }
}
