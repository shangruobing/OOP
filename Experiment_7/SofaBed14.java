package Experiment_7;

/**
 * @author 冰
 */
public class SofaBed14 implements SleepSpace14, SeatSpace14 {
    private int seatCapacity;
    private int sleepCapacity;

    public SofaBed14() {
        seatCapacity = 3;
        sleepCapacity = 2;
    }

    public SofaBed14(int seatCapacity, int sleepCapacity) {
        this.seatCapacity = seatCapacity;
        this.sleepCapacity = sleepCapacity;
    }

    @Override
    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public int getSleepCapacity() {
        return sleepCapacity;
    }

    @Override
    public String toString() {
        return "seatCapacity=" + seatCapacity + "\nsleepCapacity=" + sleepCapacity;
    }
}
