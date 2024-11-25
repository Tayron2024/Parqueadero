public class Cliente extends Usuario {
    private String metodoPago;

    public Cliente(String nombre, String identificacion, String contacto, String metodoPago) {
        super(nombre, identificacion, contacto);
        this.metodoPago = metodoPago;
    }
}
