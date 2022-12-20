package es.ieslavereda.cartas;

public class Main {

    public static void main(String[] args) {


        System.out.println("dime cuantos jugadores");
        Jugador[] jugadores = new Jugador[Inputs.askNum()];
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println("Jugador " + (i+1) + ", cual es tu nombre?");
            jugadores[i] = new Jugador(Inputs.askName());
        }
        Game jugada = new Game(jugadores);
        jugada.start();



    }

}
