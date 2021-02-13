package Experiment_5;

public class Shape {
    protected Point point;

    public Shape() {
        point = new Point();
    }

    public Shape(Point p) {
        point = p;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getPerimeter() {
        return 0;
    }
    public double getLength(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) +
                Math.pow(pointA.getY() - pointB.getY(), 2));
    }
}
