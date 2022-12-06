import java.awt.*;
public class Tree {
    public static void drawTrunk(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(100,350,20,100);
    }

    public static void drawLeaves(Graphics g){
        g.setColor(Color.green);
        g.fillOval(85,320,50,50);
    }

    public static void drawCoco(Graphics g){
        g.setColor(new Color(139,69,19));
        g.fillOval(108,370,10,10);
        g.fillOval(98,365,10,10);
        g.fillOval(118,365,10,10);
    }
}
