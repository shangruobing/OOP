package Experiment_3;

public class TestApp {
    public static void main(String[] args) {

        TangSeng tangSeng = new TangSeng();
        tangSeng.setName("唐僧");
        tangSeng.setHealth(5);
        System.out.println(tangSeng.toString());

        WuKong wuKong = new WuKong();
        wuKong.setName("悟空");
        wuKong.setWeapon("金箍棒");
        wuKong.setPower(5);
        wuKong.setHealth(5);
        System.out.println(wuKong.toString());

        BaJie baJie = new BaJie();
        baJie.setName("八戒");
        baJie.setWeapon("九齿钉耙");
        baJie.setPower(4);
        baJie.setHealth(2);
        System.out.println(baJie.toString());

        ShaSeng shaSeng = new ShaSeng();
        shaSeng.setName("沙僧");
        shaSeng.setWeapon("月牙铲");
        shaSeng.setPower(3);
        shaSeng.setHealth(4);
        System.out.println(shaSeng.toString());

        BullDemon bullDemon = new BullDemon();
        bullDemon.setName("牛魔王");
        bullDemon.setWeapon("混铁棍");
        bullDemon.setPower(3);
        bullDemon.setHealth(3);
        System.out.println(bullDemon.toString());
    }
}
