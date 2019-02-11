import javax.swing.JFrame;

public class Program
{
    JFrame frame;

    public static void main(String[] args)
    {
	Program program = new Program();
	program.start();
    }

    public void start()
    {
	init();
    }

    void init()
    {
	frame = new JFrame("Words in Boxes");
	frame.setSize(600, 400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
    }
}
