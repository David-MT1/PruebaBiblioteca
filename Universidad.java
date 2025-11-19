import java.util.ArrayList;
class Universidad{
    private String sede;
    private ArrayList<Carrera> carreras;
    
    
    public void setSede(String sede){
        this.sede = sede;
    }
    public String getSede(){
        return sede;
    }

    public void setCarreras(Carrera carrera){
        carreras.add(carrera);
    }
    public String getCarrera() {
        return carreras.get(0).getNombre();
    }

}