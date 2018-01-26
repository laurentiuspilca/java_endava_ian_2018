public class Exemplu6 {

    public static void main(String [] args) {
        
        // ?:
        
        String rez = 4 > 5 ? "Hello" : "World";
        
        String rez2 = 4 > 5 ? (8 > 4 ? "Hello" : "World") : "World";
    }
}