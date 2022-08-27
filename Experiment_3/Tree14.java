package Experiment_3;

/**
 * 建模树的类
 *
 * @author 冰
 */
public class Tree14 {
    private int height;

    /**
     * 无参构造函数，将属性高度初始化为0
     */
    public Tree14() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    /**
     * @param height 对树高度height初始化
     */
    public Tree14(int height) {
        System.out.println("Creating new Tree that is " + height + " feet tall");
        this.height = height;
    }

    /**
     * @param height 对树高度height初始化
     * @param s      打印的字符串信息
     */
    public Tree14(int height, String s) {
        this(height);
        System.out.println(s);
    }

    /**
     * 打印树高度的信息
     */
    public void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * 打印树高度的信息
     *
     * @param s 打印的字符串信息
     */
    public void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }

    /**
     * 演示方法重载
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree14 tree14 = new Tree14(i);
            tree14.info();
            tree14.info("Overloaded Method");
            System.out.println();
        }
        new Tree14();
    }
}
