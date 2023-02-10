import ops.*;

import javax.swing.*;

public class Calculator {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton ACButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;

    double a, b, result;
    Operator op;

    // pediki
    public Calculator() {
        ACButton.addActionListener(e -> txtDisplay.setText(""));

        a7Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a7Button.getText()));
        a8Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a8Button.getText()));
        a9Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a9Button.getText()));
        a4Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a4Button.getText()));
        a5Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a5Button.getText()));
        a6Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a6Button.getText()));
        a1Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a1Button.getText()));
        a2Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a2Button.getText()));
        a3Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a3Button.getText()));
        a0Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a0Button.getText()));
        a00Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a00Button.getText()));
        button16.addActionListener(e -> {
            if (txtDisplay.getText().contains(".")) {
                double pm = Double.parseDouble(txtDisplay.getText());
                pm = pm * -1;
                txtDisplay.setText(String.valueOf(pm));
            }
            else {
                long PM = Long.parseLong(txtDisplay.getText());
                PM = PM * -1;
                txtDisplay.setText(String.valueOf(PM));
            }
        });
        button20.addActionListener(e -> {
            if (!txtDisplay.getText().contains(".")) {
                txtDisplay.setText(txtDisplay.getText() + button20.getText());
            }
        });
        button11.addActionListener(e -> {
            a = Double.parseDouble(txtDisplay.getText());
            op = Add.get();
            txtDisplay.setText("");
        });
        button2.addActionListener(e -> {
            a = Double.parseDouble(txtDisplay.getText());
            op = Subtract.get();
            txtDisplay.setText("");
        });
        button3.addActionListener(e -> {
            a = Double.parseDouble(txtDisplay.getText());
            op = Multiply.get();
            txtDisplay.setText("");
        });
        button4.addActionListener(e -> {
            a = Double.parseDouble(txtDisplay.getText());
            op = Divide.get();
            txtDisplay.setText("");
        });
        button6.addActionListener(e -> {

            if (txtDisplay.getText().length() > 0) {
                StringBuilder strB = new StringBuilder(txtDisplay.getText());
                strB.deleteCharAt(txtDisplay.getText().length() - 1);
                txtDisplay.setText(String.valueOf(strB));
            }
        });
        button5.addActionListener(e -> {
            b = Double.parseDouble(txtDisplay.getText());
            result = op.getResult(a, b);
            txtDisplay.setText(String.valueOf(result));
        });
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
