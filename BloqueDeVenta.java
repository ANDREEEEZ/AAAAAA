public class BloqueDeVenta {

    private Apartamento[] aptograndes;
    private Apartamento[] aptopq ;
    private int cantidad1;
    private int cantidad2;
    private double acumulacionM2peques;
    private double acumulacionM2grandes;

    public BloqueDeVenta (){

        aptograndes = new Apartamento [50];
        aptopq= new Apartamento [50];

    }

    public void agregarApartamento (Apartamento p){

        if (p.getMetroscuadrados()<=55){
            aptopq [cantidad1] = p;
            cantidad1++;
            acumulacionM2peques+=p.getMetroscuadrados();    
        }else{
            aptograndes [cantidad2] =p;
            cantidad2++;
            acumulacionM2grandes+=p.getMetroscuadrados();
        }

    }

    public void imprimirPromedios (){
        double promedio = (acumulacionM2peques/cantidad1);
        double promedio1 = (acumulacionM2grandes/cantidad2);
        System.out.println("--------------------");
        System.out.println("KUADRADOS PROMEDIO "+cantidad1+" APTOS PEQUEÑOS : "+ promedio+", TOTAL METROS VENDIDOS: "+acumulacionM2peques);
        System.out.println("--------------------");
        System.out.println("KUADRADOS PROMEDIO "+cantidad2+" APTOS GRANDES : "+ promedio1+", TOTAL METROS VENDIDOS: "+acumulacionM2grandes);
        System.out.println("---------------------");
        System.out.println("COSTO TOTAL : "+ ((acumulacionM2peques+acumulacionM2grandes)*2500000));
        System.out.println("---------------------");
    }



}
