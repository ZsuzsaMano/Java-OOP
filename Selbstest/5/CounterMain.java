import javax.swing.*;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter(50);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CounterGUI(counter);
            }
        });
    }
}
