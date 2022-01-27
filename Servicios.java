public class Servicios {

    private Muestra[] especializadas, simples;
    private int cantidad1;
    private int cantidad2;
    private double acumulacion1;
    private double acumulacion2;

    public Y (){

        = new [];
        = new [];

    }

    public void agregar (X p){

        if (p.getValor()<= 20){
            primero [cantidad1] = p;
            cantidad1++;
            acumulacion1+=p.getValor();    
        }else{
            segundo [cantidad2] =p;
            cantidad2++;
            acumulacion2+=p.getValor();
        }

    }
    private void imprimir (){
    double = ;
    double promedio = (acumulacion/cantidad1);
    double promedio1 = (acumulacion/cantidad2);
    System.out.println("--------------------");
    System.out.println("");
    System.out.println("--------------------");
    System.out.println("");
    System.out.println("---------------------");
    System.out.println("");
    System.out.println("---------------------");
    }






}
