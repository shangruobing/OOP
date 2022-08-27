package Experiment_4;

/**
 * @author 冰
 */
public class Point14 {
    private double x;
    private double y;
    private double radius;

    public Point14() {
        x = 0;
        y = 0;
    }

    public Point14(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setTheta(double theta) {
        x = this.radius * Math.cos(theta);
        y = this.radius * Math.sin(theta);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
