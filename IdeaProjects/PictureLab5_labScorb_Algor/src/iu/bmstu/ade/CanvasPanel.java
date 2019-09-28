package iu.bmstu.ade;

import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    private int side = 20;
    private Color color = Color.RED;


    public void setSide(int s){
        side = s;
        repaint();
    }
    public void setColor(Color color){
        this.color = color;
        repaint();
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        int p = 105;
        //p = p + (side - 20);
        //g.drawOval(p+ side/2,p+ side/2 ,side,side);
        if (side > 0) {
            g.drawOval(p + side / 2, p + side / 2, side, side);

            g.setColor(Color.BLACK);
            g.drawOval(p, p, side * 2, side * 2);
            g.drawRect(p, p, side * 2, side * 2);

            //g.drawOval(p ,p ,side*2,side*2);
            //g.drawRect(p,p,side*2,side*2);
            double f = (side * Math.sqrt(3)) / 2;
            int d = (int) f;
            int t = (int) (Math.sqrt(2) - 1) * side * 2;
            // g.drawPolygon(new int[]{p+t+ side,p+t+d+side,p+t-d+side},new int[] {p+t,p + 4*side/3 + side/6,p+ 4*side/3+ side/6},3);
            g.drawPolygon(new int[]{p + t + side, p + t + d + side, p + t - d + side}, new int[]{p + t, p + 4 * side / 3 + side / 6, p + 4 * side / 3 + side / 6}, 3);
        } else if (side <= 0){
            System.out.println("Ввуден радиус меньше нуля!");
        }

    }
}
