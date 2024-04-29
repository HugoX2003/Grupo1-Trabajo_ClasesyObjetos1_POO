public class Docente {

    private String Nombre;
    private String Codigo;
    private double Sueldo;
    private int HoraxSemana;

    public Docente(String Nombre, String Codigo, double Sueldo, int HoraxSemana) {
       this.Nombre = Nombre;
       this.Codigo = Codigo;
       this.Sueldo = Sueldo;
       this.HoraxSemana = HoraxSemana;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getHoraxSemana() {
        return HoraxSemana;
    }

    public void setHoraxSemana(int HoraxSemana) {
        this.HoraxSemana = HoraxSemana;
    }
    
    public double SueldoNeto(){
        double neto;
        neto=this.Sueldo-(this.Sueldo*0.14);//formula
        return neto;
    }
    
    public double Gratificacion(){
        double bruto;
        bruto=(this.Sueldo*14);//formula
        return bruto;
    }
    
    public String toString() {
        return "Docente{" + "Nombre=" + Nombre + ", Codigo=" + Codigo + ", Sueldo=" + Sueldo + ", HoraxSemana=" + HoraxSemana + '}';
    }
    
}
