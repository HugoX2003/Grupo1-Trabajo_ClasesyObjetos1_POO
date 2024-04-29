public class Fraccion {
    
    private int numerador;
    private int denominador;

    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public String sumarFraccion(Fraccion p){
        int multiplicacionDen=0;
        int sumaNum=0;
        
        if(this.denominador==p.denominador)
        {
            
            multiplicacionDen=this.denominador;
            sumaNum=this.numerador+p.numerador;
        }
        
        else
        {
            multiplicacionDen=this.denominador*p.denominador;
            sumaNum=this.numerador+p.numerador;
        }
      return "La suma de las fracciones es: "+sumaNum+"/"+multiplicacionDen;  
    }
      
    public String restarFraccion(Fraccion p){
       int multiplicacionDen = 0;
       int restaNum = 0; 
         if (this.denominador==p.denominador)
            {
                multiplicacionDen = this.denominador;
                restaNum=this.numerador-p.numerador;
            }
       else 
            {
                multiplicacionDen = this.denominador*p.denominador;
                restaNum=(this.denominador*p.numerador)-(this.numerador*p.denominador);
            }
              return "La resta de las fracciones es: "+restaNum+"/"+multiplicacionDen;
    }
    
    public String multiplicarFraccion(Fraccion p){
       int multiplicacionDen = 0;
       int porNum = 0; 
       
       multiplicacionDen = this.denominador*p.denominador;
       porNum=this.numerador*p.numerador;
       return "La multiplicacion de las fracciones es: "+porNum+"/"+multiplicacionDen;
    }
    
    public String dividirFraccion(Fraccion p){
       int multiplicacionDen = 0;
       int porNum = 0; 
       
       multiplicacionDen = this.denominador*p.numerador;
       porNum=this.numerador*p.denominador;
       return "La division de las fracciones es: "+porNum+"/"+multiplicacionDen;
    }
       
    public String comparar2Fracciones(Fraccion p){ //p = almacena valores 
           if ((this.numerador == p.numerador) && (this.denominador == p.denominador)){
               return "las fracciones son iguales";         }
           else{ //o             
               return "las fracciones son diferentes";         }     
    }
    @Override
       public String toString() {
        return +numerador+"/"+denominador;
    }
     
}
