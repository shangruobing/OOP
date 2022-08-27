package Experiment_2.Test;

import Experiment_2.Model.Formula14;

import javax.swing.*;
import java.awt.*;

/**
 * @author 冰
 */
public class MainApp14 {
    private final JTextField inputTextFiledA;
    private final JTextField inputTextFiledB;
    private final JTextArea resultTextArea;

    public MainApp14() {
        JPanel mainPanel = new JPanel();
        mainPanel.add(inputTextFiledA = new JTextField(8));
        mainPanel.add(new Label("X +"));
        mainPanel.add(inputTextFiledB = new JTextField(8));
        mainPanel.add(new Label(" = 0"));
        JButton solveButton;
        mainPanel.add(solveButton = new JButton("求解"));
        JFrame frame = new JFrame("一元一次方程 尚若冰");
        frame.add(mainPanel, BorderLayout.NORTH);
        frame.add(resultTextArea = new JTextArea(), BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        solveButton.addActionListener(e -> {
            try {
                Formula14 formula = new Formula14();
                formula.setA(Double.parseDouble(inputTextFiledA.getText()));
                formula.setB(Double.parseDouble(inputTextFiledB.getText()));
                formula.setRoot();
                resultTextArea.setText(String.valueOf(formula.getRoot()));
            } catch (NumberFormatException ex) {
                resultTextArea.setText("非法输入");
            }
        });
    }

    public static void main(String[] args) {
        new MainApp14();
    }
}
