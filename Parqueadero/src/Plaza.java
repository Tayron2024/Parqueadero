public class Plaza {
    private int numero;
    private String tipo; // automóvil, motocicleta, bicicleta
    private String estado; // libre, ocupada

    public Plaza(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = "libre"; // Inicialmente libre
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void reservar() {
        estado = "ocupada";
    }

    public void liberar() {
        estado = "libre";
    }
}
