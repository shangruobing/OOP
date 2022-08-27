package Experiment_8.view;

import Experiment_8.control.Context14;
import Experiment_8.model.*;

import javax.swing.*;

/**
 * @author 冰
 */
public class Interface14 {
    private final JTextField number1, number2, resultField;
    String[] items = new String[]{"+", "-", "*", "/", "^"};

    public Interface14() {
        JFrame frame = new JFrame("简单计算器");
        JComboBox<String> jComboBox = new JComboBox<>(items);
        JPanel mainPanel = new JPanel();
        mainPanel.add(number1 = new JTextField(10));
        mainPanel.add(jComboBox);
        mainPanel.add(number2 = new JTextField(10));
        JButton result = new JButton("=");
        mainPanel.add(result);
        mainPanel.add(resultField = new JTextField(5));
        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        result.addActionListener(e -> {
            Context14 calculate = new Context14();
            switch (jComboBox.getSelectedIndex()) {
                case 0 -> calculate.setStrategy(new Add14());
                case 1 -> calculate.setStrategy(new Subtract14());
                case 2 -> calculate.setStrategy(new Multiple14());
                case 3 -> calculate.setStrategy(new Division14());
                case 4 -> calculate.setStrategy(new Power14());
            }
            resultField.setText(String.valueOf(calculate.executeStrategy(
                    Double.parseDouble(number1.getText()), Double.parseDouble(number2.getText()))));
        });
    }
}