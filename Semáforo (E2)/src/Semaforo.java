
public class Semaforo {
    
    private String estado;

    public Semaforo(){
        
        this.estado = "rojo";
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String toString() {
        return "Semaforo{" + "color=" + estado + '}';
    }
    

}
