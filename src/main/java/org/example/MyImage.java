package org.example;

import javax.swing.*;

public interface MyImage {
    void display();
    JFrame getFrame();
    ImageIcon getImageIcon(String filename);
    JLabel getJLabel(ImageIcon icon);
}
