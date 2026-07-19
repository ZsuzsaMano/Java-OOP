package Calculator;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class CalcGUI {
    public CalcGUI() {
        JFrame f = new JFrame("Calculator");
        f.setLayout(new GridLayout(4, 1, 5, 5));
        JTextField text = new JTextField();
        JPanel p1 = new JPanel(new BorderLayout());
        JPanel p2 = new JPanel(new GridLayout(3, 3, 5, 5));
        JPanel p3 = new JPanel(new GridLayout(1, 4, 5, 5));
        JPanel p4 = new JPanel(new BorderLayout());
        final JButton[] nrButtons = new JButton[9];
        for (int i = 0; i < nrButtons.length; i++) {
            nrButtons[i] = new JButton(String.valueOf(i));
        }
        final JButton[] opButtons = new JButton[4];
        final String[] names = { "+", "-", "*", "/" };
        for (int i = 0; i < opButtons.length; i++) {
            opButtons[i] = new JButton(names[i]);
        }
        JButton result = new JButton("=");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);
        p1.add(text);
        for (int i = 0; i < nrButtons.length; i++) {
            p2.add(nrButtons[i]);
        }
        for (int i = 0; i < opButtons.length; i++) {
            p3.add(opButtons[i]);
        }
        p4.add(result);

        f.setSize(200, 200);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}
