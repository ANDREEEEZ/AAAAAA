public class Lab{
    private Servicio[] servicios;
    private int nServicios;
    private Muestra[] muestras;
    private int nMuestras;

    public Lab(){
        servicios= new Servicio[100];
        servicios[0]= new Servicio();
        nServicios=-1;

        muestras= new Muestra[99];
        nMuestras=-1;

         
    }

    public void agregarServicio(Servicio n){
        servicios[nServicios+1]=n;
        nServicios++;

    }
    public void registrarMuestra(Muestra b, int orden){
        muestras[orden]=b;
    }
    public void mostrarInforme(){
        System.out.println("Se hizo lo que se pudo");
    }
}