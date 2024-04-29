package pruebaauto;

public class Auto {

    private String placa;
    private String color;
    private String marca;
    private String modelo;
    private int npuertas;
    private int estado;
    
   public Auto() {
        this.placa = "";
        this.color = "";
        this.marca = "";
        this.modelo = "";
        this.npuertas = 0;
        this.estado = 0;
    }
    
   public Auto(String placa, String color, String marca, String modelo, int npuertas) {
        this.placa = placa;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.npuertas = npuertas;
        this.estado = 0;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNpuertas() {
        return npuertas;
    }

    public void setNpuertas(int npuertas) {
        this.npuertas = npuertas;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", npuertas=" + npuertas + ", estado=" + estado + '}';
    }
    
    
  
}
