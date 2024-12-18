package task3;

import javax.swing.*;

public class ImageDisplay extends JFrame {

    public ImageDisplay(String imagePath) {
        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1920, 1080);
        setLocationRelativeTo(null);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(imageIcon);

        add(label);
    }

    public static void main(String[] args) {

        String imagePath = "/Users/user/Downloads/pic5.jpg";

        SwingUtilities.invokeLater(() -> {
            ImageDisplay frame = new ImageDisplay(imagePath);
            frame.setVisible(true);
        });
    }
}