public abstract class Solicitud {
    protected String id;
    protected String estado; 
    protected Estudiante estudiante; 
    protected String fecha;
    public Solicitud(String id, Estudiante estudiante, String fecha) {
        this.id = id;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.estado = "Pendiente";
    }

    public String getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public String getFecha() {
        return fecha;
    }

    public void registrar() {
        this.estado = "Registrado";
        System.out.println("Solicitud " + id + " registrada.");
    }
    public abstract boolean evaluar();

    public void aprobar() {
        this.estado = "Aprobado";
        System.out.println("Solicitud " + id + " APROBADA.");
    }

    public void rechazar(String motivo) {
        this.estado = "Rechazado";
        System.out.println("Solicitud " + id + " RECHAZADA. Motivo: " + motivo);
    }
}
