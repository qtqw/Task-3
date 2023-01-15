package Task3;

public class Circle {
    public double x;
    public double y;
    public double radius;

public Circle(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
}
public boolean isIn(double x, double y) {
    double s = Math.sqrt(Math.pow(Math.abs(this.x - x),2) + Math.pow(Math.abs(this.y - y),2));
    if (s <= radius) {
        return true;
    }
    else {
        return false;
    }
}
}
