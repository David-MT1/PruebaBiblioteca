public class Matricula {

    private int cantidadCursos;
    private String sedeUniversidad;
    private int semestreAcademico;
    private int totalCreditos;

    public Matricula(int cantidadCursos, String sedeUniversidad, int semestreAcademico, int totalCreditos) {
        this.cantidadCursos = cantidadCursos;
        this.sedeUniversidad = sedeUniversidad;
        this.semestreAcademico = semestreAcademico;
        this.totalCreditos = totalCreditos;
    }

    public int getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(int cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
    }

    public String getSedeUniversidad() {
        return sedeUniversidad;
    }

    public void setSedeUniversidad(String sedeUniversidad) {
        this.sedeUniversidad = sedeUniversidad;
    }

    public int getSemestreAcademico() {
        return semestreAcademico;
    }

    public void setSemestreAcademico(int semestreAcademico) {
        this.semestreAcademico = semestreAcademico;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }
}
