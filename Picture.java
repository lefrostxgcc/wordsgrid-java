import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Picture extends BufferedImage {
    Graphics g;
    Box box;

    public Picture() {
	super(600, 400, TYPE_INT_ARGB);
	g = getGraphics();
	clear();
	draw();
    }

    public void clear() {
	g.setColor(Color.WHITE);
	g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void draw() {
	box = new Box(g);
	box.draw("Q", 50, 80, 40, 40);
	box.draw("I", 50, 120, 40, 40);
    }
}
