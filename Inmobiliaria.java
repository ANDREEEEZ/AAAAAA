public class Inmobiliaria {

    private BloqueDeVenta [] bloque1;
    private int numerobloque;

    public Inmobiliaria (){
        bloque1 = new BloqueDeVenta [12];
        for (int i = 0 ; i< 12; i++){
            BloqueDeVenta mes = new BloqueDeVenta();
            this.bloque1 [i]=mes;
            this.numerobloque = i;
        }
    }

    public void registrarApartamento (Apartamento p, int nmes){
        bloque1 [nmes-1].agregarApartamento(p); 
    }

    public void mostrarInformeInmobiliaria(){
        for (int i = 0; i <= numerobloque; i++){
            System.out.println("BLOQUE DE VENtA DEL MES : "+ (i+1));
            bloque1 [i].imprimirPromedios();
        }

    }

}
