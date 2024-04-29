
import java.io.*;

public class PruebaSemaforo {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
                Semaforo sem = new Semaforo();
  
        System.out.println("El color del semaforo es: "+sem.toString());
       
        sem.setEstado("verde");
        
        System.out.println("El color del semaforo es: "+sem.toString());
        
        sem.setEstado("amarillo");
        
        System.out.println("El color del semaforo es: "+sem.toString());
    }
    
}
