package principal;


import principal.logANDres.PantallaMain;
import principal.logANDres.Login;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Contactos extends javax.swing.JFrame {

    public Contactos() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        labelNumeros = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        labelSerCliente = new javax.swing.JLabel();
        labelRedes = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CONTACTOS.png"))); // NOI18N
        jPanel1.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vitarrico_logo 2.png"))); // NOI18N
        labelLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogoMouseClicked(evt);
            }
        });
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        labelNumeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Numeros.png"))); // NOI18N
        jPanel1.add(labelNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 380, -1));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        botonRegresar.setBorder(null);
        botonRegresar.setBorderPainted(false);
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 670, -1, -1));

        labelSerCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Correo.png"))); // NOI18N
        jPanel1.add(labelSerCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        labelRedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Redes.png"))); // NOI18N
        jPanel1.add(labelRedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        labelDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dirección.png"))); // NOI18N
        jPanel1.add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 2.png"))); // NOI18N
        jPanel1.add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1079, 766));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
        JFrame frameMain = new PantallaMain();
        frameMain.setResizable(false);
        frameMain.setSize(1073,807);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void labelLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogoMouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://vitarrico.com");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelLogoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelNumeros;
    private javax.swing.JLabel labelRedes;
    private javax.swing.JLabel labelSerCliente;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
