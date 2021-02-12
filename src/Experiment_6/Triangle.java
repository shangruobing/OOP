package Experiment_6;

public class Triangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double getPerimeter() {
        if (equals())
            return 0;
        if (!equals())
            return super.getLength(pointA, pointB)
                    + super.getLength(pointA, pointC)
                    + super.getLength(pointB, pointC);
        return 0;
    }

    public double getArea() {
        double r = getPerimeter();
        return Math.sqrt(r * (r - super.getLength(pointA, pointB)) * (r - super.getLength(pointA, pointC))
                * (r - super.getLength(pointB, pointC)));
    }

    public boolean equals() {
        return (pointA.equals(pointB) || pointA.equals(pointC) || pointB.equals(pointC));
    }

    public String toString() {
        return "三角形{" + pointA.toString() + pointB.toString() + pointC.toString() + "}";
    }
}
