/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Datos.Vendedor;

/**
 *
 * @author Andy
 */
public class PrincipalVendedor extends javax.swing.JFrame {

    static Vendedor vendedor;
    static String entrada;

    /**
     * Creates new form PrincipalVendedor
     */
    public PrincipalVendedor() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemRegistroPersonas = new javax.swing.JMenuItem();
        jMenuItemMembresia = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemRegistroPrestamos = new javax.swing.JMenuItem();
        jMenuItemReportePrestamos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        jMenu1.setText("Vendedor");

        jMenuItemRegistroPersonas.setText("Registro de Cliente");
        jMenuItemRegistroPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroPersonasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRegistroPersonas);

        jMenuItemMembresia.setText("Modificar Membresia");
        jMenuItemMembresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMembresiaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemMembresia);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Venta/Prestamo");

        jMenuItemRegistroPrestamos.setText("Registro");
        jMenuItemRegistroPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroPrestamosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemRegistroPrestamos);

        jMenuItemReportePrestamos.setText("Devolucion");
        jMenuItemReportePrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReportePrestamosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemReportePrestamos);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemRegistroPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroPersonasActionPerformed
        // TODO add your handling code here:

        JInternalFrameRegistroClientes registroCliente = new JInternalFrameRegistroClientes();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(registroCliente);
        registroCliente.show();
    }//GEN-LAST:event_jMenuItemRegistroPersonasActionPerformed

    private void jMenuItemMembresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMembresiaActionPerformed
        // TODO add your handling code here:
        JInternalFrameMembresia membresia = new JInternalFrameMembresia();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(membresia);
        membresia.show();
//        JInternalFrameReportePersonas reportePersonas = new JInternalFrameReportePersonas();
//        jDesktopPane1.removeAll();
//        jDesktopPane1.add(reportePersonas);
//        reportePersonas.show();
    }//GEN-LAST:event_jMenuItemMembresiaActionPerformed

    private void jMenuItemRegistroPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroPrestamosActionPerformed
        // TODO add your handling code here:
        JInternalFrameRegistroVendedor registro = new JInternalFrameRegistroVendedor();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(registro);
        registro.show();
    }//GEN-LAST:event_jMenuItemRegistroPrestamosActionPerformed

    private void jMenuItemReportePrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReportePrestamosActionPerformed
        // TODO add your handling code here:
        JInternalFramerDevolucion devo=new JInternalFramerDevolucion();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(devo);
        devo.show();

    }//GEN-LAST:event_jMenuItemReportePrestamosActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        PrincipalVendedor.this.dispose();
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemMembresia;
    private javax.swing.JMenuItem jMenuItemRegistroPersonas;
    private javax.swing.JMenuItem jMenuItemRegistroPrestamos;
    private javax.swing.JMenuItem jMenuItemReportePrestamos;
    private javax.swing.JMenuItem jMenuItemSalir;
    // End of variables declaration//GEN-END:variables
}
