package es.ieslavereda.cartas;

public enum Valor {
    AS("A",new int[]{1,11}),
    DOS("2",new int[]{2}),
    TRES("3",new int[]{3}),
    CUATRO("4",new int[]{4}),
    CINCO("5",new int[]{5}),
    SEIS("6",new int[]{6}),
    SIETE("7",new int[]{7}),
    OCHO("8",new int[]{8}),
    NUEVE("9",new int[]{9}),
    JOKER("J",new int[]{10}),
    QUEEN("Q",new int[]{10}),
    KING("K",new int[]{10});

    private String caracter;

    private int[] puntuacion;


    Valor(String caracter, int[] puntuacion){
        this.caracter = caracter;
        this.puntuacion = puntuacion;
    }

    public int[] getPuntuacion() {
        return puntuacion;
    }


    @Override
    public String toString() {
        return caracter;
    }
}
