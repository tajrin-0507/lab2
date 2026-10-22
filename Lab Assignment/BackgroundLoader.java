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
 

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackgroundLoader implements Runnable {
  private ScrollPaneWatermark watermark;
  public BackgroundLoader(ScrollPaneWatermark watermark) {
    this.watermark = watermark;
  }
  public void run() {
    while (true) {
      try {
        String base_url = "https://www.naturepicoftheday.com";
        URL url = new URL(base_url);
        Reader input = new InputStreamReader(url.openStream());
        char buf[] = new char[1024];
        StringBuffer page_buffer = new StringBuffer();
        while (true) {
          int n = input.read(buf);
          if (n < 0) {
            break;
          }
          page_buffer.append(buf, 0, n);
        }

       
        Pattern pattern = Pattern.compile("<img[^>]+src=['\"]([^'\"]*/npods/[^'\"]+)['\"]");
        Matcher matcher = pattern.matcher(page_buffer);
        matcher.find();
        String img_url = base_url + matcher.group(1);
        watermark.setBackgroundTexture(new URL(img_url));
        watermark.repaint();
        Thread.currentThread().sleep(1000 * 60 * 60 * 2);
        // Locate the Image URL (see next section)
      } catch (Exception ex) {
        System.out.println("exception: " + ex);
        ex.printStackTrace();
      }
    }
  }
}
