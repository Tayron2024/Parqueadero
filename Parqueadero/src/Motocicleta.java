public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String matricula, String modelo, String color, int cilindrada) {
        super(matricula, modelo, color);
        this.cilindrada = cilindrada;
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Motocicleta con matrícula " + getMatricula() + " ha ingresado.");
    }

    @Override
    public void registrarSalida() {
        System.out.println("Motocicleta con matrícula " + getMatricula() + " ha salido.");
    }
}
