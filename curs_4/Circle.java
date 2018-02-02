public class Circle {

    Point center;
    double radius;
    
    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    
    double getLength() {
        return 2 * 3.14 * this.radius;
    }
    
    boolean isTangent(Circle c) {
        if (this.radius + c.radius == this.center.getDistance(c.center)) {
            return true;
        }
        
        return false;
    }
}