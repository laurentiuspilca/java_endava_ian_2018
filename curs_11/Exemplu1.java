public class Exemplu1 {

    public static void main(String [] args) {
        
        Cat c1 = new Cat();
        Cat c2 = c1;
        c1 = null;
        Box b = new Box();
        b.cat = c1;
        c2 = null;
        
    }
}