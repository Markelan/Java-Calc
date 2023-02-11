import ops.*;

import javax.swing.*;

public class Calculator {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton ACButton;
    private JButton addButton;
    private JButton subButton;
    private JButton multiButton;
    private JButton divButton;
    private JButton finalButton;
    private JButton backspaceButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton a00Button;
    private JButton pmButton;
    private JButton dotButton;

    private double a;
    private Operator o;

    private void step(double a, Operator o){
        this.a = a;
        this.o = o;
        txtDisplay.setText("");
    }

    public Calculator() {
        ACButton.addActionListener(e -> txtDisplay.setText(""));
        a9Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a9Button.getText()));
        a8Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a8Button.getText()));
        a7Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a7Button.getText()));
        a6Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a6Button.getText()));
        a5Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a5Button.getText()));
        a4Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a4Button.getText()));
        a3Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a3Button.getText()));
        a2Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a2Button.getText()));
        a1Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a1Button.getText()));
        a0Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a0Button.getText()));
        a00Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a00Button.getText()));
        pmButton.addActionListener(e -> txtDisplay.setText(String.valueOf((-1) * Double.parseDouble(txtDisplay.getText()))));
        dotButton.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + (txtDisplay.getText().contains(".") ? "" : dotButton.getText())));
        addButton.addActionListener(e -> this.step(Double.parseDouble(txtDisplay.getText()), Add.get()));
        subButton.addActionListener(e -> this.step(Double.parseDouble(txtDisplay.getText()), Subtract.get()));
        multiButton.addActionListener(e -> this.step(Double.parseDouble(txtDisplay.getText()), Multiply.get()));
        divButton.addActionListener(e -> this.step(Double.parseDouble(txtDisplay.getText()), Divide.get()));
        backspaceButton.addActionListener(e -> {
            if (txtDisplay.getText().length() > 0) {
                StringBuilder strB = new StringBuilder(txtDisplay.getText());
                txtDisplay.setText(String.valueOf(strB.deleteCharAt(txtDisplay.getText().length() - 1)));
            }
        });
        finalButton.addActionListener(e -> txtDisplay.setText(String.valueOf(o.getResult(a, Double.parseDouble(txtDisplay.getText())))));
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setLocationRelativeTo(null);
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
