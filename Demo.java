public class Demo{
    private Demo(){}
    
    public static void main(String[] args){
        Muestra m1 = new Muestra();
        Muestra m2 = new Muestra();
        Muestra m3 = new Muestra();
        Muestra m4 = new Muestra();
        Muestra m5 = new Muestra();
        
        m1.setProf(10);
        m2.setProf(0);
        m3.setProf(11);
        m4.setProf(50);
        m5.setProf(25);
        
        Servicios s1 = new Servicios();
        
        s1.agregarMuestra(m1);
        s1.agregarMuestra(m2);
        s1.agregarMuestra(m3);
        
        Laboratorio l1 = new Laboratorio();
        l1.agregarServicio(s1);
        
        Servicios s2 = new Servicios();
        l1.agregarServicio(s2);
        
        l1.registrarMuestra(1, m4);
        l1.registrarMuestra(1, m5);
        
        l1.registrarMuestra(2, m1);
        l1.registrarMuestra(2, m2);
        l1.registrarMuestra(2, m3);
        
        l1.mostrarInformes();
        
    }
}
