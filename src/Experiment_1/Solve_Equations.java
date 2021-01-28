package Experiment_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Solve_Equations implements ActionListener {
    private JTextField factor_A, factor_B, factor_C, textField;

    public static void main(String[] args) {
        Solve_Equations solve = new Solve_Equations();
        solve.run();
    }

    public void run() {
        JFrame frame = new JFrame("求解一元二次方程");
        JLabel jLabel1 = new JLabel("X^2 +");
        JLabel jLabel2 = new JLabel("X +");
        JLabel jLabel3 = new JLabel("= 0");
        JButton calculate = new JButton("求解");
        factor_A = new JTextField(5);
        factor_B = new JTextField(5);
        factor_C = new JTextField(5);
        textField = new JTextField(30);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());
        frame.add(factor_A);
        frame.add(jLabel1);
        frame.add(factor_B);
        frame.add(jLabel2);
        frame.add(factor_C);
        frame.add(jLabel3);
        frame.add(calculate);
        frame.add(textField);
        frame.setVisible(true);
        calculate.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Factor factor = new Factor();
        if (!factor_A.getText().equals(""))  //判断ABC是否为空
            factor.setA(Double.parseDouble(factor_A.getText()));
        else
            factor.setA(0);

        if (!factor_B.getText().equals(""))
            factor.setB(Double.parseDouble(factor_B.getText()));
        else
            factor.setB(0);

        if (!factor_C.getText().equals(""))
            factor.setC(Double.parseDouble(factor_C.getText()));
        else
            factor.setC(0);
        double delta = factor.getB() * factor.getB() - 4 * factor.getA() * factor.getC();
        double x1, x2, x, i;
        if (factor.getA() != 0) {
            if (delta >= 0) { //方程存在1个及以上实根
                x1 = (-factor.getB() + Math.sqrt(delta)) / (2 * factor.getA());
                x2 = (-factor.getB() - Math.sqrt(delta)) / (2 * factor.getA());
                if (x1!=x2)
                    textField.setText(x1 + "和" + x2);
                else
                    textField.setText(String.valueOf(x1));
                factor.setResult1(x1);
                factor.setResult2(x2);

            }
            else {  //方程只有虚根
                x = -factor.getB() / (2 * factor.getA());
                i = Math.sqrt(-delta) / (2 * factor.getA());
                textField.setText(x + "±" + i + " i");
                factor.setResult1(x);
                factor.setResult2(i);
            }
        } else if (factor.getB() == 0)
            textField.setText("等式不成立");
        else  //退化为 求解一元一次方程
            textField.setText(String.valueOf(-factor.getC() / factor.getB()));

    }
}