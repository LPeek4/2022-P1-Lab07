import java.awt.*;
import java.applet.*;

public class MainPicture extends Applet{

    public void paint(Graphics g){

        Background.drawBackground(g);
        Background.drawBirds(g);

        Boat.drawBoat(g);
        Boat.drawMasts(g);
        Boat.drawSales(g);
        Boat.drawPerson(g);

        Fish.drawBody(g);
        Fish.drawFace(g);
        Fish.drawFins(g);
    }
}
