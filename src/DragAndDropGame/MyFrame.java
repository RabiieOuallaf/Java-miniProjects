package DragAndDropGame;

import javax.swing.*;

public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();
    MyFrame() {
        this.add(dragPanel);
        this.setTitle("Drag and Drop Demo");
        this.setSize(1600,1700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
