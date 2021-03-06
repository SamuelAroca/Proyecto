package principal.logANDres;

import principal.admins.PassWordAdmin;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import principal.Contactos;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        rootPane.setDefaultButton(btnRegis);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        btnContac = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegis = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        labelRegresar4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        admins = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/BIENVENIDO.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/REGISTRO DE USUARIO.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/energia.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnContac.setBackground(new java.awt.Color(235, 197, 30));
        btnContac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/txtContac.png"))); // NOI18N
        btnContac.setBorder(null);
        btnContac.setBorderPainted(false);
        btnContac.setContentAreaFilled(false);
        btnContac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContacActionPerformed(evt);
            }
        });
        jPanel1.add(btnContac, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, -1, -1));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/regresar.png"))); // NOI18N
        botonRegresar.setBorder(null);
        botonRegresar.setBorderPainted(false);
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/Rectangle 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Identificacion");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/LogoV.png"))); // NOI18N
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

        jLabel6.setText("Contrase??a");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        btnRegis.setForeground(new java.awt.Color(84, 84, 84));
        btnRegis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/Frame 3 (1).png"))); // NOI18N
        btnRegis.setBorder(null);
        btnRegis.setBorderPainted(false);
        btnRegis.setContentAreaFilled(false);
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 620, 220, -1));

        lblTitle1.setForeground(new java.awt.Color(163, 156, 156));
        lblTitle1.setText("Ingresa tus credenciales");
        jPanel2.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        labelRegresar4.setText("??Ya est?? registrado?, Inicie secci??n AQUI");
        labelRegresar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegresar4MouseClicked(evt);
            }
        });
        jPanel2.add(labelRegresar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        txtPassword.setBackground(new java.awt.Color(229, 229, 229));
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 470, 50));

        admins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/BtnAdmins.png"))); // NOI18N
        admins.setBorder(null);
        admins.setBorderPainted(false);
        admins.setContentAreaFilled(false);
        admins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminsActionPerformed(evt);
            }
        });
        jPanel2.add(admins, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 580, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1073, 767));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Registro de Usuarios
    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        if (!txtID.getText().isEmpty() && !txtName.getText().isEmpty() && !txtPassword.getText().isEmpty()) {
            File archivo;
            File archivo2;
            FileWriter escribir;
            FileWriter escribir2;
            PrintWriter linea;
            PrintWriter linea2;
            archivo = new File("usuarios.txt");
            archivo2 = new File("ids.txt");

            if(!archivo.exists()){
                try{
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    linea.close();
                    escribir.close();

                    archivo2.createNewFile();
                    escribir2 = new FileWriter(archivo2,true);
                    linea2 = new PrintWriter(escribir2);
                    linea2.close();
                    escribir2.close();

                }catch(IOException e){
                    JOptionPane.showMessageDialog(new JFrame(),"Error: " + e.getMessage());
                }
            }else{
                FileReader fr;
                Scanner sc;
                try{                              
                    int nLineas = 0;
                    int i = 0;
                    String[] ides;
                    String lineaLeer;
                    String fichero = "ids.txt";
                    sc = new Scanner(new File(fichero));
                    File f = new File(fichero);
                    fr = new FileReader(f);
                    BufferedReader br = new BufferedReader(fr);

                    while((lineaLeer = br.readLine()) != null) {
                            nLineas++;      
                    }

                    ides = new String[nLineas];//Tama??o del arreglo

                    while(sc.hasNextLine()) {
                        ides[i++] = sc.nextLine();//Almacenado cada linea en una posicion
                    }
                    fr.close();

                    Seguridad s = new Seguridad();

                    escribir = new FileWriter(archivo,true);
                    linea = new PrintWriter(escribir);
                    escribir2 = new FileWriter(archivo2,true);
                    linea2 = new PrintWriter(escribir2);

                    String id = txtID.getText();                                
                    
                    //Valida si el usuario ya se encuentra registrado 
                    if (!s.validarSiExiste(ides, id)) {

                        linea.println(txtID.getText());
                        linea2.println(txtID.getText());

                        linea.println(txtName.getText());
                        linea.println(txtPassword.getText());
                        linea.close();
                        escribir.close();
                        linea2.close();
                        escribir2.close();

                        JOptionPane.showMessageDialog(new JFrame(), "Bienvenido" + "\nRegistrado correctamente como: " + txtName.getText());
                        dispose();
                        JFrame frameLog = new Login();
                        frameLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frameLog.setSize(1073,767);
                        frameLog.setLocationRelativeTo(null);
                        frameLog.setVisible(true);
                    } else {
                        txtID.setText(null);
                    }
                }catch(IOException e){
                    JOptionPane.showMessageDialog(new JFrame(),"Error: " + e.getMessage());
                }           
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los espacios");
        }
    }//GEN-LAST:event_btnRegisActionPerformed

    private void btnContacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContacActionPerformed
        dispose();
        JFrame frameContacto = new Contactos();
        frameContacto.setResizable(false);
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
    
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        dispose();
        JFrame frameMain = new PantallaMain();  
        frameMain.setResizable(false);
        frameMain.setSize(1073,807);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed
    
    //Redirige al usuario al Login
    private void labelRegresar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegresar4MouseClicked
        dispose();
        JFrame frameLog = new Login();
        frameLog.setResizable(false);
        frameLog.setSize(1073,767);
        frameLog.setLocationRelativeTo(null);
        frameLog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameLog.setVisible(true);
    }//GEN-LAST:event_labelRegresar4MouseClicked
    //Pide la contrase??a para poder registrar comno administrador
    private void adminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminsActionPerformed
        dispose();
        JFrame frameAdmin = new PassWordAdmin();
        frameAdmin.setResizable(false);
        frameAdmin.setSize(400,302);
        frameAdmin.setLocationRelativeTo(null);
        frameAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameAdmin.setVisible(true);
    }//GEN-LAST:event_adminsActionPerformed

    //Cierra el programa
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admins;
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
    private javax.swing.JButton salir;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
