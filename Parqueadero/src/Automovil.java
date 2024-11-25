public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String matricula, String modelo, String color, int numeroPuertas) {
        super(matricula, modelo, color);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Automóvil con matrícula " + getMatricula() + " ha ingresado.");
    }

    @Override
    public void registrarSalida() {
        System.out.println("Automóvil con matrícula " + getMatricula() + " ha salido.");
    }
}
