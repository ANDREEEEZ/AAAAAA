public class Muestra{
    private String serial;
    private String fecha;
    private int prof;
    
    public Muestra(String serial,String fecha,int prof){
     this.serial=serial;
     this.fecha=fecha;
     this.prof=prof;
    }
    
    public int getProf(){
         return prof;   
    }
}