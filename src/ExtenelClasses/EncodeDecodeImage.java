/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtenelClasses;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author owanasinghe
 */
public class EncodeDecodeImage {

    public static String encoder(String imagePath) {
        String base64Image = "";
        File file = new File(imagePath);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a Image file from file system
            byte imageData[] = new byte[(int) file.length()];
            imageInFile.read(imageData);
            base64Image = Base64.getEncoder().encodeToString(imageData);
        } catch (FileNotFoundException e) {
            System.out.println("Image not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the Image " + ioe);
        }
        return base64Image;
    }

    public static ImageIcon decoder(String base64Image) {

        ImageIcon pic = null;
        
        try {

            byte[] imageByte = Base64.getDecoder().decode(base64Image);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(imageByte);
            BufferedImage bufImage = ImageIO.read(inputStream);
            pic = new ImageIcon(bufImage.getScaledInstance(160, 190, Image.SCALE_SMOOTH));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pic;
    }

    public static ImageIcon decoderDasbord(String base64Image) {

        ImageIcon pic = null;
        
        try {

            byte[] imageByte = Base64.getDecoder().decode(base64Image);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(imageByte);
            BufferedImage bufImage = ImageIO.read(inputStream);
            pic = new ImageIcon(bufImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pic;
    }
    
}
