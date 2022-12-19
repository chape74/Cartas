package es.ieslavereda.cartas;

public class Main {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.shuffle();

        System.out.println(baraja);
        System.out.println(baraja.getFirstCard());
        System.out.println(baraja);

    }
}