import javax.swing.*;
import java.awt.*;

public class MyPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);

        // Add a button to the panel
        JButton button = new JButton("Click Me");
        panel.add(button);

        // Add panel to frame
        frame.add(panel);

        frame.setVisible(true);
    }
}
