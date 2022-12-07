import java.awt.*;
import java.applet.*;

public class Fish {
    public static void drawBody(Graphics g){

        g.setColor(new Color(110,200,230));
        g.fillArc(300,400,300,100,180,-180);
        g.fillArc(300,400,300,100,180,180);

    }
    public static void drawFace(Graphics g){

        g.setColor(Color.black);
        g.drawArc(568,450,50,15,270,-75);

        g.fillOval(560,430,15,15);
        g.setColor(Color.white);
        g.fillOval(567,437,5,5);

        g.setColor(Color.black);
        g.drawArc(525,420,5,55,90,-180);
        g.drawArc(530,425,5,45,90,-180);
        g.drawArc(535,430,5,35,90,-180);

    }
    public static void drawTail(Graphics g){

        Polygon tail = new Polygon();
        g.setColor(new Color(110,200,230));
        tail.addPoint(315,440);
        tail.addPoint(315,460);
        tail.addPoint(280,480);
        tail.addPoint(280,420);

        g.fillPolygon(tail);

    }
}
