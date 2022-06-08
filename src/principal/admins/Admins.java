package principal.admins;

import java.awt.*;
import javax.swing.*;
import principal.administracion.*;
import principal.logANDres.*;

public class Admins extends javax.swing.JFrame {

    public Admins() {
        initComponents();
        JPanel p1 = new AdminProductsR();
        changePanels(p1);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnAdminPE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/RegresarVerde.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setFocusPainted(false);
        btnRegresar.setFocusable(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/ResP.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/Modificar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 150, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/energia.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 720, -1, -1));

        btnAdminPE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/ResPE.png"))); // NOI18N
        btnAdminPE.setBorderPainted(false);
        btnAdminPE.setContentAreaFilled(false);
        btnAdminPE.setFocusPainted(false);
        btnAdminPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminPEActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdminPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/vitarrico_logo 2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/admins/Rectangle.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));
        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -10, 1070, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Llama al panel AdminProductsR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JPanel p1 = new AdminProductsR();
        changePanels(p1);
    }//GEN-LAST:event_jButton1ActionPerformed

    //Llama al panel AdminProductsEC
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JPanel p2 = new AdminProductsEC();
        changePanels(p2);
    }//GEN-LAST:event_jButton2ActionPerformed

    //Nos regresa al Login
    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        JFrame frameLogin = new Login();
        frameLogin.setResizable(false);
        frameLogin.setSize(1089, 795);
        frameLogin.setLocationRelativeTo(null);
        frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLogin.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    //Nos cierra el programa
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    //Llama al panel AdminProveedores
    private void btnAdminPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminPEActionPerformed
        JPanel p3 = new AdminProveedores();
        changePanels(p3);
    }//GEN-LAST:event_btnAdminPEActionPerformed
    
    //Metodo para cambiar los paneles del Frame
    private void changePanels(JPanel p) {
        p.setSize(1075,767);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminPE;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
