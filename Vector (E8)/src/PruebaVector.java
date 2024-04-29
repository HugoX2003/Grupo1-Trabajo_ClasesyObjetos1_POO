import java.io.*;
public class PruebaVector {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x;
        int y;
        int z;
        
        System.out.println("Ingrese x para el vector 1:");
        x=Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese y para el vector 1:");
        y=Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese z para el vector 1:");
        z=Integer.parseInt(br.readLine());
        
        Vector V1=new Vector(x,y,z);
        
        System.out.println("La norma del vector 1 es: "+V1.normamax());
        System.out.println(" ");
        
        System.out.println("Ingrese x para el vector2:");
        x=Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese y para el vector:");
        y=Integer.parseInt(br.readLine());
        
        System.out.println("Ingrese z para el vector:");
        z=Integer.parseInt(br.readLine());
        
        Vector V2=new Vector(x,y,z);
        
        System.out.println("La norma del vector 2 es: "+V2.normamax());
        
        System.out.println("\nEl vector 1 tiene como coordenadas: "+V1.toString());
        System.out.println("El vector 2 tiene como coordenadas: "+V2.toString());
        System.out.println(V1.comparar2Vectores(V2));
    }
           
}
   