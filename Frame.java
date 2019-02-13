import javax.swing.JFrame;

public class Frame extends JFrame {
    Panel panel;
    
    Frame(String caption) {
	super(caption);
	initPanel();
	initFrame();
    }

    private void initFrame() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setLocationRelativeTo(null);
	setVisible(true);	
    }

    private void initPanel() {
	panel = new Panel();
	add(panel);
	pack();
    }
}

