public class CursoIdioma extends Curso {

    private String idioma;
    private String nivel;

    public CursoIdioma(String nombre, int credito, int codigo, String tipo, 
                       String idioma, String nivel) {
        super(nombre, credito, codigo, tipo);
        this.idioma = idioma;
        this.nivel = nivel;
    }

    public String getIdioma() { return idioma; }
    public void setIdioma(String idioma) { this.idioma = idioma; }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }

    public void mostrarDetalleIdioma() {
        System.out.println("Curso de Idioma: " + getNombre() +
                " | Idioma: " + idioma +
                " | Nivel: " + nivel);
    }
}
