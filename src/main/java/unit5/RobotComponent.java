package unit5;

import javax.swing.*;
import java.awt.*;

public class RobotComponent extends JComponent {

    Robot robot;
    public RobotComponent(Robot robot) {
    this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (RobotLine el : robot.getRobotLines()) {
            int x1 = (int) el.getX1();
            int y1 = (int) Math.round(el.getY1());
            int x2 = (int) Math.round(el.getX2());
            int y2 = (int) Math.round(el.getY2());

            g.drawLine(x1,y1,x2,y2);
        }
    }
}
