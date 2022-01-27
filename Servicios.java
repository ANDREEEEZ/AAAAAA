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

    public double getPromedioEspecializadas(){
        if(nEspecializadas == 0){return 0;}
        double promedio = 0;
        double prof = 0;
        for(int i = 0; i < nEspecializadas; i++){
            prof = especializadas[i].getProf();
            promedio += prof;
        }
        promedio /= nEspecializadas;
        return promedio;
    }
    
    public double getPromedioSimples(){
        if(nSimples == 0){return 0;}
        double promedio = 0;
        double prof = 0;
        for(int i = 0; i < nSimples; i++){
            prof = simples[i].getProf();
            promedio += prof;
        }
        promedio /= nSimples;
        return promedio;
    }
    
    public double getCosto(){
        double costo = 0;
        costo += 1_000_000*nEspecializadas;
        costo += 400_000*nSimples;
        return costo;
    }
}
