import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public  class Estudiante extends Persona {
    int creditosAprobados;
    Set<String> passedCourses = new HashSet<>(); 
    List<String> currentEnrollment = new ArrayList<>(); 

    Estudiante(String nombre, String correo, String codigo, String telefono,int creditosAprobados){
        super (nombre,correo,codigo,telefono);
        
    }
    public int getCreditosAprobados () {
        return creditosAprobados;
    }
    public void setCreditosAprobados (int creditos) {
        this.creditosAprobados=creditos;
    }
    public String toString(){
        return super.toString();
    }
    
    public void solicitarMatricula(String curso) {
        if (currentEnrollment.contains(curso)) {
            System.out.println("Ya estás matriculado en el curso: " + curso);
        } else {
            currentEnrollment.add(curso);
            System.out.println("Matrícula solicitada para el curso: " + curso);
        }
    }

    public void solicitarConvalidacion(String cursoAnterior, String cursoEquivalente) {
        if (passedCourses.contains(cursoAnterior)) {
            System.out.println("Convalidación solicitada: '" + cursoAnterior +"' por el curso equivalente '" + cursoEquivalente + "'.");
        } else {
            System.out.println("No se puede solicitar convalidación. El curso '" +cursoAnterior + "' no aparece como aprobado.");
        }
    }
}


    
    
    
