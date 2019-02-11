import javax.swing.JFrame;

public class Frame extends JFrame {
    Frame(String caption) {
	super(caption);
	setSize(600, 400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setLocationRelativeTo(null);
	setVisible(true);	
    }
}

