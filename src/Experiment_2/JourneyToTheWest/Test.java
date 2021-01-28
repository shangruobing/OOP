package Experiment_2.JourneyToTheWest;

public class Test {
    public static void main(String[] args) {
        JourneyToTheWest journey = new JourneyToTheWest();
        journey.setRoleName("孙悟空");
        journey.setWeapon("金箍棒");
        journey.setPower(5);
        journey.setEndurance(5);
    /*  journey.setRoleName("唐僧");
        journey.setWeapon("无");
        journey.setPower(0);
        journey.setEndurance(5);
        journey.setRoleName("猪八戒");
        journey.setWeapon("九齿钉耙");
        journey.setPower(4);
        journey.setEndurance(2);
        journey.setRoleName("沙僧");
        journey.setWeapon("月牙铲");
        journey.setPower(3);
        journey.setEndurance(4);
     */
        System.out.println(journey.printRole());
    }
}
