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

    public Box(Graphics graphics) {
        g = graphics;
        font = new Font("Liberation Serif", Font.PLAIN, 20);
    }

    public void draw(String letter, int x, int y, int sx, int sy) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.BLACK);
        sx--;
        sy--;
        g2D.drawRect(x, y, sx, sy);
        g.setFont(font);
        FontRenderContext frc = g2D.getFontRenderContext();
        TextLayout layout = new TextLayout(letter, font, frc);
        float advance = layout.getAdvance();
        float ascent = layout.getAscent();
        float descent = layout.getDescent();
        float height = ascent + descent;
        float letter_x = (float)(x+1) + ((float)(sx-2) - advance) / 2;
        float letter_y = (float)(y+1) + ((float)(sy-2) - height) / 2 + ascent;
        g2D.setColor(Color.RED);
        layout.draw(g2D, letter_x, letter_y);
    }
}

