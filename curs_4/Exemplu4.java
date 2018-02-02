public class Exemplu4 {

    public static void main(String [] args) {
        Cat.name = "Tom";
        
        Cat c1 = new Cat();
        
        c1.name = "Leo";
        
        Cat c2 = new Cat();
        
        c2.name = "Kitty";
        
        System.out.println(c1.name); // Kitty
        
        Cat.sayMeow();
        c1.sayMeow();
        
    }
}