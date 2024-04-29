package paqueteTiempo;
public class Tiempo 
{

    private int Horas;
    private int Minutos;
    private int Segundos;

    public Tiempo(int Horas, int Minutos, int Segundos) 
    {
        this.Horas = Horas;
        this.Minutos = Minutos;
        this.Segundos = Segundos;
    }
    
    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public int getSegundos() {
        return Segundos;
    }

    public void setSegundos(int Segundos) {
        this.Segundos = Segundos;
    }
    public String Suma(Tiempo p)
    {
        int h=0;
        int m=0;
        int s=0;
        
        h=this.Horas + p.getHoras();
        m=this.Horas + p.getMinutos();
        s=this.Horas + p.getSegundos();
        
     if(s>=60)
            {
                m=m+1;
                s=s-60;
            }
        if(m>=60)
            {
                h=h+1;
                m=m-60;
            }
        return "La suma del tiempo es: "+h+"H "+m+"m "+s+"s .";
        
    }
    public String Resta (Tiempo p){ //variable t= almacena variables de horas, minutos y segundos //
        
        int h = 0;
        int m = 0;
        int s = 0;
        int ress = 0;
        int resm = 0;
        
        ress = this.Segundos - p.Segundos;
        
        if(ress < 0){
            s = ress * (-1);
            resm = (this.Minutos - p.Minutos) - 1;
        }else{
            s = ress;
            resm = (this.Minutos - p.Minutos);
        }
        
        if(resm < 0){
            m = resm * (-1);
            h = (this.Horas - p.Horas) - 1;
        }else{
            m = resm;
            h = (this.Horas - p.Horas);
        }

        return "La resta del tiempo es: "+h+"H "+m+"m "+s+"s .";
    }
    
    public String toString() {
        return "Tiempo{" + "Horas=" + Horas + ", Minutos=" + Minutos + ", Segundos=" + Segundos + '}';
    }
    
}
