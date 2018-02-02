public class Foo {

    void m1(int x) {
        x = 10;
    }
    
    void m2(Point p) {
        p.x = 10;
    }
    
    void m3(Point p) {
        p = new Point(10, 10);
        p.x = 70;
    }
}