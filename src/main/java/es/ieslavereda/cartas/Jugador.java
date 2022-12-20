package es.ieslavereda.cartas;


import java.util.Arrays;

public class Jugador {

    private String nombre;
    private Carta[] mano;
    private static int num = 1;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new Carta[0];
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        String manoCadena = "";
        for (Carta carta : mano) {
            manoCadena+= carta + " ";
        }
        return "Jugador:" + nombre + "\nCartas:\n " + manoCadena + "\nPuntuación:" +getPuntuacion();
    }

    public void addCarta(Carta carta) {
        Carta[] aux = new Carta[mano.length+1];
        for (int i = 0; i < mano.length; i++) {
            aux[i] = mano[i];
        }
        aux[aux.length-1] = carta;
        mano = aux;
    }

    public int getPuntuacion(){
        return getPuntuacionRecursivo(0,0);
    }
    
    public int getPuntuacionRecursivo(int index, int sum) {
        if (sum>21) return -1;
        if (index>= mano.length)
            return sum;
        if (mano[index].getValor().getPuntuacion().length==1)
            return getPuntuacionRecursivo(index+1,sum+mano[index].getValor().getPuntuacion()[0]);
        
        return Math.max(
                getPuntuacionRecursivo(index+1,sum+mano[index].getValor().getPuntuacion()[0]),
                getPuntuacionRecursivo(index+1,sum+mano[index].getValor().getPuntuacion()[1]));
    }
}
