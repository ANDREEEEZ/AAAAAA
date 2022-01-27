public class Laboratorio {

    private Servicios [] servi;
    private int numeroservi;

    public Laboratorio (){
        servi = new Servicios [100];
        numeroservi = 0;
    }

    public void agregarServicio (Servicios s){
        servi[numeroservi] = s;
        numeroservi++;
    }

    public void registrarMuestra (int v, Muestra p){
        servi[v-1].agregarMuestra(p);
    }

    public void mostrarInformes(){
        for (int i = 0; i < numeroservi; i++){
            Servicios s = servi[i];
            System.out.println("Servicio #" + i);
            System.out.println("Profundidad promedio "+ s.getEspecializadas() + " muestras especializadas:" + 
                                    s.getPromedioEspecializadas());
                                
            System.out.println("Profundidad promedio "+ s.getSimples() + " muestras simples: " + 
                                    s.getPromedioSimples());
                                    
            System.out.println("Costo Total: "+ s.getCosto());
            System.out.println();
        }
        
    }
}
