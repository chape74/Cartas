package es.ieslavereda.cartas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private Carta[] carta;

    public Baraja(){
        carta = new Carta[Palo.values().length*Valor.values().length];
        int j = 0;
        for (Palo palo : Palo.values()){
            for (Valor valor : Valor.values()) {
                carta[j++] = new Carta(palo, valor);
            }
        }
    }

    public Carta showFirstCard(){
        if (carta.length>0)
            return carta[0];
        else
            return null;
    }

    public Carta showLastCard(){
        if (carta.length>0) return carta[carta.length-1];
        return null;
    }

    public Carta getLastCard() {
        if (carta.length == 0)
            return null;
        Carta cartaDevolver = showLastCard();
        Carta[] aux = new Carta[carta.length-1];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = carta[i];
        }
        carta = aux;
        return cartaDevolver;
    }

    public Carta getFirstCard() {
        if (carta.length == 0)
            return null;
        Carta cartaDevolver = showFirstCard();
        Carta[] aux = new Carta[carta.length-1];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = carta[i+1];
        }
        carta = aux;
        return cartaDevolver;
    }

    public void shuffle() {
        List<Carta> cartaList = Arrays.asList(carta);
        Collections.shuffle(cartaList);
        cartaList.toArray(carta);
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" +"\n"+ Arrays.toString(carta);
    }
}
