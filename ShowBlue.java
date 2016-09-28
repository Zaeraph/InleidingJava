import java.applet.Applet;
import java.awt.*;


public class ShowBlue extends Applet {

    public void init() {
        setBackground(Color.BLUE);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Damien Out", 50, 60);
    }
}
