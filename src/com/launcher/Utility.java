/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.launcher;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Utility {
    
    public static void SetImageLabel(JLabel label, String root){
        ImageIcon originalIcon = new ImageIcon(root);

        // Obtener el tamaño máximo disponible en el JLabel
        int labelWidth = label.getWidth();
        int labelHeight = label.getHeight();

        // Calcular el nuevo tamaño del Icon manteniendo las proporciones originales
        int newWidth, newHeight;
        int originalWidth = originalIcon.getIconWidth();
        int originalHeight = originalIcon.getIconHeight();
        double widthRatio = (double) labelWidth / originalWidth;
        double heightRatio = (double) labelHeight / originalHeight;

        // Usar el ratio más pequeño para asegurarse de que el Icon encaje completamente en el JLabel
        double scaleFactor = Math.min(widthRatio, heightRatio);
        newWidth = (int) (originalWidth * scaleFactor);
        newHeight = (int) (originalHeight * scaleFactor);

        // Escalar el Icon
        Image scaledImage = originalIcon.getImage().getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        label.setIcon(scaledIcon);
        label.repaint();
    }     
}

