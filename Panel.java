import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
    public Panel() {
	setPreferredSize(new Dimension(600, 400));
    }

    @Override
    public void paint(Graphics g) {
	g.drawString("ABC", 200, 150);
    }
}
