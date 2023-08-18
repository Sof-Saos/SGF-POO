import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Instancia de equipos
        Equipo nacional = new Equipo("Atlético Nacional", "Atanasio Girardot");
        Equipo medellin = new Equipo("Independiente medellín", "Cincuentenario");
        Equipo millos = new Equipo("Millonarios", "El Campín");
        Equipo cucuta = new Equipo("Cúcuta Deportivo", "General Santander");

        // Instancias para el equipo "Independiente Nacional"
        Jugador jugadorNacional1 = new Jugador("Juan Pérez", 25, "Delantero", 9, "Regate, Tiros precisos");
        Jugador jugadorNacional2 = new Jugador("Carlos Gómez", 28, "Defensor", 5, "Marcaje, Fuerza");
        Jugador jugadorNacional3 = new Jugador("Neymar Jr.", 29, "Delantero", 10, "Dribbling, Creatividad");
        Jugador jugadorNacional4 = new Jugador("Sergio Ramos", 35, "Defensor", 4, "Liderazgo, Juego aéreo");
        Jugador jugadorNacional5 = new Jugador("Kevin De Bruyne", 30, "Centrocampista", 17, "Pases precisos, Visión de juego");
        Jugador jugadorNacional6 = new Jugador("Virgil van Dijk", 30, "Defensor", 4, "Marcaje, Fuerza");
        Jugador jugadorNacional7 = new Jugador("Kylian Mbappé", 22, "Delantero", 7, "Rapidez, Regate");
        Jugador jugadorNacional8 = new Jugador("Joshua Kimmich", 26, "Centrocampista", 6, "Versatilidad, Trabajo duro");

        // Instancias para el equipo "Independiente Medellín"
        Jugador jugadorMed1 = new Jugador("Andrés Rodríguez", 24, "Delantero", 11, "Velocidad, Remates potentes");
        Jugador jugadorMed2 = new Jugador("Luis González", 27, "Centrocampista", 8, "Pases precisos, Creatividad");
        Jugador jugadorMed3 = new Jugador("Lionel Messi", 34, "Delantero", 10, "Regate, Tiros precisos");
        Jugador jugadorMed4 = new Jugador("Cristiano Ronaldo", 36, "Delantero", 7, "Velocidad, Remates potentes");
        Jugador jugadorMed5 = new Jugador("Pepito Pérez", 24, "Defensor", 7, "Muy charrito");
        Jugador jugadorMed6 = new Jugador("Miguelito Suarez", 27, "Centrocampista", 2, "Cool");
        Jugador jugadorMed7 = new Jugador("Wilhelm of Sweden", 19, "Defensor", 4, "Fuerte y habil en la cancha");
        Jugador jugadorMed8 = new Jugador("Simon Eriksson", 18, "Portero", 6, "Rápido y veloz");

        //Instancias para el equipo "Millonarios"
        Jugador jugadorMillos1 = new Jugador("Diego Armando", 24, "Delantero", 9, "Regate, Tiros precisos");
        Jugador jugadorMillos2 = new Jugador("Federico García", 28, "Defensor", 5, "Marcaje, Fuerza");
        Jugador jugadorMillos3 = new Jugador("Lucas Martínez", 29, "Delantero", 10, "Dribbling, Creatividad");
        Jugador jugadorMillos4 = new Jugador("Sebastián Sánchez", 35, "Defensor", 4, "Liderazgo, Juego aéreo");
        Jugador jugadorMillos5 = new Jugador("Matías Silva", 30, "Centrocampista", 17, "Pases precisos, Visión de juego");
        Jugador jugadorMillos6 = new Jugador("Alex Rodríguez", 27, "Defensor", 23, "Intercepciones, Salida con balón");
        Jugador jugadorMillos7 = new Jugador("Gabriel Fernández", 22, "Delantero", 7, "Rapidez, Regate");
        Jugador jugadorMillos8 = new Jugador("Eduardo Pérez", 26, "Centrocampista", 6, "Versatilidad, Trabajo duro");

        //Instancias para el equipo "Cucuta deportivo"
        Jugador jugadorCucuta1 = new Jugador("Manuel Torres", 24, "Delantero", 11, "Velocidad, Remates potentes");
        Jugador jugadorCucuta2 = new Jugador("Luis Morales", 27, "Centrocampista", 8, "Pases precisos, Creatividad");
        Jugador jugadorCucuta3 = new Jugador("Gustavo Lobo", 34, "Delantero", 12, "Regate, Tiros precisos");
        Jugador jugadorCucuta4 = new Jugador("Pedro Oliveira", 36, "Delantero", 13, "Velocidad, Remates potentes");
        Jugador jugadorCucuta5 = new Jugador("Sebastián Martínez", 24, "Defensor", 14, "Buen marcaje, Excelente comunicación");
        Jugador jugadorCucuta6 = new Jugador("Miguel López", 27, "Centrocampista", 15, "Control de balón, Visionario");
        Jugador jugadorCucuta7 = new Jugador("Oscar Svensson", 19, "Defensor", 16, "Fuerte y hábil en la cancha");
        Jugador jugadorCucuta8 = new Jugador("Simon Eriksson", 18, "Portero", 18, "Ágil y con buenos reflejos");

        //añadir los jugadores a los equipos
        nacional.agregarJugador(jugadorNacional1);
        nacional.agregarJugador(jugadorNacional2);
        nacional.agregarJugador(jugadorNacional3);
        nacional.agregarJugador(jugadorNacional4);
        nacional.agregarJugador(jugadorNacional5);
        nacional.agregarJugador(jugadorNacional6);
        nacional.agregarJugador(jugadorNacional7);
        nacional.agregarJugador(jugadorNacional8);

        medellin.agregarJugador(jugadorMed1);
        medellin.agregarJugador(jugadorMed2);
        medellin.agregarJugador(jugadorMed3);
        medellin.agregarJugador(jugadorMed4);
        medellin.agregarJugador(jugadorMed5);
        medellin.agregarJugador(jugadorMed6);
        medellin.agregarJugador(jugadorMed7);
        medellin.agregarJugador(jugadorMed8);

        millos.agregarJugador(jugadorMillos1);
        millos.agregarJugador(jugadorMillos2);
        millos.agregarJugador(jugadorMillos3);
        millos.agregarJugador(jugadorMillos4);
        millos.agregarJugador(jugadorMillos5);
        millos.agregarJugador(jugadorMillos6);
        millos.agregarJugador(jugadorMillos7);
        millos.agregarJugador(jugadorMillos8);

        cucuta.agregarJugador(jugadorCucuta1);
        cucuta.agregarJugador(jugadorCucuta2);
        cucuta.agregarJugador(jugadorCucuta3);
        cucuta.agregarJugador(jugadorCucuta4);
        cucuta.agregarJugador(jugadorCucuta5);
        cucuta.agregarJugador(jugadorCucuta6);
        cucuta.agregarJugador(jugadorCucuta7);
        cucuta.agregarJugador(jugadorCucuta8);

        //Poner entrenador
        nacional.setEntrenador("Pep Guardiola");
        medellin.setEntrenador("Jurgen Klopp");
        millos.setEntrenador("Tite");
        cucuta.setEntrenador("Luis Miguel");

        Scanner sc = new Scanner(System.in);
        int opcion;
        String nuevoNombre;

        do {
            System.out.println("1. Mostrar información de los equipos");
            System.out.println("2. Mostrar info de los jugadores de cada equipo");
            System.out.println("3. Agregar jugadores a los equipos");
            System.out.println("4. Ver resultadose de los partidos");
            System.out.println("5. Asignar entrenador al Nacional");
            System.out.println("6. Asignar entrenador al Ind Medellín");
            System.out.println("7. Asignar entrenador a Millonarios");
            System.out.println("8. Asignar entrenador al Cúcuta Deportivo");
            System.out.println("0. Salir del programa.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    nacional.mostrarInfoEquipo();
                    medellin.mostrarInfoEquipo();
                    millos.mostrarInfoEquipo();
                    cucuta.mostrarInfoEquipo();
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Nacional");
                    nacional.mostrarJugadores();
                    System.out.println("Ind Medellín");
                    medellin.mostrarJugadores();
                    System.out.println("Millonarios");
                    millos.mostrarJugadores();
                    System.out.println("Cúcuta Deportivo");
                    cucuta.mostrarJugadores();
                    System.out.println(" ");
                    break;
                case 3:
                    Jugador jugadorNacional9 = new Jugador("Matías Ramírez", 26, "Centrocampista", 22, "Control de balón, Pases precisos");
                    Jugador jugadorNacional10 = new Jugador("Leonardo Vargas", 29, "Delantero", 18, "Regate, Agilidad");
                    Jugador jugadorNacional11 = new Jugador("Sebastián Mendoza", 24, "Defensor", 3, "Marcaje, Fuerza");

                    Jugador jugadorMed9 = new Jugador("Andrés Rojas", 28, "Centrocampista", 20, "Visión de juego, Creatividad");
                    Jugador jugadorMed10 = new Jugador("Felipe Gómez", 25, "Delantero", 19, "Remates potentes, Rapidez");
                    Jugador jugadorMed11 = new Jugador("Daniel Soto", 30, "Centrocampista", 16, "Control de balón, Regate");

                    Jugador jugadorMillos9 = new Jugador("Lucas Fernández", 27, "Defensor", 25, "Intercepciones, Salida con balón");
                    Jugador jugadorMillos10 = new Jugador("Carlos Rodríguez", 24, "Centrocampista", 21, "Pases precisos, Versatilidad");
                    Jugador jugadorMillos11 = new Jugador("Andrés Torres", 28, "Defensor", 22, "Marcaje, Fuerza");

                    Jugador jugadorCucuta9 = new Jugador("Felipe Mendoza", 24, "Centrocampista", 23, "Visión de juego, Creatividad");
                    Jugador jugadorCucuta10 = new Jugador("Santiago Vélez", 26, "Delantero", 14, "Regate, Agilidad");
                    Jugador jugadorCucuta11 = new Jugador("Ricardo Gómez", 27, "Centrocampista", 26, "Control de balón, Pases precisos");

                    nacional.agregarJugador(jugadorNacional9);
                    nacional.agregarJugador(jugadorNacional10);
                    nacional.agregarJugador(jugadorNacional11);

                    medellin.agregarJugador(jugadorMed9);
                    medellin.agregarJugador(jugadorMed10);
                    medellin.agregarJugador(jugadorMed11);

                    millos.agregarJugador(jugadorMillos9);
                    millos.agregarJugador(jugadorMillos10);
                    millos.agregarJugador(jugadorMillos11);

                    cucuta.agregarJugador(jugadorCucuta9);
                    cucuta.agregarJugador(jugadorCucuta10);
                    cucuta.agregarJugador(jugadorCucuta11);
                    break;
                case 4:
                    //Instancia de partidos
                    Date fechaHoraPartido = new Date();
                    Partido partido1 = new Partido(nacional, millos);
                    Partido partido2 = new Partido(cucuta, medellin);
                    //Registramos los partidos
                    partido1.registrarResultado(3,2, fechaHoraPartido);
                    partido2.registrarResultado(1, 0, fechaHoraPartido);

                    String resultadoPartido1 = partido1.obtenerResultado();
                    String resultadoPartido2 = partido2.obtenerResultado();

                    System.out.println("Resultado del partido 1: " + resultadoPartido1);
                    System.out.println("Resultado del partido 2: " + resultadoPartido2);
                    System.out.println(" ");
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del entrenador: ");
                    nuevoNombre = sc.nextLine();
                    nacional.setEntrenador(nuevoNombre);
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del entrenador: ");
                    nuevoNombre = sc.nextLine();
                    medellin.setEntrenador(nuevoNombre);
                    break;
                case 7:
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del entrenador: ");
                    nuevoNombre = sc.nextLine();
                    millos.setEntrenador(nuevoNombre);
                    break;
                case 8:
                    sc.nextLine();
                    System.out.print("Ingrese el nombre del entrenador: ");
                    nuevoNombre = sc.nextLine();
                    cucuta.setEntrenador(nuevoNombre);
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese un numero correcto");
                    break;
            }
        } while (opcion != 0);
    }
}