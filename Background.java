import java.util.*;
import java.awt.*;
import java.applet.*;

public class Background {

    public static void drawBackground(Graphics g) {

        g.setColor(new Color(165, 250, 255));
        g.fillRect(0, 0, 1000, 300);

        g.setColor(Color.blue);
        g.fillRect(0, 300, 1000, 300);

    }

    public static void drawBirds(Graphics g) {

        g.setColor(Color.black);
        g.drawArc(800, 25, 25, 15, 0, 180);
        g.drawArc(825, 25, 25, 15, 0, 180);

        g.drawArc(750, 50, 25, 15, 0, 120);
        g.drawArc(775, 50, 25, 15, 180, -120);


    }
}
