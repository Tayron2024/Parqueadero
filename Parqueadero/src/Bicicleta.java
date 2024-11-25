public class Bicicleta extends Vehiculo {
    private String tipo; // eléctrica o tradicional

    public Bicicleta(String matricula, String modelo, String color, String tipo) {
        super(matricula, modelo, color);
        this.tipo = tipo;
    }

    @Override
    public void registrarEntrada() {
        System.out.println("Bicicleta con matrícula " + getMatricula() + " ha ingresado.");
    }

    @Override
    public void registrarSalida() {
        System.out.println("Bicicleta con matrícula " + getMatricula() + " ha salido.");
    }
}
