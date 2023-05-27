package TempetureGame;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class SliderDemo implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    SliderDemo() {
        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100);

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(20);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN,15));

        slider.setPreferredSize(new Dimension(400,200));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Celcius = "+ slider.getValue());
        label.setFont(new Font("MV Boli", Font.BOLD, (slider.getValue()+30) / 3));


    }
}
