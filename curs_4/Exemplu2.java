public class Exemplu2 {

    public static void main(String [] args) {
        Foo f1 = new Foo();
        
        int x = 30;
        
        Point p1 = new Point(30, 30);
        
        f1.m1(x);
        f1.m3(p1);
        
        System.out.println(x);
        System.out.println(p1.x);
    }
}