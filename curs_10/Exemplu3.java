public class Exemplu3 {

    /**
     * Documentez aceasta metoda
     */
    public static void main(String [] args) {
        B b = new B();
        
        if (b instanceof I) {
            System.out.println("Hello");
        }
    }
}