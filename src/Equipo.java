import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private ArrayList<Jugador> jugadoresEquipo = new ArrayList<>();
    private String entrenador;
    private String estadio;

    public Equipo(String nombreEquipo, String estadio) {
        this.nombreEquipo = nombreEquipo;
        this.jugadoresEquipo = new ArrayList<>();
        this.estadio = estadio;
    }

    //Agregar un jugador al equipo
    public boolean agregarJugador(Jugador jugadorEquipo) {
        if (jugadoresEquipo.size() < 11) {
            jugadoresEquipo.add(jugadorEquipo);
            return true;
        }
        return false;
    }
    public void mostrarInfoEquipo(){
        System.out.println("El equipo " + nombreEquipo + " tiene " + jugadoresEquipo.size() + " jugadores. El entrenador es " + entrenador + " y el estadio en el que entran es: " + estadio);

    }

    //Mostrar los jugadores en el equipo
    public void mostrarJugadores() {
        for (Jugador jugador : jugadoresEquipo) {
            System.out.println("Nombre del jugador: " + jugador.getNombre());
            System.out.println("Edad del jugador " + jugador.getNombre() + ": " + jugador.getEdad());
            System.out.println("Posición del jugador " + jugador.getNombre() + ": " + jugador.getPosicion());
            System.out.println("Número de camiseta: " + jugador.getNombre() + ": " + jugador.getNumCamiseta());
            System.out.println(" ");
        }
        System.out.println("  ");
        System.out.println(" --------------------- ");
    }
    //Asignar un entrenador
    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }
    //Cambiar el estadio del equipo
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }
}
