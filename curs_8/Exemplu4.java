public class Exemplu4 {

    public static void main(String [] args) {
        Animal a1 = new Girafa();
        
        Pisica p1 = (Pisica) a1; // ClassCastException
        
        //Pisica p1 = (Pisica) new Girafa();
    }
}