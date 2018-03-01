public class Magazin {

    private final Produs [] p;
    
    public Magazin(Produs [] p) {
        this.p = makeCopy(p);
    }
    
    public Produs[] getP() {
        return makeCopy(p);
    }
    
    private static Produs[] makeCopy(Produs [] p) {
        Produs [] copy = new Produs[p.length];
        for (int i=0; i<copy.length; i++) {
            copy[i] = p[i];
        }
        return copy;
    }
}