public class Cerc extends Punct {

    double raza;
    String x;
    
    public Cerc() {
        super(0,0);
        // super() this()
        // super   this
        super.x = 10;
        this.x = ":)";
    }
    
    public double getArie() {
        return 3.14 * raza * raza;
    }
}