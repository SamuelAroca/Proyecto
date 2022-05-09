package principal.admins;

import principal.admins.RegistroAdmins;
import javax.swing.*;
import principal.logANDres.Registro;

public class PassWordAdmin extends javax.swing.JFrame {
    
    private static final String PassWord = "hola123";

    public PassWordAdmin() {
        rootPane.setDefaultButton(botonAcceder);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAcceder = new javax.swing.JButton();
        pswAdmins = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Acceder.png"))); // NOI18N
        botonAcceder.setBorder(null);
        botonAcceder.setBorderPainted(false);
        botonAcceder.setContentAreaFilled(false);
        botonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAccederActionPerformed(evt);
            }
        });
        getContentPane().add(botonAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));
        getContentPane().add(pswAdmins, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 200, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Regresar_1.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame 6 (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, 520, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccederActionPerformed
        if (pswAdmins.getText().equals(PassWord)) {
            dispose();
            JFrame frameRegisAdmins = new RegistroAdmins();
            frameRegisAdmins.setResizable(false);
            frameRegisAdmins.setSize(1073,767);
            frameRegisAdmins.setLocationRelativeTo(null);
            frameRegisAdmins.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frameRegisAdmins.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
        }
    }//GEN-LAST:event_botonAccederActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        JFrame frameRegistro = new Registro();
        frameRegistro.setResizable(false);
        frameRegistro.setSize(1073,767);
        frameRegistro.setLocationRelativeTo(null);
        frameRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameRegistro.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcceder;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswAdmins;
    // End of variables declaration//GEN-END:variables
}
