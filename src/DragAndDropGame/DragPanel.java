package DragAndDropGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon image = new ImageIcon("ana.JPG"); // Get the imge
//    final int Width = image.getIconWidth(); // Get the width of the image
//    final int Height = image.getIconHeight(); // Get the height of the image
    Point imageCorner; // Declare a point that locates the position of the image currently
    Point prevPoint; // Declate a point variable that locates the previous position of the image

    DragPanel() {
        imageCorner = new Point(0,0); // I sat the imageCorner variable above with Point data type
        ClickListener clickListener = new ClickListener(); // instantiate a new ClickListener class
        DragListener dragListener = new DragListener(); // Instantiate a new DragListener class
        this.addMouseListener(clickListener); // enable the panel to listen to click events
        this.addMouseMotionListener(dragListener); // enable the panel to listen to drag events

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }
    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            prevPoint = e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
            public void mouseDragged(MouseEvent e) {
                Point currentPT = e.getPoint();
                imageCorner.translate(
                        (int)(currentPT.getX() - prevPoint.getX()),
                        (int)(currentPT.getY() - prevPoint.getY())
                );
                prevPoint = currentPT;
                repaint();
            }
    }
}
