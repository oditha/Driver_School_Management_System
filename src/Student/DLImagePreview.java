package Student;

import MainMenu.*;
import com.alee.laf.WebLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DLImagePreview extends javax.swing.JFrame {

    static boolean maximized = true;

    public DLImagePreview() {
        initComponents();
        //maximizeWindow();
        loadImage();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 180));

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        WebLookAndFeel.install();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DLImagePreview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
private void maximizeWindow() {
        if (maximized) {

            DLImagePreview.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment gv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            DLImagePreview.this.setMaximizedBounds(gv.getMaximumWindowBounds());
            maximized = true;
        } else {

            setExtendedState(JFrame.NORMAL);
            maximized = false;

        }
    }

    private void loadImage() {

        BufferedImage imageIcon;
        try {
            
           String path = PermentDLDetails.mp.get(PermentDLDetails.DL).toString();
            System.out.println(path);
            imageIcon = ImageIO.read(new File(path));
            image.setIcon(new ImageIcon(imageIcon.getScaledInstance(330, 180, Image.SCALE_SMOOTH)));

        } catch (IOException ex) {
            Logger.getLogger(DLImagePreview.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
