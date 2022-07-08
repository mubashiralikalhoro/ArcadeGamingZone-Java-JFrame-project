package BackEnd;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Mubashir Ali
 */
public class ImageResizer {

    public static ImageIcon resize(ImageIcon img, JLabel label) {
        Image image = img.getImage();
        image = image.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public static ImageIcon resize(ImageIcon img, JButton btn) {
        Image image = img.getImage();
        image = image.getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

}
