package Calculator.Test;

import Calculator.Module1.Formula;
import Calculator.Module1.Result;

import javax.swing.*;
import java.awt.*;

public class Interface {
    private JTextField inputTextFieldA, inputTextFieldB, inputTextFieldC;
    private JButton solveButton;
    private JTextArea resultTextArea;

    public Interface() {
        JPanel mainPanel = new JPanel();
        mainPanel.add(inputTextFieldA = new JTextField(10));
        mainPanel.add(new JLabel("X^2 +"));
        mainPanel.add(inputTextFieldB = new JTextField(10));
        mainPanel.add(new JLabel("X +"));
        mainPanel.add(inputTextFieldC = new JTextField(10));
        mainPanel.add(new JLabel("= 0"));
        mainPanel.add(solveButton = new JButton("求解"));
        JFrame mainFrame = new JFrame("一元二次方程计算器");
        mainFrame.add(mainPanel, BorderLayout.NORTH);
        mainFrame.add(resultTextArea = new JTextArea(), BorderLayout.SOUTH);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
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

            Result result = new Result();
            resultTextArea.setText(result.toString());
        });
    }

    public static void main(String[] args) {
        new Interface();
    }
}
