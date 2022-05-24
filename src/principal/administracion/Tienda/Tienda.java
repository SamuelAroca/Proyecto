package principal.administracion.Tienda;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import principal.administracion.Tienda.panels.Carrito;
import principal.administracion.Tienda.panels.PanelTienda;
import principal.logANDres.Login;

public class Tienda extends javax.swing.JFrame {

    public Tienda() {
        initComponents();
        PanelTienda pt = new PanelTienda();
        showPanel(pt);
        cerrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        butonRegresar = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        rectangulo = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/administracion/Tienda/icons/Rectangle 1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/administracion/Tienda/icons/BtnProductos.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/administracion/Tienda/icons/BtnCarrito.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/administracion/Tienda/icons/energia.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 730, -1, -1));

        butonRegresar.setBackground(new java.awt.Color(235, 197, 30));
        butonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/regresar.png"))); // NOI18N
        butonRegresar.setToolTipText("");
        butonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butonRegresar.setBorderPainted(false);
        butonRegresar.setContentAreaFilled(false);
        butonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(butonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 130, 40));

        labelLogo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/administracion/Tienda/icons/vitarrico_logo 4.png"))); // NOI18N
        labelLogo.setText("Vitarrico");
        getContentPane().add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        rectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle.png"))); // NOI18N
        getContentPane().add(rectangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1100, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelTienda pt = new PanelTienda();
        showPanel(pt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Carrito p2 = new Carrito();
        showPanel(p2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cerrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void butonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonRegresarActionPerformed
        dispose();
        JFrame frameMain = new Login();
        frameMain.setResizable(false);
        frameMain.setSize(1073,767);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_butonRegresarActionPerformed

    private void showPanel(JPanel p) {
        p.setSize(1078,767);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    
    private void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    try {
                        confirmarSalida();
                    } catch (IOException ex) {
                        Logger.getLogger(Tienda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void confirmarSalida() throws IOException {
        int valor = JOptionPane.showConfirmDialog(this, "¿Esta seguro de cerrar la aplicación?","Advertencia",JOptionPane.YES_NO_OPTION);
        
        if (valor == JOptionPane.YES_OPTION) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("carrito.txt"))) {
                bw.write("");
                System.exit(0);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonRegresar;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel labelLogo;
    private javax.swing.JLabel rectangulo;
    // End of variables declaration//GEN-END:variables
}
