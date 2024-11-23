import java.applet.Applet;
import java.awt.*;

public class EmojiApplet extends Applet {
    public void paint(Graphics g) {
        // Draw face
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 200, 200);

        // Draw eyes
        g.setColor(Color.black);
        g.fillOval(155, 175, 20, 20);
        g.fillOval(230, 175, 20, 20);

        // Draw mouth
        g.drawArc(150, 180, 100, 100, 180, 180);
    }
}
