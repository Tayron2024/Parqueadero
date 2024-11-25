public abstract class Usuario {
    private String nombre;
    private String identificacion;
    private String contacto;

    public Usuario(String nombre, String identificacion, String contacto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
    }
}
