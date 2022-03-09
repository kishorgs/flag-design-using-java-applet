package flag;
import java.applet.Applet;
import java.awt.*;
import java.applet.*;

public class Flag extends Applet {
    
   /* public void init(){
        setBackground(Color.gray);
    }*/

    Color whight = new Color(255,255,255);
    Color brown = new Color(199,105,12);
    public void paint(Graphics g) {
        /*
        g.setColor(Color.orange);
        g.fillRect(100, 100, 400, 120);
        g.setColor(whight);
        g.fillRect(100, 200, 400, 120);
        g.setColor(Color.green);
        g.fillRect(100, 300, 400, 120);
        g.setColor(Color.blue);
        g.drawOval(270, 220, 60, 60);
        */
        g.setColor(brown);
        g.fillRect(100,100,10,750);
        g.fillRect(40,850,250,40);
        //g.fillRect(80,440,60,40);
        
        g.setColor(Color.orange);
        g.fillRect(110, 120, 400, 120);
        g.setColor(whight);
        g.fillRect(110, 220, 400, 120);
        g.setColor(Color.green);
        g.fillRect(110, 320, 400, 120);
        g.setColor(Color.blue);
        g.drawOval(270, 240, 60, 60);
        g.drawLine(300, 270, 281, 248);
        g.drawLine(300, 270, 274, 260);
        g.drawLine(300, 270, 273, 283);
        g.drawLine(300, 270, 290, 243);
        g.drawLine(300, 270, 290, 297);
        g.drawLine(300, 270, 300, 239);
        g.drawLine(300, 270, 315, 245);
        g.drawLine(300, 270, 315, 294);
        g.drawLine(300, 270, 325, 253);
        g.drawLine(300, 270, 325, 283);
        g.drawLine(300,270,330,270);
        g.drawLine(300,270,300,300);
        g.drawLine(300,270,270,270);
    }

}
