package Experiment_6;

/**
 * @author 冰
 */
public class Parallelogram14 extends Shape14 {
    private double angle;

    public Parallelogram14(double lengthOne, double lengthTwo, double angle) {
        length = new double[3];
        length[0] = lengthOne;
        length[1] = lengthTwo;
        this.angle = Math.toRadians(angle);
    }

    @Override
    public double getArea() {
        return length[0] * length[1] * Math.sin(angle);
    }
}
