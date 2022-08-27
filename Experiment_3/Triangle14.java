package Experiment_3;

/**
 * 三角形类
 *
 * @author 冰
 */
public class Triangle14 {
    private Point2D14 pointOne;
    private Point2D14 pointTwo;
    private Point2D14 pointThree;

    /**
     * 初始化构成三角形的三个点
     *
     * @param pointOne   为第一个点初始化
     * @param pointTwo   为第二个点初始化
     * @param pointThree 为第三个点初始化
     */
    public Triangle14(Point2D14 pointOne, Point2D14 pointTwo, Point2D14 pointThree) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
    }

    /**
     * 为构成三角形的三个点重新赋值
     *
     * @param setPointOne   为第一个点重新赋值
     * @param setPointTwo   为第二个点重新赋值
     * @param setPointThree 为第三个点重新赋值
     */
    public void setPoint(Point2D14 setPointOne, Point2D14 setPointTwo, Point2D14 setPointThree) {
        pointOne = setPointOne;
        pointTwo = setPointTwo;
        pointThree = setPointThree;
    }

    /**
     * 打印三角形的三个点的x和y坐标的值
     */
    public void printPoint() {
        System.out.println("(" + pointOne.getX() + "," + pointOne.getY() + ")" + "\n(" +
                pointTwo.getX() + "," + pointTwo.getY() + ")" + "\n(" +
                pointThree.getX() + "," + pointThree.getY() + ")");
    }

    public static void main(String[] args) {
        Triangle14 triangle14 = new Triangle14(
                new Point2D14(1, 2),
                new Point2D14(3, 4),
                new Point2D14(5, 6));
        triangle14.setPoint(
                new Point2D14(3, 4),
                new Point2D14(3, 3),
                new Point2D14(1, 2));
        triangle14.printPoint();
    }
}
