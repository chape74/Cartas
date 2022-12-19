package es.ieslavereda.cartas;


public class Jugador {

    private String nombre;
    private Carta[] mano;
    public int num = 1;

    public Jugador() {
        this.nombre = "Jugador "+num++;
        this.mano = new Carta[0];
    }
}
