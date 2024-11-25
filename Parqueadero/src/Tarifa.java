public class Tarifa {
    private String tipoVehiculo;
    private double precioPorHora;

    public Tarifa(String tipoVehiculo, double precioPorHora) {
        this.tipoVehiculo = tipoVehiculo;
        this.precioPorHora = precioPorHora;
    }

    public double calcularCosto(int horas) {
        return horas * precioPorHora;
    }
}
