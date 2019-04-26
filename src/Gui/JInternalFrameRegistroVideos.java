/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Datos.Video;
import Logica.ManejoVideo;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Andy
 */
public class JInternalFrameRegistroVideos extends javax.swing.JInternalFrame {

    ManejoVideo manVideo = new ManejoVideo();

    /**
     * Creates new form JInternalFrameRegistroMateriales
     */
    public JInternalFrameRegistroVideos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldtitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDirector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox();
        jTextFieldActor = new javax.swing.JTextField();
        jComboBoxAnio = new javax.swing.JComboBox();
        jTextFieldVenta = new javax.swing.JTextField();
        jTextFieldRenta = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabel3.setText("Titulo");

        jLabel5.setText("Director:");

        jTextFieldDirector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDirectorKeyTyped(evt);
            }
        });

        jLabel6.setText("Genero:");

        jLabel7.setText("Actor:");

        jLabel8.setText("Año:");

        jLabel9.setText("Valor Venta:");

        jLabel10.setText("Valor Renta:");

        jLabel11.setText("Cantidad:");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACCION", "CIENCIA FICCION", "COMEDIA", "DRAMA", "SUSPENSO", "TERROR" }));

        jTextFieldActor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldActorKeyTyped(evt);
            }
        });

        jComboBoxAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));

        jTextFieldVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVentaKeyTyped(evt);
            }
        });

        jTextFieldRenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldRentaKeyTyped(evt);
            }
        });

        jTextFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyTyped(evt);
            }
        });

        jLabel12.setText("DATOS DEL VIDEO.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDirector)
                            .addComponent(jComboBoxGenero, 0, 1, Short.MAX_VALUE)
                            .addComponent(jTextFieldActor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(37, 37, 37)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jTextFieldCantidad)
                    .addComponent(jTextFieldRenta)
                    .addComponent(jTextFieldVenta)
                    .addComponent(jComboBoxAnio, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldActor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        int x = 0;
        Video vid = new Video(0, jTextFieldtitulo.getText(), jTextFieldDirector.getText(),
                (String) jComboBoxGenero.getSelectedItem(), jTextFieldActor.getText(),
                Integer.parseInt((String)jComboBoxAnio.getSelectedItem()) , Integer.parseInt(jTextFieldRenta.getText()),
                Integer.parseInt(jTextFieldVenta.getText()), Integer.parseInt(jTextFieldCantidad.getText()));
        try {
            x = manVideo.guardarVideo(vid);
            if (x == 1) {
                JOptionPane.showMessageDialog(null, "VIDEO GUARDADO");

            }
        } catch (IOException ex) {
            Logger.getLogger(JInternalFrameRegistroVideos.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVentaKeyTyped
        // TODO add your handling code here:
        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla) && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldVentaKeyTyped

    private void jTextFieldRentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldRentaKeyTyped
        // TODO add your handling code here:
        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla) && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldRentaKeyTyped

    private void jTextFieldCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadKeyTyped
        // TODO add your handling code here:
        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla) && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldCantidadKeyTyped

    private void jTextFieldDirectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDirectorKeyTyped
        // TODO add your handling code here:
        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isLetter(tecla) && tecla != KeyEvent.VK_SPACE && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldDirectorKeyTyped

    private void jTextFieldActorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldActorKeyTyped
        // TODO add your handling code here:
        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isLetter(tecla) && tecla != KeyEvent.VK_SPACE && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            getToolkit().beep();
        }
    }//GEN-LAST:event_jTextFieldActorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxAnio;
    private javax.swing.JComboBox jComboBoxGenero;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldActor;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldDirector;
    private javax.swing.JTextField jTextFieldRenta;
    private javax.swing.JTextField jTextFieldVenta;
    private javax.swing.JTextField jTextFieldtitulo;
    // End of variables declaration//GEN-END:variables
}
