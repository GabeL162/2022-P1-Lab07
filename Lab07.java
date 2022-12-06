import java.awt.*;
import java.applet.*;
public class Lab07 extends Applet {

    public void paint(Graphics g){
        Background.drawSky(g);
        Background.drawSand(g);
        Background.drawCloud(g);
        Background.drawWater(g);



        Boat.drawSail(g);
        Boat.drawMast(g);
        Boat.drawBoat(g);

        Tree.drawTrunk(g);
        Tree.drawLeaves(g);
        Tree.drawCoco(g);
    }
}