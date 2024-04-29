import java.io.*;

public class PruebaDocente {

    public static void main(String[] args) throws IOException {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
      int N=1;
      
      String Nombre;
      String Codigo;
      double Sueldo;
      int Horaxsemana;
      
      do{
          System.out.println("Nombre del profesor: ");
          Nombre= br.readLine();
          
          System.out.println("Codigo del profesor: ");
          Codigo= br.readLine();
          
          System.out.println("Sueldo del profesor: ");
          Sueldo= Double.parseDouble(br.readLine());
          
          System.out.println("Horas por semana trabajadas: ");
          Horaxsemana= Integer.parseInt(br.readLine());
          
          Docente D1= new Docente(Nombre, Codigo, Sueldo, Horaxsemana);
          
          System.out.println("Su sueldo neto es: "+D1.SueldoNeto());
          System.out.println("El total de sueldos brutos al año mas las gratificaciones son: "+D1.Gratificacion());
          System.out.println("Los datos del docente son: "+D1.toString());
          N++;
          }
      while(N<4);
      
    
    }
    
}
