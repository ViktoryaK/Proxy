package org.example;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RealImage implements MyImage {
    private JFrame frame;
    private JLabel label;
    private ImageIcon icon;

    public RealImage(String filename) {
        frame = new JFrame();
        ImageIcon icon = new ImageIcon(filename);
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public void display() {
        frame.setVisible(true);
    }

    @Override
    public JFrame getFrame() {
        return frame;
    }

    @Override
    public ImageIcon getImageIcon(String filename) {
        return icon;
    }

    @Override
    public JLabel getJLabel(ImageIcon icon) {
        return label;
    }
}