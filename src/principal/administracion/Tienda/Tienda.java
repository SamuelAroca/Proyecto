package principal.administracion.Tienda;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import principal.administracion.Tienda.panels.Panel2;
import principal.administracion.Tienda.panels.PanelTienda;


public class Tienda extends javax.swing.JFrame {

    
    public Tienda() {
        initComponents();
        PanelTienda pt = new PanelTienda();
        showPanel(pt);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        labelLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/administracion/Tienda/icons/Rectangle1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        labelLogo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/administracion/Tienda/icons/vitarrico_logo 4.png"))); // NOI18N
        labelLogo.setText("Vitarrico");
        getContentPane().add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/administracion/Tienda/icons/Rectangle1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 950, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelTienda pt = new PanelTienda();
        showPanel(pt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Panel2 p2 = new Panel2();
        showPanel(p2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void showPanel(JPanel p) {
        p.setSize(950,610);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel labelLogo;
    // End of variables declaration//GEN-END:variables
}
