public class Cerc extends Punct { // isA

    double raza;
    
    public Cerc() {
        super(5, 5); // this()
    }
    
    public Cerc(double raza) {
        this();
    }
    
    public double getArie() {
        return 3.14 * raza * raza;
    }
}