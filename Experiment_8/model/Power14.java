package Experiment_8.model;

/**
 * @author 冰
 */
public class Power14 implements Calculator14 {
    @Override
    public double compute(double a, double b) {
        return Math.pow(a,b);
    }
}
