import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.*;

public class CounterGUI {
    Counter counter;

    public CounterGUI(Counter counter) {
        this.counter = counter;
        JFrame f = new JFrame("Counter");
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        TextField text = new TextField(counter.toString());
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        JButton decrease = new JButton("<");
        JButton increase = new JButton(">");
        JButton reset = new JButton("Reset");

        decrease.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.decrement();
                text.setText(counter.toString());

            }
        });
        increase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.increment();
                text.setText(counter.toString());
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter.reset();
                text.setText(counter.toString());

            }
        });
        f.add(p);
        p.add(decrease);
        p.add(text);
        p.add(increase);
        f.add(reset, BorderLayout.SOUTH);
        f.setSize(200, 100);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

}
