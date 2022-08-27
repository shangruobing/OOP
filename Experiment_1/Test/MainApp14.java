package Experiment_1.Test;

import Experiment_1.Model.Formula14;

import javax.swing.*;
import java.awt.*;

/**
 * @author 冰
 */
public class MainApp14 {
    private final JTextField inputTextFieldA;
    private final JTextField inputTextFieldB;
    private final JTextField inputTextFieldC;
    private final JTextArea resultTextArea;

    public MainApp14() {
        JPanel mainPanel = new JPanel();
        mainPanel.add(inputTextFieldA = new JTextField(10));
        mainPanel.add(new JLabel("X² +"));
        mainPanel.add(inputTextFieldB = new JTextField(10));
        mainPanel.add(new JLabel("X +"));
        mainPanel.add(inputTextFieldC = new JTextField(10));
        mainPanel.add(new JLabel("= 0"));
        JButton solveButton;
        mainPanel.add(solveButton = new JButton("求解"));
        JFrame mainFrame = new JFrame("一元二次方程计算器--尚若冰");
        mainFrame.add(mainPanel, BorderLayout.NORTH);
        mainFrame.add(resultTextArea = new JTextArea(), BorderLayout.SOUTH);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        solveButton.addActionListener(e -> {
            try {
                Formula14 formula = new Formula14();
                formula.setA(Double.parseDouble(inputTextFieldA.getText()));
                formula.setB(Double.parseDouble(inputTextFieldB.getText()));
                formula.setC(Double.parseDouble(inputTextFieldC.getText()));
                formula.setResult();
                resultTextArea.setText(formula.toString());
            } catch (NumberFormatException ex) {
                resultTextArea.setText("非法输入");
            }
        });
    }

    public static void main(String[] args) {
        new MainApp14();
    }
}