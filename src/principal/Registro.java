package principal;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Registro extends javax.swing.JFrame {

    
    public Registro() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnContac = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnRegis = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        labelRegresar4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BIENVENIDO.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/REGISTRO DE USUARIO.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        btnContac.setBackground(new java.awt.Color(235, 197, 30));
        btnContac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/txtContac.png"))); // NOI18N
        btnContac.setBorder(null);
        btnContac.setBorderPainted(false);
        btnContac.setContentAreaFilled(false);
        btnContac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContacActionPerformed(evt);
            }
        });
        jPanel1.add(btnContac, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, -1, -1));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        botonRegresar.setBorder(null);
        botonRegresar.setBorderPainted(false);
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Identificacion");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogoV.png"))); // NOI18N
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        txtID.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 470, 50));

        txtName.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 470, 50));

        labelNombre.setText("Nombre");
        jPanel2.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        txtPassword.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 470, 50));

        jLabel6.setText("Contraseña");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        btnRegis.setBackground(new java.awt.Color(160, 200, 78));
        btnRegis.setForeground(new java.awt.Color(84, 84, 84));
        btnRegis.setText("Registrarse");
        btnRegis.setBorderPainted(false);
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 150, 50));

        lblTitle1.setForeground(new java.awt.Color(163, 156, 156));
        lblTitle1.setText("Ingresa tus credenciales");
        jPanel2.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        labelRegresar4.setText("¿Ya está registrado?, Inicie sección AQUI");
        labelRegresar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegresar4MouseClicked(evt);
            }
        });
        jPanel2.add(labelRegresar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 580, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1073, 767));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisActionPerformed

    private void btnContacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContacActionPerformed
        dispose();
        JFrame frameContacto = new Contactos();
        frameContacto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameContacto.setSize(1073,767);
        frameContacto.setLocationRelativeTo(null);
        frameContacto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameContacto.setVisible(true);
    }//GEN-LAST:event_btnContacActionPerformed

    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://vitarrico.com");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblLogoMouseClicked

    private void butonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonRegresarActionPerformed
        dispose();
        JFrame frameMain = new PantallaMain();
        frameMain.setSize(1073,767);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_butonRegresarActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
        JFrame frameMain = new PantallaMain();            
        frameMain.setSize(1073,767);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void labelRegresar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegresar4MouseClicked
        dispose();
        JFrame frameLog = new Login();
        frameLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLog.setSize(1073,767);
        frameLog.setLocationRelativeTo(null);
        frameLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLog.setVisible(true);
    }//GEN-LAST:event_labelRegresar4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton btnContac;
    private javax.swing.JButton btnRegis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRegresar4;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables

}
