public class Point {
    int x,y;
    static int z;
    
    Point() {
        this(5, 5);
        System.out.println(":)");
    }
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    Point(String str) {
    }
    
    double getDistance(Point p) {
        // this
        return 0;
    }
    
    static double getDistance(Point p1, Point p2) {
        return 0;
    }
}