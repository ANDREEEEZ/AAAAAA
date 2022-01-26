public class Muestra{
    private String serial;
    private String fecha;
    private int profundidad;
    private int ssss;
    
    public Muestra(String serial,String fecha,int prof){
     this.serial= serial;
     this.fecha=fecha;
     this.profundidad = profundidad;
    }
    
    public int getProfundidad(){
         return profundidad;   
    }
    
    public int getProf(){
         return profundidad;   
    }
}