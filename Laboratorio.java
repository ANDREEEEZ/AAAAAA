public class Laboratorio {

    private Servicios [] servi;
    private int numeroservi;

    public Laboratorio (){
        servi = new Servicios [100];
        for (int i = 0 ; i< 100; i++){
            Servicios servc = new Servicios();
            this.servi [i]=servc;
            this.numeroservi = i;
        }
    }

    public void agregarServicio (int v,Muestra p){
        Servicios a = servi [v];
        a.agregarMuestra(p);
    }

    public void registrarMuestra (int nserv, Muestra p){
        servi [nserv-1].agregarMuestra(p);
    }

    public void mostrarInformes(){
        for (int i = 0; i <= numeroservi; i++){
            System.out.println("PROMEDIO ESPECIALIZADAS: "+ servi [i].getPromedioEspecializadas());
            System.out.println("PROMEDIO NO ESPECIAL : "+ servi [i].getPromedioSimples());
            System.out.println("BLOQUE DE VENtA DEL MES : "+ servi [i]);
        }

    }
}
