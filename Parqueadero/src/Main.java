import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un parqueadero con varios pisos
        Parqueadero parqueadero = new Parqueadero("Central Parking", "Avenida Principal 123");

        // Crear pisos y agregar plazas a cada uno
        Piso piso1 = new Piso(1);
        Piso piso2 = new Piso(2);
        Piso piso3 = new Piso(3);

        // Agregar plazas al piso 1
        piso1.agregarPlaza(new Plaza(101, "automóvil"));
        piso1.agregarPlaza(new Plaza(102, "motocicleta"));
        piso1.agregarPlaza(new Plaza(103, "bicicleta"));

        // Agregar plazas al piso 2
        piso2.agregarPlaza(new Plaza(201, "automóvil"));
        piso2.agregarPlaza(new Plaza(202, "motocicleta"));
        piso2.agregarPlaza(new Plaza(203, "bicicleta"));

        // Agregar plazas al piso 3
        piso3.agregarPlaza(new Plaza(301, "automóvil"));
        piso3.agregarPlaza(new Plaza(302, "motocicleta"));
        piso3.agregarPlaza(new Plaza(303, "bicicleta"));

        // Agregar pisos al parqueadero
        parqueadero.agregarPiso(piso1);
        parqueadero.agregarPiso(piso2);
        parqueadero.agregarPiso(piso3);

        // Configurar la tarifa
        Tarifa tarifa = new Tarifa("general", 3.0); // 3 dólares por hora

        // Interacción con el usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al parqueadero " + parqueadero.getNombre() + "!");
        System.out.println("Por favor, ingrese el tipo de vehículo (automóvil/motocicleta/bicicleta):");
        String tipoVehiculo = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese el número de piso donde desea estacionar (1/2/3):");
        int numeroPiso = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Buscar plaza disponible en el piso seleccionado
        Piso pisoSeleccionado = null;
        switch (numeroPiso) {
            case 1 -> pisoSeleccionado = piso1;
            case 2 -> pisoSeleccionado = piso2;
            case 3 -> pisoSeleccionado = piso3;
            default -> System.out.println("Piso no válido.");
        }

        if (pisoSeleccionado != null) {
            Plaza plazaDisponible = null;
            for (Plaza plaza : pisoSeleccionado.obtenerPlazasDisponibles()) {
                if (plaza.getTipo().equals(tipoVehiculo)) {
                    plazaDisponible = plaza;
                    break;
                }
            }

            if (plazaDisponible != null) {
                System.out.println("Plaza disponible encontrada: Número " + plazaDisponible.getNumero());
                plazaDisponible.reservar(); // Reservar la plaza
            } else {
                System.out.println("Lo sentimos, no hay plazas disponibles para " + tipoVehiculo + " en el piso " + numeroPiso);
                return;
            }

            // Determinar si el usuario es cliente activo o casual
            System.out.println("¿Es usted un cliente activo con suscripción? (sí/no):");
            String esClienteActivo = scanner.nextLine().toLowerCase();

            boolean tieneDescuento = esClienteActivo.equals("sí");
            double descuento = tieneDescuento ? 0.15 : 0.0;

            // Solicitar el tiempo de uso en horas
            System.out.println("Ingrese el tiempo de uso del parqueadero en horas:");
            int horasUso = scanner.nextInt();

            // Calcular el costo
            double costoTotal = tarifa.calcularCosto(horasUso);
            if (tieneDescuento) {
                costoTotal -= costoTotal * descuento; // Aplicar descuento
                System.out.println("¡Se aplicó un descuento del 15% por ser cliente activo!");
            }

            System.out.println("El costo total por " + horasUso + " horas es: $" + costoTotal);
        }

        System.out.println("Gracias por usar el parqueadero. ¡Vuelva pronto!");
    }
}
