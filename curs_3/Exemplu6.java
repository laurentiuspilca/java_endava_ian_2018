public class Exemplu6 {

    public static void main(String [] args) {
        Cat c1;
        c1 = new Cat();
        
        Cat c2 = new Cat();
        
        c1.name = "Tom";
        c2.name = "Leo";
        c1.age = 4;
        c2.age = 3;
        
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c1);
    }
}