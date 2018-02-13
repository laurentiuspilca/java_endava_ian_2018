public class Exemplu5 {

    public Animal m1() {
        if (true) {
            return new Pisica();
        } else {
            return new Girafa();
        }
    }
    
    public static void m2(Animal a) {
        if (a instanceof Mamifer) {
            System.out.println("Pisica");
        }
    }
    
    public static void main(String [] args) {
        m2(new Pisica());
        
        Animal [] a = new Animal[5];
        a[0] = new Pisica();
        a[1] = new Girafa();
    }
}