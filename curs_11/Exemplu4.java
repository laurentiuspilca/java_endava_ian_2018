public class Exemplu4 {

    public static void main(String [] args) {
        final Produs [] p = new Produs[100];
        p[0] = new Produs("Ciocolata", 10);
        
        Magazin m = new Magazin(p);
        
        //m.getP()[0] = new Produs("Bere", 5);
        //p[0] = new Produs("Bere", 5);
        
        System.out.println(m.getP()[0].getNume());
    }
}