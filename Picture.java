import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Picture extends BufferedImage {
    Graphics g;

    public Picture() {
	super(600, 400, TYPE_INT_ARGB);
	g = getGraphics();
	clear();
	draw();
    }

    public void clear() {
	g.setColor(Color.CYAN);
	g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void draw() {
	g.setColor(Color.RED);
	g.drawString("VIDEOJAVA.INFO", 200, 100);
    }
}
