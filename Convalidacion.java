public class Convalidacion {

    private Curso curso;
    private String estado;
    private int similitud;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSimilitud() {
        return similitud;
    }

    public void setSimilitud(int similitud) {
        this.similitud = similitud;
    }

    public void registrarSolicitud() {
        System.out.println("Solicitud registrada para el curso: " + curso.getNombre());
        this.estado = "Registrado";
    }

    public boolean evaluarSolicitud() {
        return similitud >= 70;
    }

    public void aprobarConvalidacion() {
        this.estado = "Aprobado";
        System.out.println("Convalidación aprobada del curso: " + curso.getNombre());
    }

    public void rechazarConvalidacion(String motivo) {
        this.estado = "Rechazado";
        System.out.println("Convalidación rechazada. Motivo: " + motivo);
    }
}
