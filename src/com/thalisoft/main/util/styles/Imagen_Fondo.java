package com.thalisoft.main.util.styles;
import java.awt.Color;
    import java.awt.Component;
    import java.awt.Graphics;
    import java.awt.Insets;
    import java.awt.image.BufferedImage;
    import java.io.IOException;
    import java.net.URL;
    import javax.imageio.ImageIO;
    import javax.swing.border.Border;
public class Imagen_Fondo implements Border{
     private BufferedImage fondo;
     
     public Imagen_Fondo(){
        try {
            //se obtiene la imagen
            URL url = new URL(getClass().getResource("/Iconos/portada3.jpg").toString());
            System.out.println(url);
            fondo = ImageIO.read(url);
        } catch (IOException ex) {            
        }

    }
    // se sobreescriben metodos propios de Border
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
        //se dibuja la imagen de fondo en el centro del contenedor
        //cada que se redimensione el contenedor, la imagen automaticamente se posiciona en el centro
        g.drawImage(fondo, (x + (width - fondo.getWidth())/2),(y + (height - fondo.getHeight())/2), null);
    
    }

   
    
    public Insets getBorderInsets(Component c){
	return new Insets(0,0,0,0);
    }

    public boolean isBorderOpaque(){
	return true;
    }
}
