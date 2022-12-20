package es.ieslavereda.cartas;

public class Game {

    private Baraja baraja;
    private Jugador[] jugadores;
    private final Jugador pc;

    public Game(Jugador[] jugadores) {
        this.baraja = new Baraja();
        this.jugadores = jugadores;
        pc = new Jugador("PC");
    }

    public void start() {
        baraja.shuffle();
        for ( Jugador player : jugadores) {
            juegaJugador(player);
        }
        juegaPC();
        mostrarGanador();
    }

    public void juegaJugador(Jugador jugador) {
        do {
            jugador.addCarta(baraja.getLastCard());
            System.out.println(jugador);
            if (jugador.getPuntuacion()<0) {
                System.out.println("te pasaste!");
                break;
            }
            System.out.println("quieres otra carta? si/no");
        } while (Inputs.pedir());
    }

    public void juegaPC() {
        do {
            pc.addCarta(baraja.getLastCard());
            System.out.println(pc);
            if (pc.getPuntuacion()<0) {
                System.out.println("la banca se paso!");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                throw new RuntimeException();
            };

        } while (pc.getPuntuacion()<maxPuntuacion());
    }

    private int maxPuntuacion() {
        int maxPuntuacion = -2;
        for (Jugador player :jugadores) {
            if(player.getPuntuacion()>maxPuntuacion) {
                maxPuntuacion = player.getPuntuacion();
            }
        }
        return maxPuntuacion;
    }

    public void mostrarGanador(){
        int maxPuntuacion = -2;
        String nombreGanador = "";
        for (Jugador player :jugadores) {
            if(player.getPuntuacion()>maxPuntuacion) {
                maxPuntuacion = player.getPuntuacion();
                nombreGanador = player.getNombre();
            }
        }
        if(maxPuntuacion<=pc.getPuntuacion()) {
            nombreGanador = pc.getNombre();
        }
        System.out.println("Y el ganador es... " + nombreGanador + "!");
    }
}
