package Calculator;

import javax.swing.SwingUtilities;

public class CalculatorMain {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalcGUI();
            }
        });

    }

}
