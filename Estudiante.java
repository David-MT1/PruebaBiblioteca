public  class Estudiante {
    String id;
    String name;
    Set<String> passedCourses = new HashSet<>(); // cursos aprobados
    List<String> currentEnrollment = new ArrayList<>(); // ids de cursos matriculados

    Estudiante(String id, String name){
        this.id = id; this.name = name;
    } {
    
}
