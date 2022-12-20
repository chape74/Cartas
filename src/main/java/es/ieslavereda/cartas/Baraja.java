package es.ieslavereda.cartas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private Carta[] cartas;

    public Baraja(){
        cartas = new Carta[Palo.values().length*Valor.values().length];
        int j = 0;
        for (Palo palo : Palo.values()){
            for (Valor valor : Valor.values()) {
                cartas[j++] = new Carta(palo, valor);
            }
        }
    }

    public Carta showFirstCard(){
        if (cartas.length>0)
            return cartas[0];
        else
            return null;
    }

    public Carta showLastCard(){
        if (cartas.length>0) return cartas[cartas.length-1];
        return null;
    }

    public Carta getLastCard() {
        if (cartas.length == 0)
            return null;
        Carta cartaDevolver = showLastCard();
        Carta[] aux = new Carta[cartas.length-1];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = cartas[i];
        }
        cartas = aux;
        return cartaDevolver;
    }

    public Carta getFirstCard() {
        if (cartas.length == 0)
            return null;
        Carta cartaDevolver = showFirstCard();
        Carta[] aux = new Carta[cartas.length-1];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = cartas[i+1];
        }
        cartas = aux;
        return cartaDevolver;
    }

    public void shuffle() {
        List<Carta> cartaList = Arrays.asList(cartas);
        Collections.shuffle(cartaList);
        cartaList.toArray(cartas);
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" +"\n"+ Arrays.toString(cartas);
    }
}
