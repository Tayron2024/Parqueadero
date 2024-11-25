import java.util.Date;

public class Reserva {
    private String id;
    private Plaza plaza;
    private Cliente cliente;
    private Date fechaHoraInicio;
    private Date fechaHoraFin;

    public Reserva(String id, Plaza plaza, Cliente cliente, Date fechaHoraInicio, Date fechaHoraFin) {
        this.id = id;
        this.plaza = plaza;
        this.cliente = cliente;
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
    }

    public void confirmar() {
        plaza.reservar();
        System.out.println("Reserva confirmada: ID " + id);
    }

    public void cancelar() {
        plaza.liberar();
        System.out.println("Reserva cancelada: ID " + id);
    }
}
