package paqueteTiempo;
import java.io.*;
public class PruebaTiempo {
    public static void main(String[] args) 
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        Tiempo T1=new Tiempo (1, 30, 40);
        Tiempo T2=new Tiempo (0, 20, 10);
        
        System.out.println(T1.toString());
        System.out.println(T2.toString());
        
        
        System.out.println(T1.Suma(T2));
        
        System.out.println(T1.Resta(T2));
    }
    
}
