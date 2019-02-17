import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Program {
    Frame frame;

    public static void main(String[] args) {
        Program program = new Program();
        program.start();
    }

    public void start() {
        frame = new Frame("Words in boxes");
        save_picture();
    }

    public void save_picture() {
        try {
            File file = new File("words.png");
            ImageIO.write(frame.panel.picture, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
