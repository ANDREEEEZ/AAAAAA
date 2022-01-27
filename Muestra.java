public class Muestra {

    private String serial;
    private String fecha;
    private int profundidad;

    public void setSerial (String serial){
        this.serial=serial  ;
    }

    public void setFecha (String fecha){
        this.fecha = fecha ;
    }

    public void setProf (int profundidad){
        this.profundidad = profundidad;
    }

    public String getSerial (){
        return serial;
    }

    public String getFecha (){
        return fecha;
    }

    public int getProf(){
        return profundidad;
    }

}