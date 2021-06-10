package esercitazionecolori;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class ShadesOfGrey {
    public static void main(String[] args) throws Exception {
        BufferedImage image = new BufferedImage(256, 256, BufferedImage.TYPE_3BYTE_BGR);
        int col;
        int row;

        for (col = 0; col < image.getWidth(); col++) {
            for (row = 0; row < image.getHeight(); row++) {
                if (row >= col) {
                    Color pixel = new Color(row, row, row);
                    image.setRGB(col, row, pixel.getRGB());
                } else {
                    Color pixel = new Color(col, col, col);
                    image.setRGB(col, row, pixel.getRGB());
                }

            }

            ImageIO.write(image, "jpg", new File("shades.jpg"));

        }


    }
}
