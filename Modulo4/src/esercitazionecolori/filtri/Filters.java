package esercitazionecolori.filtri;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Filters {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Quale immagine vuoi caricare?");
        String filename= input.nextLine();
        System.out.println("come vuoi chiamare l'immagine di arrivo?");
        String filenameout= input.nextLine();
        BufferedImage image =  ImageIO.read(new File(filename));
        FiltroPosterize(image,filenameout,3);

    }


    public static boolean FiltroGrey(BufferedImage image, String nomefilearrivo)throws Exception{
        for (int col = 0; col < image.getWidth(); col++) {
            for (int row = 0; row < image.getHeight(); row++) {
                Color pixelInput = new Color(image.getRGB(col,row));
                int luma= ((pixelInput.getRed() * 77)/255) + ((pixelInput.getGreen() * 150)/255) + ((pixelInput.getBlue() * 28)/255);
                Color pixel = new Color(luma,luma,luma);
                image.setRGB(col, row,pixel.getRGB());
            }
        }
       return  ImageIO.write(image, "jpg", new File(nomefilearrivo));
    }

    public static boolean FiltroSpecchio(BufferedImage image,String nomefilearrivo)throws Exception{
        for (int col = 0; col < image.getWidth()/2; col++) {
            for (int row = 0; row < image.getHeight(); row++) {
                Color pixelInput = new Color(image.getRGB(col,row));
                Color pixelTemp=new Color(image.getRGB(image.getWidth()-col-1,row));
                image.setRGB(col, row,pixelTemp.getRGB());
                image.setRGB(image.getWidth()-col-1, row,pixelInput.getRGB());
            }
        }
       return ImageIO.write(image, "jpg", new File(nomefilearrivo));
    }

    public static boolean FiltroGBR(BufferedImage image,String nomefilearrivo)throws Exception{
        for (int col = 0; col < image.getWidth(); col++) {
            for (int row = 0; row < image.getHeight(); row++) {
                Color pixelInput = new Color(image.getRGB(col,row));
                Color pixelGbr= new Color(pixelInput.getGreen(),pixelInput.getBlue(),pixelInput.getRed());
                image.setRGB(col, row,pixelGbr.getRGB());
            }
        }
        return ImageIO.write(image, "jpg", new File(nomefilearrivo));
    }
    public static boolean FiltroNegativo(BufferedImage image,String nomefilearrivo)throws Exception{
        for (int col = 0; col < image.getWidth(); col++) {
            for (int row = 0; row < image.getHeight(); row++) {
                Color pixelInput = new Color(image.getRGB(col,row));
                Color pixelNegative= new Color(255-pixelInput.getRed(),255-pixelInput.getGreen(),255-pixelInput.getBlue());
                image.setRGB(col, row,pixelNegative.getRGB());
            }
        }
        return ImageIO.write(image, "jpg", new File(nomefilearrivo));
    }

    public static boolean FiltroPosterize(BufferedImage image,String nomefilearrivo,int quantum)throws Exception{
        for (int col = 0; col < image.getWidth(); col++) {
            for (int row = 0; row < image.getHeight(); row++) {
                int rangemin=255/quantum;
                Color pixelInput = new Color(image.getRGB(col,row));
                Color pixelPosterize= new Color((pixelInput.getRed()/rangemin)*rangemin,(pixelInput.getGreen()/rangemin)*rangemin,pixelInput.getBlue()/rangemin*rangemin);
                image.setRGB(col, row,pixelPosterize.getRGB());
            }
        }
        return ImageIO.write(image, "jpg", new File(nomefilearrivo));
    }

    public static int posterize(int colore,int key ){
        int range=255/key;
       for(int i=1;i<=key;i++){
           if (colore>=range*(i-1) && colore<range*i)
               return range*(i-1);
           break;
       }
       return -1;
    }




}