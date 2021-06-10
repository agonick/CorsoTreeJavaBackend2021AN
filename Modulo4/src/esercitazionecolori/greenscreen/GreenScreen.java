package esercitazionecolori.greenscreen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;

public class GreenScreen {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci immagine 1(with green screen) ....");
        String filename= input.nextLine();
        System.out.println("inserisci immagine 2: ....");
        String filename2= input.nextLine();
        BufferedImage image =  ImageIO.read(new File(filename));
        BufferedImage image2 =  ImageIO.read(new File(filename2));
    }


    public static boolean greenscreenize(BufferedImage image1, BufferedImage image2){
        for (int col = 0; col < image1.getWidth(); col++) {
            for (int row = 0; row < image1.getHeight(); row++) {
                Color pixelInput = new Color(image1.getRGB(col,row));
                Color greenscreenmin= new Color(48,255,17);
                Color greenscreenmax = new Color(0, 255, 0);
             /*  if(pixelInput.getRed()>greenscreenmin.getRed() && pixelInput.getRed()<=greenscreenmax.getRed()
               && pixelInput.getRed()>greenscreenmin.getRed() && pixelInput.getRed()<=greenscreenmax.getRed() )
            */
            }
        }
        return  ImageIO.write(image, "jpg", new File(nomefilearrivo));
    }

    }

}
