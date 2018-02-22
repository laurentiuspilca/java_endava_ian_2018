public class Exemplu3 {

    public static void main(String [] args) {
        Coffee.SMALL.drink();
        
        String name = Coffee.BIG.name(); // BIG
        int o = Coffee.BIG.ordinal(); // 2
        
        System.out.println(name + " " + o);
    }
}