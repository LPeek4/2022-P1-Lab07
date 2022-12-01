import java.awt.*;
import java.applet.*;

public class MainPicture extends Applet{

    public static void mainPic(Graphics g){

        Background.drawBackground(Graphics g);

        Birds.drawBirds(Graphics g);

        Fish.drawBody(Graphics g);
        Fish.drawEye(Graphics g);
        Fish.drawScales(Graphics g);

        Boat.drawBoat(Graphics g);
        Boat.drawMasts(Graphics g);
        Boat.drawSales(Graphics g);
        Boat.drawPerson(Graphics g);

    }
}
