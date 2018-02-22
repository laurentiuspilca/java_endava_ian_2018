public class Cerc extends Forma {
    
    double raza;
    
    public Cerc(double raza) {
        this.raza = raza;
    }
    
    public double getArie() {
        return 3.14 * raza * raza;
    }
}