package es.ieslavereda.cartas;

import java.util.Arrays;

public class Baraja {
    private String[] palo = {"oros","bastos","espadas","copas"};
    private int numero;
    private Carta[] carta;

    public Baraja(){
        carta = new Carta[48];
        int j = 0;
        for (String palo : this.palo){
            for (int i = 1; i <= 12; i++) {
                carta[j++] = new Carta(palo,i);
            }
        }
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "cartas=" + Arrays.toString(carta) +
                '}';
    }
}
