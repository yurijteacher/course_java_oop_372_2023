package unit6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

public class Calculation {

/*
====================
    Calculation  -=x
====================
        display
--------------------
7  8  9  /
4  5  6  *
1  2  3  -
0  ,  =  +
=====================
*/

    /*
                        AWT                 SWING
    El                  +                     +
    Manager Layout      +                     -
    Listener            +                     -

                       Frame                JFrame
                       Button               JButton
                       Panel                JPanel
                       Label                JLabel
     */


    double first = 0;
    double second = 0;
    String operation ="";
    JFrame frame;
    JTextField display;
    JButton b1,b2,b3,b4,
            b5,b6,b7,b8,
            b9, b10, b11, b12,
            b13, b14,b15, b16;

    JPanel panel;

    public Calculation() {

        frame = new JFrame("Calculation");

        display = new JTextField();

        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("/");

        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("*");

        b9 = new JButton("1");
        b10 = new JButton("2");
        b11 = new JButton("3");
        b12 = new JButton("-");

        b13 = new JButton("0");
        b14 = new JButton(",");
        b15 = new JButton("=");
        b16 = new JButton("+");

        panel = new JPanel();

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);

        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);

        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);

        GridLayout gridLayout = new GridLayout(4,4);
        panel.setLayout(gridLayout);

        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        Stream.of(display,b1,b2,b3,b4,b5,b6,b7,b8, b9, b10, b11, b12, b13, b14,b15, b16).forEach(el->{
            ((JComponent) el).setFont(new Font("Arial", Font.BOLD, 18));
        });


        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               display.setText(display.getText()+"7");
            }
        });


        b2.addActionListener(e -> {
            display.setText(display.getText()+"8");
        });

        Stream.of(b3, b5,b6,b7, b9,b10,b11, b13).forEach(el->{
            el.addActionListener(e -> {
                display.setText(display.getText()+el.getText());
            });
        });

        Stream.of(b4, b8, b12 ,b16).forEach(el->{
            el.addActionListener(e ->{
               // first = Double.parseDouble(display.getText());
                first = Double.valueOf(display.getText());
                operation = el.getText();
                display.setText("0");
            });
        });

        b14.addActionListener(el->{

            String text = display.getText();

            boolean logic = false;

            char[] chars = text.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]=='.') logic = true;
            }

            if(!logic) display.setText(display.getText()+ ".");
        });


        b15.addActionListener(e->{
            second = Double.parseDouble(display.getText());

            switch (operation){
                case ("/"):
                    if(second == 0) {display.setText("0");} else {
                        display.setText(String.valueOf(first/second));
                    }
                    break;
                case ("*"):
                    display.setText(first*second +"");
                    break;
                case ("+"):
                    display.setText(first+second +"");
                    break;
                case ("-"):
                    display.setText(first-second +"");
                    break;
            }


        });
    }
}
