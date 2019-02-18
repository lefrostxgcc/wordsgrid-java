import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Font;
import java.awt.font.TextLayout;
import java.awt.font.FontRenderContext;

public class Box {
    Graphics g;
    Font font;
    int D;

    public Box(Graphics graphics, int D) {
        g = graphics;
        this.D = D;
        font = new Font("Liberation Serif", Font.PLAIN, D / 2);
    }

    public void draw(String letter, boolean hint, int x, int y) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.BLACK);
        g2D.drawRect(x, y, D, D);
        g.setFont(font);
        FontRenderContext frc = g2D.getFontRenderContext();
        TextLayout layout = new TextLayout(letter, font, frc);
        float advance = layout.getAdvance();
        float ascent = layout.getAscent();
        float descent = layout.getDescent();
        float height = ascent + descent;
        float letter_x = (float)(x+1) + ((float)(D-2) - advance) / 2;
        float letter_y = (float)(y+1) + ((float)(D-2) - height) / 2 + ascent;
        if (hint)
            g2D.setColor(Color.ORANGE);
        else
            g2D.setColor(Color.RED);
        layout.draw(g2D, letter_x, letter_y);
    }
}

