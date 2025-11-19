public class Curso {
    private String nombre;
    private int credito;
    private int codigo;
    private String tipo;

    public Curso(String nombre, int credito, int codigo, String tipo) {
        this.nombre = nombre;
        this.credito = credito;
        this.codigo = codigo;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getCredito() { return credito; }
    public void setCredito(int credito) { this.credito = credito; }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre +
                " | Código: " + codigo +
                " | Créditos: " + credito +
                " | Tipo: " + tipo);
    }
}
