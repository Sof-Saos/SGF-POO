import java.util.Date;
public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Date date = new Date();
    private int golesLocal;
    private int golesVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }

    public void registrarResultado(int golesEquipoLocal, int golesEquipoVisitante, Date date) {
        this.golesLocal = golesEquipoLocal;
        this.golesVisitante = golesEquipoVisitante;
        this.date = date;
    }

    public String obtenerResultado() {
        if (golesLocal > golesVisitante) {
            return equipoLocal.getNombreEquipo() + " ganó con: " + golesLocal + " a " + golesVisitante;
        } else if (golesVisitante > golesLocal) {
            return equipoVisitante.getNombreEquipo() + " ganó con: " + golesVisitante + " a " + golesLocal;
        } else {
            return "Empate";
        }
    }
}
