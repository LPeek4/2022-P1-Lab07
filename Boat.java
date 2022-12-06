import java.awt.*;
import java.applet.*;

public class Boat {
    public static void drawBoat(Graphics g){

        g.setColor(new Color(185,125,65));
        g.fillArc(200,150,300,250,270,-90);
        g.fillArc(100,150,600,250,270,90);
        g.fillRect(350,275,50,125);

        g.setColor(Color.blue);
        g.fillRect(0,325,1000,200);

    }
    public static void drawMasts(Graphics g){

        g.setColor(new Color(165,110,60));
        g.fillRect(400,50,15,225);
        g.fillRect(500,100,15,175);

    }
    public static void drawSales(Graphics g){

        g.setColor(new Color(245,245,245));
        Polygon sale2 = new Polygon();
        sale2.addPoint(515,100);
        sale2.addPoint(515,250);
        sale2.addPoint(625,225);
        g.fillPolygon(sale2);

        g.setColor(new Color(250,250,250));
        Polygon sale1 = new Polygon();
        sale1.addPoint(415,50);
        sale1.addPoint(415,250);
        sale1.addPoint(550,225);
        g.fillPolygon(sale1);


    }
    public static void drawPerson(Graphics g){

        g.setColor(Color.black);
        g.fillRect(358,255,10,20);
        g.setColor(new Color(250,210,150));
        g.fillOval(350,245,25,25);
        g.setColor(Color.black);
        g.drawArc(357,258,10,5,180,180);
        g.fillOval(355,252,4,4);
        g.fillOval(362,252,4,4);

    }
}
