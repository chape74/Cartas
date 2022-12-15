package es.ieslavereda.cartas;

import java.util.Arrays;

public class Baraja {

    private final Carta[] carta;

    public Baraja(){
        carta = new Carta[48];
        int j = 0;
        for (Palo palo : Palo.values()){
            for (Letra numero : Letra.values()) {
                carta[j++] = new Carta(palo,numero);
            }
        }
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" +"\n"+ Arrays.toString(carta);
    }
}
