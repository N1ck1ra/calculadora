package calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Classe responsável pela interface gráfica da calculadora.
 */
public class CalculatorGUI extends JFrame {

    private final JTextField fieldA;
    private final JTextField fieldB;
    private final JLabel resultLabel;
    private final Calculator calculator;

    public CalculatorGUI() {
        calculator = new Calculator();

        setTitle("Calculadora Java");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(240, 248, 255));
        panel.setLayout(new GridLayout(6, 2, 5, 5));

        panel.add(new JLabel("Número 1:"));
        fieldA = new JTextField();
        panel.add(fieldA);

        panel.add(new JLabel("Número 2:"));
        fieldB = new JTextField();
        panel.add(fieldB);

        JButton addBtn = new JButton("+");
        addBtn.setBackground(Color.GREEN);
        addBtn.addActionListener(e -> calculate("add"));
        panel.add(addBtn);

        JButton subBtn = new JButton("-");
        subBtn.setBackground(Color.YELLOW);
        subBtn.addActionListener(e -> calculate("subtract"));
        panel.add(subBtn);

        JButton mulBtn = new JButton("×");
        mulBtn.setBackground(Color.CYAN);
        mulBtn.addActionListener(e -> calculate("multiply"));
        panel.add(mulBtn);

        JButton divBtn = new JButton("÷");
        divBtn.setBackground(Color.PINK);
        divBtn.addActionListener(e -> calculate("divide"));
        panel.add(divBtn);

        panel.add(new JLabel("Resultado:"));
        resultLabel = new JLabel("");
        panel.add(resultLabel);

        add(panel);
    }

    private void calculate(String operation) {
        try {
            double a = Double.parseDouble(fieldA.getText());
            double b = Double.parseDouble(fieldB.getText());
            double result = 0;

            switch (operation) {
                case "add" -> result = calculator.add(a, b);
                case "subtract" -> result = calculator.subtract(a, b);
                case "multiply" -> result = calculator.multiply(a, b);
                case "divide" -> result = calculator.divide(a, b);
            }

            resultLabel.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite números válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
