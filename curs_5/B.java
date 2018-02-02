public class B {

    String x = "HELLO";
    static int y = 30;
    
    {
        System.out.println("1");
        y = 60;
        x = "World";
    }
    
    static {
        System.out.println(y);
    }
    
    B() {
        System.out.println("Constructor " + y);
    }
    
    {
        System.out.println("2 " + this.x);
    }
    
    void m1() {
        System.out.println("m1");
    }
    
    static void m2() {
        System.out.println("m2");
    }
    
}