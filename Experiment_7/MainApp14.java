package Experiment_7;

/**
 * @author 冰
 */
public class MainApp14 {

    public static void main(String[] args) {
        SofaBed14 sofaBed = new SofaBed14();

        SleepSpace14[] bed = new SleepSpace14[3];
        bed[0] = new Bed14(1);
        bed[1] = new Bed14(2);
        bed[2] = sofaBed;

        SeatSpace14[] sofa = new SeatSpace14[3];
        sofa[0] = new Sofa14(1);
        sofa[1] = new Sofa14(2);
        sofa[2] = sofaBed;

        //统计床位数
        int bedCapacity = 0;
        for (int i = 0; i < bed.length; i++) {
            bedCapacity += bed[i].getSleepCapacity();
        }

        //统计座位数
        int sofaCapacity = 0;
        for (int i = 0; i < sofa.length; i++) {
            sofaCapacity += sofa[i].getSeatCapacity();
        }

        System.out.println("床位数：" + bedCapacity);
        System.out.println("座位数：" + sofaCapacity);

    }
}
