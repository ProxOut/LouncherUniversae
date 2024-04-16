/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.launcher;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author emman
 */
public class Simulators extends javax.swing.JPanel {

     String imageName2 = "HomeButton";
     
     JLabel[] miniaturas;
     
    public Simulators() {
        initComponents();
        
        contenedorImgs.revalidate();
         contenedorImgs.repaint();
        
         miniaturas = new JLabel[]{
             ImageBtn0, ImageBtn1, ImageBtn2, ImageBtn3, ImageBtn4, ImageBtn5, 
         };
        
        
            // Itera sobre los nombres de los botones.
        for (int i = 0; i < miniaturas.length; i++) {
            
            // Construye la ruta de la imagen para el botón actual.
            String image = "src/ImgsEmulator/" + imageName2 + i + ".png";
            
            try {
               
               Utility.SetImageLabel(miniaturas[i], image);
               
            } catch (Exception e) {
                System.err.println(":(");
                
            }
            
        }
           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorImgs = new javax.swing.JPanel();
        ImageBtn0 = new javax.swing.JLabel();
        ImageBtn1 = new javax.swing.JLabel();
        ImageBtn2 = new javax.swing.JLabel();
        ImageBtn3 = new javax.swing.JLabel();
        ImageBtn4 = new javax.swing.JLabel();
        ImageBtn5 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1550, 870));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1550, 870));

        contenedorImgs.setFocusable(false);
        contenedorImgs.setMinimumSize(new java.awt.Dimension(300, 200));
        contenedorImgs.setName(""); // NOI18N
        contenedorImgs.setOpaque(false);

        ImageBtn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgsEmulator/HomeButton1.png"))); // NOI18N
        ImageBtn0.setPreferredSize(new java.awt.Dimension(50, 50));

        ImageBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgsEmulator/HomeButton1.png"))); // NOI18N
        ImageBtn1.setPreferredSize(new java.awt.Dimension(50, 50));

        ImageBtn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgsEmulator/HomeButton1.png"))); // NOI18N
        ImageBtn2.setPreferredSize(new java.awt.Dimension(50, 50));

        ImageBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgsEmulator/HomeButton1.png"))); // NOI18N
        ImageBtn3.setPreferredSize(new java.awt.Dimension(50, 50));

        ImageBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgsEmulator/HomeButton1.png"))); // NOI18N
        ImageBtn4.setPreferredSize(new java.awt.Dimension(50, 50));

        ImageBtn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgsEmulator/HomeButton1.png"))); // NOI18N
        ImageBtn5.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout contenedorImgsLayout = new javax.swing.GroupLayout(contenedorImgs);
        contenedorImgs.setLayout(contenedorImgsLayout);
        contenedorImgsLayout.setHorizontalGroup(
            contenedorImgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorImgsLayout.createSequentialGroup()
                .addGroup(contenedorImgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorImgsLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(ImageBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorImgsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ImageBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)))
                .addGroup(contenedorImgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(contenedorImgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        contenedorImgsLayout.setVerticalGroup(
            contenedorImgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorImgsLayout.createSequentialGroup()
                .addGroup(contenedorImgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorImgsLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(ImageBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorImgsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contenedorImgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImageBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImageBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)))
                .addGroup(contenedorImgsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImageBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImageBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(contenedorImgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(contenedorImgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageBtn0;
    private javax.swing.JLabel ImageBtn1;
    private javax.swing.JLabel ImageBtn2;
    private javax.swing.JLabel ImageBtn3;
    private javax.swing.JLabel ImageBtn4;
    private javax.swing.JLabel ImageBtn5;
    private javax.swing.JPanel contenedorImgs;
    // End of variables declaration//GEN-END:variables
}
