package Experiment_2.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(3);
        point.setY(2);
        //修改点的位置为(5,6)
        point.movePoint(5, 6);
        System.out.println("(" + point.getX() + "," + point.getY() + ")");
    }
}
