package Experiment_8.control;

import Experiment_8.model.Calculator14;

/**
 * @author 冰
 */
public class Context14 {
    private Calculator14 strategy;

    public Context14() {
    }

    public Context14(Calculator14 strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Calculator14 strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double a, double b){
        return strategy.compute(a,b);
    }
}
