import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private String direccion;
    private List<Piso> pisos;

    public Parqueadero(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    public Plaza buscarPlazaDisponible(String tipo) {
        for (Piso piso : pisos) {
            for (Plaza plaza : piso.obtenerPlazasDisponibles()) {
                if (plaza.getTipo().equals(tipo) && plaza.getEstado().equals("libre")) {
                    return plaza;
                }
            }
        }
        return null; // Si no hay plazas disponibles
    }

    public void generarReporte() {
        System.out.println("Reporte del Parqueadero: " + nombre);
        for (Piso piso : pisos) {
            System.out.println("Piso " + piso.getNumero() + ":");
            piso.generarReporte();
        }
    }

    public String getNombre() {
        return nombre; // Retorna el nombre del parqueadero
    }
}
