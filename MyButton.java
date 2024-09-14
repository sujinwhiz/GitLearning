package GitLearning;

import javax.swing.*;
import java.awt.*;

public class MyButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyButton");
        frame.setLayout(new FlowLayout());
        frame.setSize(600,600);
        frame.setResizable(false);
        JButton button = new JButton("CLICK ME");
        button.addActionListener(e -> {
                JLabel label = new JLabel("https://github.com/sujinwhiz/ArcadeMap.git");
                label.setOpaque(true);
                label.setSize(100,40);
                frame.add(label);
                frame.revalidate();
                frame.repaint();
            }
        );
        frame.add(button);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
