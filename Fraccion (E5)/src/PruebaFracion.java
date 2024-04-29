
import java.io.*;

public class PruebaFracion {

    public static void main(String[] args)throws IOException { 
        
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int numerador;
        int denominador;
    
        System.out.println("Ingrese el numerador de la fraccion 1: ");    
        numerador= Integer.parseInt(br.readLine());
        System.out.println("Ingrese el denomidador de la fraccion 1: ");
        denominador= Integer.parseInt(br.readLine());
        Fraccion F1= new Fraccion(numerador,denominador);
        
        System.out.println("Ingrese el numerador de la fraccion 2: ");    
        numerador= Integer.parseInt(br.readLine());
        System.out.println("Ingrese el denomidador de la fraccion 2: ");
        denominador= Integer.parseInt(br.readLine()); 
        Fraccion F2= new Fraccion(numerador,denominador);
        
     System.out.println("La fraccion 1 es "+F1.toString());
     System.out.println("La fraccion 2 es "+F2.toString());
     System.out.println(F1.sumarFraccion(F2));     
     System.out.println(F1.restarFraccion(F2));
     System.out.println(F1.multiplicarFraccion(F2));
     System.out.println(F1.dividirFraccion(F2));
     System.out.println(F1.comparar2Fracciones(F2));
    }
    
}
