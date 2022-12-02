import java.awt.*;
import java.applet.*;

public class MainPicture extends Applet{

    public void paint(Graphics g){

        Background.drawBackground(g);

        Birds.drawBirds(g);

        Fish.drawBody(g);
        Fish.drawEye(g);
        Fish.drawScales(g);

        Boat.drawBoat(g);
        Boat.drawMasts(g);
        Boat.drawSales(g);
        Boat.drawPerson(g);

    }
}
