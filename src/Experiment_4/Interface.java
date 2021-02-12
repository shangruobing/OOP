package Experiment_4;

import javax.swing.*;
import java.awt.*;

public class Interface {
    private final JTextField inputTextFiledA;
    private final JTextField inputTextFiledB;
    private final JTextField inputTextFiledMultiple;
    private final JButton solveButton;
    private final JButton multipleButton;
    private final JTextArea resultTextArea;

    public Interface() {
        JPanel mainPanel = new JPanel();
        mainPanel.add(inputTextFiledA = new JTextField(8));
        mainPanel.add(new Label("X +"));
        mainPanel.add(inputTextFiledB = new JTextField(8));
        mainPanel.add(new Label(" = 0"));
        mainPanel.add(solveButton = new JButton("求解"));
        mainPanel.add(inputTextFiledMultiple = new JTextField(5));
        mainPanel.add(multipleButton = new JButton("乘积"));
        JFrame frame = new JFrame("一元一次方程计算器");
        frame.add(mainPanel, BorderLayout.NORTH);
        frame.add(resultTextArea = new JTextArea(), BorderLayout.SOUTH);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Result result = new Result();
        solveButton.addActionListener(e -> {
            if (!inputTextFiledA.getText().equals(""))
                Formula.getInstance().setA(Double.parseDouble(inputTextFiledA.getText()));
            else
                Formula.getInstance().setA(0);
            if (!inputTextFiledB.getText().equals(""))
                Formula.getInstance().setB(Double.parseDouble(inputTextFiledB.getText()));
            else
                Formula.getInstance().setB(0);
            result.setDenominator(Formula.getInstance().getA());
            result.setNumerator(Formula.getInstance().getB());
            resultTextArea.setText(result.toFraction());
        });
        multipleButton.addActionListener(e ->
                resultTextArea.setText("乘积操作后的值为 : " + (result.getRoot() *
                        Double.parseDouble(inputTextFiledMultiple.getText()))));
    }

    public static void main(String[] args) {
        new Interface();
    }
}
