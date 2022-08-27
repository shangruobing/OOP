package Experiment_6;

/**
 * @author 冰
 */
public class Triangle14 extends Shape14 {

    public Triangle14() {
    }

    public Triangle14(double lengthOne, double lengthTwo, double lengthThree) {
        length = new double[3];
        length[0] = lengthOne;
        length[1] = lengthTwo;
        length[2] = lengthThree;
    }

    private double getPerimeter() {
        return length[0] + length[1] + length[2];
    }

    @Override
    public double getArea() {
        double r = getPerimeter() / 2;
        return Math.sqrt(r * (r - length[0]) * (r - length[1]) * (r - length[2]));
    }
}
