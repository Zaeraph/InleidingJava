
import java.applet.Applet;
import java.awt.*;

 public class Show extends Applet {

 public void init() {
  setBackground(Color.blue);
 }
  public void paint(Graphics g) {
   g.setColor(Color.yellow);
   g.drawString("Damien Out", 50, 60);
  }
 }