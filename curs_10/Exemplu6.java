public class Exemplu6 {

    public static void main(String [] args) {
        Cat c1 = new Cat("Tom", 4);
        Cat c2 = new Cat("Tom", 3);
        Cat c3 = new Cat("Tom", 3);
        Cat c4 = new Cat("Leo", 3);
        Cat c5 = c3;
        
        System.out.println(c2 == c3);
        System.out.println(c2.equals(c3));
        
        Object o1 = new Cat("Tom", 4);
    }
}