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

    }
    public static void drawSales(Graphics g){

    }
    public static void drawPerson(Graphics g){

    }
}
