package Experiment_7;

/**
 * @author 冰
 */
public class Bed14 implements SleepSpace14{
    private int sleepCapacity;

    public Bed14() {
    }

    public Bed14(int sleepCapacity) {
        this.sleepCapacity = sleepCapacity;
    }

    @Override
    public int getSleepCapacity() {
        return sleepCapacity;
    }

    @Override
    public String toString() {
        return "sleepCapacity=" + sleepCapacity;
    }
}
