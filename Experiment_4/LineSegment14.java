package Experiment_4;

/**
 * @author 冰
 */
public class LineSegment14 {
    private Point14 pointA;
    private Point14 pointB;

    public LineSegment14() {
    }

    public LineSegment14(Point14 pointA, Point14 pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public double getLength() {
        return Math.sqrt(Math.pow((pointA.getX() - pointB.getX()), 2) +
                Math.pow((pointA.getY() - pointB.getY()), 2));
    }

    public double getSlope(){
        if (pointA.getX() == pointB.getX()) {
            System.out.println("斜率不存在");
        }
        if (pointA.getY() == pointB.getY()) {
            return 0;
        }
        return (pointA.getY() - pointB.getY()) / (pointA.getX() - pointB.getX());
    }

    @Override
    public String toString() {
        return pointA.toString() + "\n" + pointB.toString();
    }

}
