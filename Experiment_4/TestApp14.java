package Experiment_4;

/**
 * @author 冰
 */
public class TestApp14 {
    public static void main(String[] args) {
        Point14 p1 = new Point14(2, 9);
        Point14 p2 = new Point14(3, 3);
        LineSegment14 aLine = new LineSegment14(p1, p2);
        System.out.printf("len=%.2f\n", aLine.getLength());
        System.out.printf("slope=%.2f\n", aLine.getSlope());
        p1.setRadius(3);
        p1.setTheta(2);
        System.out.printf("len=%.2f\n", aLine.getLength());
        System.out.printf("slope=%.2f", aLine.getSlope());
    }
}
