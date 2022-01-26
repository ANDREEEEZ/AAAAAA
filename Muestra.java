public class Muestra{
    private String serial;
    private String fecha;
    private int profdidad;
    private int pra;
    
    public Muestra(String serial,String fecha,int prof){
     this.serial=serial;
     this.fecha=fecha;
     this.profdidad = profdidad;
    }
    
    public int getProfundidad(){
         return profdidad;   
    }
    
    public int getProf(){
         return profdidad;   
    }
}