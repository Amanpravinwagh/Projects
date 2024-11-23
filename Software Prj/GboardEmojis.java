import java.awt.*;
import javax.swing.*;

public class GboardEmojis extends JApplet {
    public void paint(Graphics g) {
        // Draw a smiling face emoji
        drawSmiley(g, 50, 50);
        
        // Draw a sad face emoji
        drawSadFace(g, 150, 50);
        
        // Draw a laughing face emoji
        drawLaughingFace(g, 250, 50);
    }

    // Method to draw a smiling face emoji
    private void drawSmiley(Graphics g, int x, int y) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 100, 100); // Head
        g.setColor(Color.BLACK);
        g.fillOval(x + 20, y + 30, 20, 20); // Left eye
        g.fillOval(x + 60, y + 30, 20, 20); // Right eye
        g.drawArc(x + 20, y + 40, 60, 40, 180, 180); // Smile
    }

    // Method to draw a sad face emoji
    private void drawSadFace(Graphics g, int x, int y) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 100, 100); // Head
        g.setColor(Color.BLACK);
        g.fillOval(x + 20, y + 40, 20, 20); // Left eye
        g.fillOval(x + 60, y + 40, 20, 20); // Right eye
        g.drawArc(x + 20, y + 20, 60, 60, 0, 180); // Frown
    }

    // Method to draw a laughing face emoji
    private void drawLaughingFace(Graphics g, int x, int y) {
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 100, 100); // Head
        g.setColor(Color.BLACK);
        g.drawLine(x + 20, y + 30, x + 40, y + 20); // Left eye
        g.drawLine(x + 60, y + 20, x + 80, y + 30); // Right eye
        g.drawArc(x + 20, y + 40, 60, 40, 180, -180); // Smile
    }
}

// Main class to run the applet
class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gboard Emojis");
        GboardEmojis emojis = new GboardEmojis();
        frame.add(emojis);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
