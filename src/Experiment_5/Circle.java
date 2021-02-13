package Experiment_5;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
        radius = 0;
    }

    public Circle(Point point, double r) {
        super(point);
        radius = r;
    }

    public Point getCentre() {
        return point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return Math.PI * radius * 2;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}