
import java.applet.Applet;
import java.awt.*;


public class Show extends Applet {

 public void init() {
   setBackground(Color.WHITE);
 }
  public void paint(Graphics g) {
   g.setColor(Color.blue);
   g.drawString("Damien", 50, 60);
   g.setColor(Color.red );
           g.drawString("Out", 50, 70);
  }
 }

