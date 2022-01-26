public class Muestra{
    private String serial;
    private String fecha;
    private int profundidad;
    
    public Muestra(String serial,String fecha,int profundidad){
     this.serial=serial;
     this.fecha=fecha;
     this.profundidad = profundidad;
    }
    
    public int getProf(){
         return profundidad;   
    }
}