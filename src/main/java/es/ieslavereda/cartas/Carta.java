package es.ieslavereda.cartas;

public class Carta {
    private final Palo palo;
    private final Valor valor;

    public Carta(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public Palo getPalo() {
        return palo;
    }

    public Valor getLetra() {
        return valor;
    }

    @Override
    public String toString() {
        return "Carta{"+ palo +" "+ valor +
                '}' + "\n";
    }
}
