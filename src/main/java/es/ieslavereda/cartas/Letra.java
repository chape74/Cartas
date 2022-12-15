package es.ieslavereda.cartas;

public enum Letra {
    AS("A"),
    DOS("2"),
    TRES("3"),
    CUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SIETE("7"),
    OCHO("8"),
    NUEVE("9"),
    JOKER("J"),
    QUEEN("Q"),
    KING("K");

    private final String letra;

    Letra(String letra){
        this.letra = letra;
    }

    @Override
    public String toString() {
        return letra;
    }
}
