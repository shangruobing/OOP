package Experiment_8.view;

import Experiment_8.control.Context14;
import Experiment_8.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author 冰
 */
public class Swing14 extends JFrame implements ActionListener {
    private double number1, number2;
    private JMenuBar menuBar;
    private String num = "";
    private final Context14 calculate = new Context14();
    private final String[] KEYS = {"^", "C", "←", "÷", "7", "8", "9", "*", "4", "5", "6",
            "-", "1", "2", "3", "+", "%", "0", ".", "="};
    private final JButton[] keys = new JButton[KEYS.length];
    private final JTextField resultText = new JTextField("0");

    public Swing14() {
        init();
        this.setTitle("计算器");
        this.setResizable(false);
        this.setJMenuBar(menuBar);
        this.setSize(225, 225);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void init() {
        resultText.setHorizontalAlignment(JTextField.RIGHT);
        resultText.setEditable(false);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 4, 3, 3));
        for (int i = 0; i < KEYS.length; i++) {
            keys[i] = new JButton(KEYS[i]);
            mainPanel.add(keys[i]);
            keys[i].addActionListener(this);
        }
        JMenu check = new JMenu("查看");
        check.add(new JMenuItem("author:冰"));
        check.add(new JMenuItem("time:2021-4-27"));
        menuBar = new JMenuBar();
        menuBar.add(check);
        menuBar.add(new JMenu("帮助"));
        menuBar.add(new JMenu("编辑"));
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(resultText, BorderLayout.NORTH);
        getContentPane().add(mainPanel, BorderLayout.SOUTH);
    }

    private boolean isOperand(ActionEvent e) {
        String[] number = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "←", "%"};
        for (String str : number) {
            if (str.equals(e.getActionCommand())) {
                return true;
            }
        }
        return false;
    }

    private boolean isOperator(ActionEvent e) {
        String[] items = new String[]{"+", "-", "*", "÷", "^", "C"};
        for (String str : items) {
            if (str.equals(e.getActionCommand())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {
        try {
            if (isOperand(e)) {
                if ("←".equals(e.getActionCommand())) {
                    num = num.substring(0, num.length() - 1);
                } else {
                    if ("%".equals(e.getActionCommand())) {
                        num = String.valueOf(Double.parseDouble(num) / 100);
                    } else {
                        num += e.getActionCommand();
                    }
                }
                resultText.setText(num);
            } else if ("=".equals(e.getActionCommand())) {
                number2 = Double.parseDouble(num);
                resultText.setText(String.valueOf(calculate.executeStrategy(number1, number2)));
                num = (String.valueOf(calculate.executeStrategy(number1, number2)));
            } else if (isOperator(e)) {
                number1 = Double.parseDouble(num);
                num = "";
                resultText.setText(e.getActionCommand());
                switch (e.getActionCommand()) {
                    case "+" -> calculate.setStrategy(new Add14());
                    case "-" -> calculate.setStrategy(new Subtract14());
                    case "*" -> calculate.setStrategy(new Multiple14());
                    case "÷" -> calculate.setStrategy(new Division14());
                    case "^" -> calculate.setStrategy(new Power14());
                    case "C" -> resultText.setText(String.valueOf(0));
                }
            }
        } catch (
                NumberFormatException nfe) {
            resultText.setText("非法表达式");
        }
    }
}