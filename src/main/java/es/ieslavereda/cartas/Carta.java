package es.ieslavereda.cartas;

public class Carta {
    private final Palo palo;
    private final Letra letra;

    public Carta(Palo palo, Letra letra) {
        this.palo = palo;
        this.letra = letra;
    }

    public Palo getPalo() {
        return palo;
    }

    public Letra getLetra() {
        return letra;
    }

    @Override
    public String toString() {
        return "Carta{"+ palo +" "+ letra  +
                '}' + "\n";
    }
}
