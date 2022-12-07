import java.awt.*;
public class Boat {
    public static void drawBoat(Graphics g){
        g.setColor(new Color(160,82,45));
        g.fillArc(200,350, 100,40,180,180);
    }

    public static void drawMast(Graphics g){
        g.setColor(new Color(160,82,45));
        g.fillRect(250,300,5,75);
    }
    public static void drawSail(Graphics g){
        g.setColor(Color.white);
        Polygon Sail = new Polygon();
        Sail.addPoint(255,300);
        Sail.addPoint(255,340);
        Sail.addPoint(285,340);
        g.fillPolygon(Sail);
    }
}
