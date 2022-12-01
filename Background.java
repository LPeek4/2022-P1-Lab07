import java.util.*;
import java.awt.*;
import java.applet.*;

public class Background extends Applet{

    public static void drawBackground(Graphics g){

        g.setColor(new Color(165,250,255));
        g.fillRect(0,0,1000,300);

        g.setColor(Color.blue);
        g.fillRect(0,300,1000,300);

    }

}
