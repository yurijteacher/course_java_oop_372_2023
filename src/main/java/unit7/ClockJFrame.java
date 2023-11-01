package unit7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClockJFrame {
    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockJFrame() {

        frame = new JFrame("MyClock");
        panel = new JPanel();
        label = new JLabel();

        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(300, 60);

        ClockExt clockExt = new ClockExt(17, 57, 0);

//        Timer timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                clockExt.nextSecond();
//                label.setText(clockExt.toString());
//            }
//        });

        Timer timer = new Timer(1000, e -> {
            clockExt.nextSecond();
            label.setText(clockExt.toString());
        });

        timer.start();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);


    }
}
