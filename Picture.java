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
    String word = "IMPLEMENTATION";

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
                box[row][col] = new Box(g, D);
    }
    
    public void draw() {
        int [][] map = new int[N][N];
        while (true) {
            for (int row = 0; row < N; row++)
                for (int col = 0; col < N; col++)
                    map[row][col] = -1;
            int row = random.nextInt(N);
            int col = random.nextInt(N);
            int index;
            for (index = 0; index < word.length(); index++) {
                if (row < 0 || row >= N || col < 0 || col >= N)
                    break;
                if (map[row][col] >= 0)
                    break;
                map[row][col] = index;
                switch (random.nextInt(4)) {
                case 0: row++; break;
                case 1: row--; break;
                case 2: col++; break;
                case 3: col--; break;
                }
            }
            if (index >= word.length())
                break;
        }
        for (int row = 0; row < N; row++)
            for (int col = 0; col < N; col++) {
                String letter;
                boolean hint = false;
                if (map[row][col] >= 0) {
                    letter = word.substring(map[row][col], map[row][col] + 1);
                    hint = true;
                }
                else
                    letter = getRandomLetter();
                box[row][col].draw(letter, hint, row * D, col * D);
            }
    }

    String getRandomLetter() {
        int index = random.nextInt(abc.length());
        return abc.substring(index, index + 1);
    }
}
