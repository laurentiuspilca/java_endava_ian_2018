public class Exemplu3 {

    public static void main(String [] args) {
        Pisica p1 = new Pisica();
        p1.x = ":)";
        p1.y = 30;
        
        Animal a1 = p1;
        a1.x = 30;
        
        a1.m();
    }
}