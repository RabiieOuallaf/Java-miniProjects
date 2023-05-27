package TwoD;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame() {
        panel = new MyPanel();

        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


}
