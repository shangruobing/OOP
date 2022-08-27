package Experiment_3;

/**
 * 二维点类
 * @author 冰
 */
public class Point2D14 {
    private float x;
    private float y;
    private static int numberOfInstances = 0;

    public Point2D14() {
        x = 2;
        y = 3;
        numberOfInstances++;
    }

    /**
     * @param x 初始化属性x
     * @param y 初始化属性y
     */
    public Point2D14(float x, float y) {
        this.x = x;
        this.y = y;
        numberOfInstances++;
    }

    public static int getNumberOfInstances() {
        return numberOfInstances;
    }

    /**
     * @return 返回点的x坐标
     */
    public float getX() {
        return x;
    }

    /**
     * @param x 为点的x坐标赋值
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * @return 返回点的y坐标
     */
    public float getY() {
        return y;
    }

    /**
     * @param y 为点的y坐标赋值
     */
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        Point2D14 pointOne = new Point2D14(1, 1);
        Point2D14 pointTwo = new Point2D14();
        Point2D14 pointThree = new Point2D14();
        pointThree.setX(3);
        pointThree.setY(3);
        System.out.println(pointOne);
        System.out.println(pointTwo);
        System.out.println(pointThree);
        System.out.println(getNumberOfInstances());
    }
}
