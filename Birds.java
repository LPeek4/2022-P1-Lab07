import java.awt.*;
import java.applet.*;

public class Birds {
    public static void drawBirds(Graphics g){

        g.setColor(Color.black);
        g.drawArc(800,25,25,15,0,180);
        g.drawArc(825,25,25,15,0,180);

        g.drawArc(750,50,25,15,0,120);
        g.drawArc(775,50,25,15,180,-120);


    }
}
