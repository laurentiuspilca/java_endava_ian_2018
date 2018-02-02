public class Point {

    double x,y;
    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    double getDistance(Point p) {
        return Math.sqrt( (this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y) );
    }
}