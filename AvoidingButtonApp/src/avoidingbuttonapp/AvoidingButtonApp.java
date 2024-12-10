package avoidingbuttonapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AvoidingButtonApp extends JFrame {
    private JButton yesButton;
    private JButton noButton;
    private JLabel questionLabel;

    public AvoidingButtonApp() {
        // Set up frame
        setTitle("pertanyaan buat kamu nih");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Add label
        questionLabel = new JLabel("Are you gay/lesbian?");
        questionLabel.setBounds(150, 30, 200, 30);
        add(questionLabel);

        // Add 'Yes' button
        yesButton = new JButton("Yes");
        yesButton.setBounds(100, 100, 80, 30);
        yesButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "okeyyy tobat broo!"));
        add(yesButton);

        // Add 'No' button
        noButton = new JButton("No");
        noButton.setBounds(200, 100, 80, 30);
        noButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Randomly move the button
                int x = (int) (Math.random() * (getWidth() - noButton.getWidth() - 50));
                int y = (int) (Math.random() * (getHeight() - noButton.getHeight() - 50));
                noButton.setLocation(x, y);
            }
        });
        add(noButton);

        // Center the frame
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AvoidingButtonApp app = new AvoidingButtonApp();
            app.setVisible(true);
        });
    }
}
