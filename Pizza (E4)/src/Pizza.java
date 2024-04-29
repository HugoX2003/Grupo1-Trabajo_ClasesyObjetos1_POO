public class Pizza {

    private String tamaño;
    private String tipo;
    private int cantidad;
    private String estado;

    public Pizza(String tamaño, String tipo, int cantidad, String estado) {
    this.tamaño = tamaño;
    this.tipo = tipo;
    this.cantidad = cantidad;
    this.estado = estado;
    }
    
    
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String toString() {
        return "Pizza{" + "tama\u00f1o=" + tamaño + ", tipo=" + tipo + ", cantidad=" + cantidad + ", estado=" + estado + '}';
    }

}
