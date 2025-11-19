public class Prerequisito {

    private String nombre;
    private Curso cursoRequerido;      
    private Curso cursoDependiente;    

    public Prerequisito(String nombre, Curso cursoRequerido, Curso cursoDependiente) {
        this.nombre = nombre;
        this.cursoRequerido = cursoRequerido;
        this.cursoDependiente = cursoDependiente;
    }

    public String getNombre() {
        return nombre;
    }

    public Curso getCursoRequerido() {
        return cursoRequerido;
    }

    public void setCursoRequerido(Curso cursoRequerido) {
        this.cursoRequerido = cursoRequerido;
    }

    public Curso getCursoDependiente() {
        return cursoDependiente;
    }

    public void setCursoDependiente(Curso cursoDependiente) {
        this.cursoDependiente = cursoDependiente;
    }

    public boolean cumple(Curso cursoAprobado) {
        return cursoAprobado.getCodigo() == cursoRequerido.getCodigo();
    }

    public void mostrarPrerequisito() {
        System.out.println(
            "Prerrequisito: " + nombre +
            " | Requiere aprobar: " + cursoRequerido.getNombre() +
            " | Para cursar: " + cursoDependiente.getNombre()
        );
    }

    public boolean esEquivalentePorCreditos(Curso otro) {
        return otro.getCredito() == cursoRequerido.getCredito();
    }

    public boolean esEquivalente(Curso otro) {
        boolean mismoTipo = cursoRequerido.getTipo().equalsIgnoreCase(otro.getTipo());
        boolean creditosSimilares = Math.abs(cursoRequerido.getCredito() - otro.getCredito()) <= 1;

        return mismoTipo && creditosSimilares;
    }
}
