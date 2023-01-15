package Task3;
public class Rectangle {
    public double xmin;
    public double ymin;
    public double xmax;
    public double ymax;

    public Rectangle(double xmin, double ymin, double xmax, double ymax) {
        this.xmin = xmin;
        this.ymin = ymin;
        this.xmax = xmax;
        this.ymax = ymax;
    }
    public boolean isIn(double x, double y) {
        if (x>=xmin && x<=xmax && y>=ymin && y<=ymax) {
            return true;
        }
        else {
            return false;
        }
}
}

