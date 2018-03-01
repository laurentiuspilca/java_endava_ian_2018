public class Produs {

    private final String nume;
    private final double pret;
    
    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }
    
    public String getNume() {
        return this.nume;
    }
    
    public double getPret() {
        return this.pret;
    }
}