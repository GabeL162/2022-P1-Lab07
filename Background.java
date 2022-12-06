import java.awt.*;
import java.util.*;
public class Background {
    public static void drawSky(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(0,0,1000,325);
    }

    public static void drawWater(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0,325,1000,100);
    }

    public static void drawSand(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect(0,425,1000,300);
    }

    public static void drawCloud(Graphics g){
        g.setColor(Color.white);
        for(int k = 1; k < 10; k++) {
            Random rand = new Random();
            int x1 = rand.nextInt(1000);
            int y1 = rand.nextInt(325);
            g.fillOval(x1, y1, 101, 101);
        }
    }

}
