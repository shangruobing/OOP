package Experiment_7;

/**
 * @author 冰
 */
public class Sofa14 implements SeatSpace14 {
    private int seatCapacity;

    public Sofa14() {
    }

    public Sofa14(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    @Override
    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return "seatCapacity=" + seatCapacity;
    }
}
