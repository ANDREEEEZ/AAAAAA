public class Servicio{
    private Muestra[] simple;
    private int nSimple;
    private Muestra[] esp;
    private int nEsp;
    private double registro1;
    private double registro2;
    private Muestra p;
    private double profprom;
    private double profprom1;
    public Servicio(){
        simple= new Muestra[30];
        esp= new Muestra[30];
    }

    public void agregarMuestra(Muestra m, int profundidad){
        if(profundidad>0 && profundidad<10){
            simple[nSimple]=m;
            nSimple++;
            registro1+=m.getProf();
        }else{
            esp[nEsp]=m;
            nEsp++;
            registro2+=m.getProf();
        }
    }

    public void profundidaPromedio(int nSimple, Muestra p){
               profprom = (registro1 / nSimple);
               profprom1 = (registro2 / nEsp);
                System.out.println("EKIS DE :" + profprom);
                System.out.println("EKIS DE 1:" + profprom1);
        }
    }

    
    

