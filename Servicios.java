public class Servicios {

    private Muestra[] especializadas, simples;
    private int nEspecializadas, nSimples;
    
    public Servicios(){
        especializadas = new Muestra[30];
        simples = new Muestra[30];
        nEspecializadas = 0; nSimples = 0;
    }

    public void agregarMuestra(Muestra muestra){
        int prof = muestra.getProf();
        if (prof <= 10){
            simples[nSimples] = muestra;
            nSimples++;
        }else{
            especializadas[nEspecializadas] = muestra;
            nEspecializadas++;
        }
    }
}
