import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int numero;
    private List<Plaza> plazas;

    public Piso(int numero) {
        this.numero = numero;
        this.plazas = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void agregarPlaza(Plaza plaza) {
        plazas.add(plaza);
    }

    public List<Plaza> obtenerPlazasDisponibles() {
        List<Plaza> disponibles = new ArrayList<>();
        for (Plaza plaza : plazas) {
            if (plaza.getEstado().equals("libre")) {
                disponibles.add(plaza);
            }
        }
        return disponibles;
    }

    public void generarReporte() {
        for (Plaza plaza : plazas) {
            System.out.println("Plaza " + plaza.getNumero() + " - Estado: " + plaza.getEstado());
        }
    }
}
