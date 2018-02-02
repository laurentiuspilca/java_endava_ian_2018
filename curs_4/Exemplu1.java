public class Exemplu1 {

    public static void main(String [] args) {
        Point p1 = new Point(1,0);
        
        Circle c1 = new Circle(p1, 10);
        Circle c2 = new Circle(new Point(5,8), 5);
        
        double a1 = c1.getLength();
        double a2 = new Circle(p1, 10).getLength();
        double a3 = new Circle(new Point(5,5), 10).getLength();
        
        boolean w = c1.isTangent(c2);
        
    }
}