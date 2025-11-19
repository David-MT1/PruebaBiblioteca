public class Persona{
    private String nombre;
    private String correo;
    private String codigo;
    private String telefono;

    public Persona(String nombre, String correo, String codigo, String telefono){
        setNombre(nombre);
        setCorreo(correo);
        setCodigo(codigo);
        setTelefono(telefono);
    }
    public String getNombre(){
        return nombre;
    }
    public String getCorreo(){
        return correo;        
    }
    public String getCodigo(){
        return codigo;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setNombre(String nombre) {
        if (nombre != null && nombre.length() >= 2 && nombre.matches("[a-zA-Z]+")) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido, ingresé solo letras (minimo 2)");
        }
    }
    public void setCodigo(String codigo){
        if(codigo.length()==9){
            this.codigo=codigo;
        }else{
            System.out.println("codigo invalido");
        }
        
    }
    public void setCorreo(String correo){
        if (correo == null || !correo.contains("@")) {
        System.out.println("Email inválido");
    } else {
        this.correo = correo;
        System.out.println("Email válido: " + correo);
    }
    }
    public void setTelefono(String telefono){
        if(telefono.length()== 9){
            this.telefono=telefono;
        }else{
            System.out.println("Número de telefono invalido");
        }
    }
    
    public String toString(){
        return "\nNombre: "+nombre+"\nCorreo: "+correo+"\nCodigo: "+codigo+"\nTelefono: "+telefono;
    }

}
