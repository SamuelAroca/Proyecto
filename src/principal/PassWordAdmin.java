package principal;

import java.io.*;
import javax.swing.*;

public class PassWordAdmin extends javax.swing.JFrame {
    
    private static final String PassWord = "hola123";

    public PassWordAdmin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pswAdmins = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));
        getContentPane().add(pswAdmins, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 200, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame 6 (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 520, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Rectangle 2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File archivo;
        
        FileWriter escribir;
        
        PrintWriter linea;
        
        archivo = new File("contraseñaAdmin.txt");
        
        
        if(!archivo.exists()){
            try{
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
                
            }catch(IOException e){
                JOptionPane.showMessageDialog(new JFrame(),"Error: " + e.getMessage());
            }
            
        }else{
                        
            try{                                                            
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                              
                String id = pswAdmins.getText();                                

                linea.println(id);
                
                linea.close();
                escribir.close();
                
            } catch(IOException e){
                JOptionPane.showMessageDialog(new JFrame(),"Error: " + e.getMessage());
            }
        }
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswAdmins;
    // End of variables declaration//GEN-END:variables
}
