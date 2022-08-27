package Experiment_8.control;

import Experiment_8.view.Console14;
import Experiment_8.view.Interface14;
import Experiment_8.view.Swing14;

import java.util.Scanner;

/**
 * @author 冰
 */
public class MainApp14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入需要的版本 0:终端界面 1:简易计算器 2:计算器");
        int num = scan.nextInt();
        switch (num) {
            // 终端界面
            case 0 -> new Console14();
            // 简易计算器界面
            case 1 -> new Interface14();
            // 计算器界面
            case 2 -> new Swing14();
        }
    }
}
