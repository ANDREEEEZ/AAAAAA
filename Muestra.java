public class Muestra{
    private String serial;
    private String fecha;
    private int profundida;
    private String pro;
    
    public Muestra(String serial,String fecha,int prof){
     this.serial=serial;
     this.fecha=fecha;
     this.profundida = profundida;
    }
    
    public int getProfundidad(){
         return profundida;   
    }
    
    public int getProf(){
         return profundida;   
    }
}