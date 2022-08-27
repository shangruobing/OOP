package Experiment_8.view;

import Experiment_8.control.Context14;
import Experiment_8.model.*;

import java.util.Scanner;

/**
 * @author 冰
 */
public class Console14 {

    public Console14() {
        System.out.println("请输入第一个数");
        Scanner scan = new Scanner(System.in);
        double number1 = scan.nextDouble();
        System.out.println("请输入运算符(+ - * / ^)");
        String operator = scan.next();
        System.out.println("请输入第二个数");
        double number2 = scan.nextDouble();
        Context14 calculate = new Context14();
        switch (operator) {
            case "+" -> calculate.setStrategy(new Add14());
            case "-" -> calculate.setStrategy(new Subtract14());
            case "*" -> calculate.setStrategy(new Multiple14());
            case "/" -> calculate.setStrategy(new Division14());
            case "^" -> calculate.setStrategy(new Power14());
        }
        System.out.print(number1 + operator + number2 + "=");
        System.out.println(calculate.executeStrategy(number1, number2));
    }
}
