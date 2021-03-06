package principal.logANDres;

import principal.admins.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import principal.*;
import principal.administracion.Tienda.*;

public class Login extends javax.swing.JFrame {
    
    private static Scanner sc, sc2;
    private static int intentos;
    private static String userId,user,pwd;
    private static String adminId,userAdmin,pwdAdmin;
   
    public Login() {
        initComponents();
        rootPane.setDefaultButton(btnLogin);
    }
    //Cuenta de los intentos
    public static void setIntentos(int intentos) {
        Login.intentos = intentos;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContac = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        butonRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        txtNombreLog = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        txtPwdLog = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDLog1 = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        comboTipoUser = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnContac, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/Ingreso Usuario.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/BIENVENIDO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        butonRegresar.setBackground(new java.awt.Color(235, 197, 30));
        butonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/regresar.png"))); // NOI18N
        butonRegresar.setToolTipText("");
        butonRegresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butonRegresar.setBorderPainted(false);
        butonRegresar.setContentAreaFilled(false);
        butonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(butonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/Rectangle 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 770));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/LogoV.png"))); // NOI18N
        lblLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoMouseClicked(evt);
            }
        });
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        txtNombreLog.setBackground(new java.awt.Color(229, 229, 229));
        txtNombreLog.setToolTipText("Nombre registrado");
        jPanel2.add(txtNombreLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 470, 50));

        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/logANDres/sesion.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 250, 70));

        lblTitle1.setForeground(new java.awt.Color(163, 156, 156));
        lblTitle1.setText("Ingresa tus credenciales");
        jPanel2.add(lblTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        txtPwdLog.setBackground(new java.awt.Color(229, 229, 229));
        txtPwdLog.setToolTipText("Contrase??a");
        jPanel2.add(txtPwdLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 470, 50));

        jLabel4.setText("Identificacion");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel6.setText("Contrase??a");
        jLabel6.setToolTipText("");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        txtIDLog1.setBackground(new java.awt.Color(229, 229, 229));
        txtIDLog1.setToolTipText("ID Registrado");
        jPanel2.add(txtIDLog1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 470, 50));

        labelNombre.setText("Nombre");
        jPanel2.add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        comboTipoUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));
        jPanel2.add(comboTipoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 580, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Inicion de Sesi??n
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        FileReader fr;
        FileReader fr2;
        try {
            //Login
            int nLineas = 0;
            int nLineas2 = 0;
            int i = 0;
            int j = 0;
            String[] usuarios;
            String[] admins;
            String linea;
            String linea2;
            String fichero = "usuarios.txt";
            String fichero2 = "admins.txt";
            sc = new Scanner(new File(fichero));
            sc2 = new Scanner(new File(fichero2));
            File f = new File(fichero);
            File f2 = new File(fichero2);
            fr = new FileReader(f);
            fr2 = new FileReader(f2);
            
            BufferedReader br = new BufferedReader(fr);
            BufferedReader br2 = new BufferedReader(fr2);
            
            
            while((linea = br.readLine()) != null) {
                    nLineas++;      
            }
            
            usuarios = new String[nLineas];//Tama??o del arreglo
            
            while(sc.hasNextLine()) {
                usuarios[i++] = sc.nextLine();//Almacenado cada linea en una posicion
            }
            
            //Login Admins
            while((linea2 = br2.readLine()) != null) {
                nLineas2++;
            }
            
            admins = new String[nLineas2];
            
            while(sc2.hasNextLine()) {
                admins[j++] = sc2.nextLine();
            }
            
            intentos++;
            
            userId = txtIDLog1.getText();
            user = txtNombreLog.getText();
            pwd = txtPwdLog.getText();
            
            adminId = txtIDLog1.getText();
            userAdmin = txtNombreLog.getText();
            pwdAdmin = txtPwdLog.getText();
            
            Seguridad s = new Seguridad();
            
            //Diferencia entre un usuario y un administrador
            if(Objects.equals(comboTipoUser.getSelectedItem(), "Usuario")) {
                if (s.validarUsuario(usuarios, userId, user, pwd, intentos)) {
                    dispose();
                    JFrame frameTienda = new Tienda();
                    frameTienda.setResizable(true);
                    frameTienda.setSize(1346,805);
                    frameTienda.setLocationRelativeTo(null);
                    frameTienda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frameTienda.setVisible(true);
                }
            }
            if(Objects.equals(comboTipoUser.getSelectedItem(), "Administrador")) {
                if(s.validarUsuario(admins, adminId, userAdmin, pwdAdmin, intentos)) {
                    dispose();
                    JFrame frameAdmin = new Admins();
                    frameAdmin.setResizable(true);
                    frameAdmin.setSize(1346,805);
                    frameAdmin.setLocationRelativeTo(null);
                    frameAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frameAdmin.setVisible(true);
                }
            }
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    //Dirige al Frame Contactos
    private void btnContacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContacActionPerformed
        dispose();
        JFrame frameContacto = new Contactos();
        frameContacto.setResizable(false);
        frameContacto.setSize(1073,767);
        frameContacto.setLocationRelativeTo(null);
        frameContacto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameContacto.setVisible(true);
    }//GEN-LAST:event_btnContacActionPerformed
    //Redirecciona a la pagina oficial de Vitarrico
    private void lblLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoMouseClicked
        try {
            PantallaMain main = new PantallaMain();
            main.enlace("https://vitarrico.com");
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblLogoMouseClicked
    //Regresa a PantallaMain
    private void butonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonRegresarActionPerformed
        dispose();
        JFrame frameMain = new PantallaMain();
        frameMain.setResizable(false);
        frameMain.setSize(1073,767);
        frameMain.setLocationRelativeTo(null);
        frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameMain.setVisible(true);
    }//GEN-LAST:event_butonRegresarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContac;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton butonRegresar;
    private javax.swing.JComboBox<String> comboTipoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JTextField txtIDLog1;
    private javax.swing.JTextField txtNombreLog;
    private javax.swing.JPasswordField txtPwdLog;
    // End of variables declaration//GEN-END:variables
}