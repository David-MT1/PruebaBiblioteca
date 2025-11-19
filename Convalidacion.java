public class Convalidacion extends Solicitud {
    private Curso curso;
    private int similitud; 
    public Convalidacion(String id, Estudiante estudiante, String fecha, Curso curso, int similitud) {
        super(id, estudiante, fecha);
        this.curso = curso;
        this.similitud = similitud;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public int getSimilitud() {
        return similitud;
    }
    public void setSimilitud(int similitud) {
        this.similitud = similitud;
    }
    @Override
    public void registrar() {
        super.registrar();
        System.out.println("Solicitud de convalidación registrada para el curso: " + curso.getNombre());
    }
    @Override
    public boolean evaluar() {
        return similitud >= 70;
    }
    @Override
    public void aprobar() {
        this.estado = "Aprobado";
        System.out.println("Convalidación APROBADA del curso: " + curso.getNombre());
    }
    @Override
    public void rechazar(String motivo) {
        this.estado = "Rechazado";
        System.out.println("Convalidación RECHAZADA del curso: " + curso.getNombre() +
                ". Motivo: " + motivo);
    }
}