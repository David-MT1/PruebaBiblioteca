public class Secretaria  extends Persona {
    Secretaria (String nombre, String correo, String codigo, String telefono){
        super (nombre,correo,codigo,telefono);
    }
    public String toString(){
        return super.toString();
    }

     public boolean validarConvalidacion(Estudiante est, String cursoAnterior, String cursoEquivalente) {
        if (!est.passedCourses.contains(cursoAnterior)) {
            System.out.println("El estudiante no ha aprobado el curso: " + cursoAnterior);
            return false;
        }

        if (est.passedCourses.contains(cursoEquivalente)) {
            System.out.println("El curso equivalente '" + cursoEquivalente + "' ya aparece como aprobado.");
            return false;
        }

        System.out.println("Convalidación válida para: " + cursoAnterior + " → " + cursoEquivalente);
        return true;
    }
}
