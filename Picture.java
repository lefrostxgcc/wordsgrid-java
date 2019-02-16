import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Picture extends BufferedImage {
    Graphics g;
    Box[][] box;
    int N;
    int D;
    static Random random = new Random();
    static final String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Picture(int N, int D) {
        super(N * D + 1, N * D + 1, TYPE_INT_ARGB);
        g = getGraphics();
        this.N = N;
        this.D = D;
        clear();
        init();
        draw();
    }

    public void clear() {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    public void init() {
        box = new Box[N][N];
        for (int row = 0; row < N; row++)
            for (int col = 0; col < N; col++)
                box[row][col] = new Box(g);
    }
    
    public void draw() {
        for (int row = 0; row < N; row++)
            for (int col = 0; col < N; col++)
                box[row][col].draw(getRandomLetter(),
                                   row * D, col * D, D + 1, D + 1);
    }

    String getRandomLetter() {
        int index = random.nextInt(abc.length());
        return abc.substring(index, index + 1);
    }
}
