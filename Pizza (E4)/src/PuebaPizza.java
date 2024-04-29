public class PuebaPizza {

    public static void main(String[] args) {
        
       Pizza P1=new Pizza("Mediana","4 quesos",0,"pedida");
       Pizza P2=new Pizza("Familiar","Margarita",0,"pedida");
       Pizza P3=new Pizza("Mediana","funghi",0,"pedida");
       
        System.out.println("Los valores de la pizza 1 son: "+P1.toString());
        System.out.println("Los valores de la pizza 2 son: "+P2.toString());
        System.out.println("Los valores de la pizza 3 son: "+P3.toString());
       
        P1.setCantidad(P1.getCantidad()+1);
        P2.setCantidad(P2.getCantidad()+1);
        
        System.out.println("\nLos valores de la pizza 1 son: "+P1.toString());
        System.out.println("Los valores de la pizza 2 son: "+P2.toString());
        System.out.println("Los valores de la pizza 3 son: "+P3.toString());
        
        P2.setEstado("servida en la mesa");
        P3.setEstado("servida en la mesa");
        
        System.out.println("\nLos valores de la pizza 1 son: "+P1.toString());
        System.out.println("Los valores de la pizza 2 son: "+P2.toString());
        System.out.println("Los valores de la pizza 3 son: "+P3.toString());
        
        System.out.println("\nLa pizza 1 fue pedida "+P1.getCantidad()+" veces");
        System.out.println("La pizza 2 fue pedida "+P2.getCantidad()+" veces");
        System.out.println("La pizza 3 fue pedida "+P3.getCantidad()+" veces");
    
    }
    
}
