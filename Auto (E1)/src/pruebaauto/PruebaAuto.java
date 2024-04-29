package pruebaauto;

public class PruebaAuto {

    public static void main(String[] args) {
        
           Auto au1= new Auto();
           Auto au2= new Auto("CRJ-289","azul","subaru","impreza",4);
           
           System.out.println("El auto 1: "+au1.toString());
           System.out.println("El auto 2: "+au2.toString());
           
           au1.setColor("rojo");
           
           System.out.println("El auto 1: "+au1.toString());
           
           au1.setEstado(1);
           au2.setEstado(1);
           
           System.out.println("El auto 1: "+au1.toString());
           System.out.println("El auto 2: "+au2.toString());
           
           au1.setEstado(0);
           
           System.out.println("El auto 1: "+au1.toString());
           
        
    }
    
}
