
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JViewport;



public class ScrollPaneWatermark extends JViewport {
    BufferedImage bgimage;
    TexturePaint texture;


    public void setBackgroundTexture(URL url) throws IOException {
        bgimage = ImageIO.read(url);
        Rectangle rect = new Rectangle(0, 0, bgimage.getWidth(null), bgimage.getHeight(null));
        texture = new TexturePaint(bgimage, rect);
    }
    
    public void paintComponent(Graphics g) {
    // do the superclass behavior first
    super.paintComponent(g);
    // paint the texture
    if (texture != null) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(texture);
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
    public void setView(JComponent view) {
        view.setOpaque(false);
        super.setView(view);
    }
}
