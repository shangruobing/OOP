package Experiment_3;

public class TestApp {
    public static void main(String[] args) {
        TangSeng tangSeng = new TangSeng("唐僧",5);
        System.out.println(tangSeng.toString());

        WuKong wuKong = new WuKong("悟空","金箍棒",5,5);
        System.out.println(wuKong.toString());

        BaJie baJie = new BaJie("八戒","九齿钉耙",4,2);
        System.out.println(baJie.toString());

        ShaSeng shaSeng = new ShaSeng("沙僧","月牙铲",3,4);
        System.out.println(shaSeng.toString());

        BullDemon bullDemon = new BullDemon("牛魔王","混铁棍",3,3);
        System.out.println(bullDemon.toString());
    }
}
