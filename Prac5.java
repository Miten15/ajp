import java.awt.*;

import javax.swing.*;

class Prac5 {
    Prac5() {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(new GridLayout(5, 5));

        for (int i = 1; i <= 25; i++) {
            JButton b = new JButton("Button " + i);
            f.add(b);
        }
    }

    public static void main(String[] args) {
        new Prac5();
    }
}