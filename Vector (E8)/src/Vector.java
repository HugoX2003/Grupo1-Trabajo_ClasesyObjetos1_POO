public class Vector {

    private int x;
    private int y;
    private int z;

 
    public Vector(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
    }
        
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public String comparar2Vectores(Vector p){ 
        if ((this.x == p.x) && (this.y == p.y)&& (this.z == p.z)){
            return "los vectores son iguales";
        }else{ //o
            return "los vectores son diferentes";
        }
    }
    
    public double normamax(){ 
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)+ Math.pow(this.z, 2));
    }
    
    public String toString() {
        return "Vector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
    
    
    
}
