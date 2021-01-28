package Experiment_1.Test;

import Experiment_1.Module.Formula;
import Experiment_1.Module.Result;

import javax.swing.*;
import java.awt.*;

public class Interface {
    private final JTextField inputTextFieldA;
    private final JTextField inputTextFieldB;
    private final JTextField inputTextFieldC;
    private final JTextField doubleTextField;
    private final JTextArea resultTextArea;
    private final Result result;

    public Interface() {
        JPanel mainPanel = new JPanel();
        mainPanel.add(inputTextFieldA = new JTextField(10));
        mainPanel.add(new JLabel("X^2 +"));
        mainPanel.add(inputTextFieldB = new JTextField(10));
        mainPanel.add(new JLabel("X +"));
        mainPanel.add(inputTextFieldC = new JTextField(10));
        mainPanel.add(new JLabel("= 0"));
        JButton solveButton;
        mainPanel.add(solveButton = new JButton("求解"));
        mainPanel.add(doubleTextField = new JTextField(5));
        JButton doubleButton;
        mainPanel.add(doubleButton = new JButton("翻倍"));
        JFrame mainFrame = new JFrame("一元二次方程计算器");
        mainFrame.add(mainPanel, BorderLayout.NORTH);
        mainFrame.add(resultTextArea = new JTextArea(), BorderLayout.SOUTH);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        result = new Result();
        solveButton.addActionListener(e -> {  //Lambda表达式
            if (!inputTextFieldA.getText().equals(""))
                Formula.getInstance().setA(Double.parseDouble(inputTextFieldA.getText()));
            else
                Formula.getInstance().setA(0);
            if (!inputTextFieldB.getText().equals(""))
                Formula.getInstance().setB(Double.parseDouble(inputTextFieldB.getText()));
            else
                Formula.getInstance().setB(0);
            if (!inputTextFieldC.getText().equals(""))
                Formula.getInstance().setC(Double.parseDouble(inputTextFieldC.getText()));
            else
                Formula.getInstance().setC(0);
            result.setRoot(result.getRoot());
            result.setImaginary(result.getImaginary());
            resultTextArea.setText(result.toString());
        });
        doubleButton.addActionListener(e -> {
            result.setRoot(result.getRoot() * Double.parseDouble(doubleTextField.getText()));
            result.setImaginary(result.getImaginary() * Double.parseDouble(doubleTextField.getText()));
            resultTextArea.setText(result.toString());
        });
    }

    public static void main(String[] args) {
        new Interface();
    }
}
