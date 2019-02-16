import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
    Picture picture;
    
    public Panel() {
        picture = new Picture(12, 40);
	Dimension d = new Dimension(picture.getWidth(), picture.getHeight());
	setPreferredSize(d);
    }

    @Override
    public void paint(Graphics g) {
	g.drawImage(picture, 0, 0, this);
    }
}
