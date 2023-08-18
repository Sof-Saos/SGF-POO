public class Jugador {
    private String nombre;
    private int edad;
    private String posicion;
    private String habilidades;
    private int numCamiseta;

    public Jugador(String nombre, int edad, String posicion, int numCamiseta, String habilidades) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.numCamiseta = numCamiseta;
        this.habilidades = habilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public String getPosicion() {
        return posicion;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }
}
