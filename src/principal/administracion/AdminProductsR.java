package principal.administracion;

import java.io.*;
import java.util.Objects;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;

public class AdminProductsR extends javax.swing.JPanel {

    DefaultTableModel dtm;
    Object[] o = new Object[4];
        
    public AdminProductsR() {
        initComponents();
        dtm = (DefaultTableModel) tblProducts.getModel();
        cargarDatos("granolas.txt");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        comboTipo = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TitleBarAgregar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnCo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnNo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnPr.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnCa.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 680, 50));

        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 680, 50));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 680, 50));
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 680, 50));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Agregar.png"))); // NOI18N
        btnAgregar.setToolTipText("");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 170, 130, 50));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "nombre", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 850, 300));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Granolas", "Cereales", "Avenas", "Bebidas", "Otros" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, 130, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1073, 767));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String codigo = txtCode.getText();
        
        if (validarNombre(txtName.getText())) {
            if(Objects.equals(comboTipo.getSelectedItem(), "Granolas") && codigo.equals("1")) {
                escribirTabla();
                escribirArchivo("granolas.txt");
                limpiar();
            } else if(Objects.equals(comboTipo.getSelectedItem(), "Cereales") && codigo.equals("2")) {
                escribirTabla();
                escribirArchivo("cereales.txt");
                limpiar();
            } else if(Objects.equals(comboTipo.getSelectedItem(), "Avenas") && codigo.equals("3")) {
                escribirTabla();
                escribirArchivo("avenas.txt");
                limpiar();
            } else if(Objects.equals(comboTipo.getSelectedItem(), "Bebidas") && codigo.equals("4")) {
                escribirTabla();
                escribirArchivo("bebidas.txt");
                limpiar();
            } else if(Objects.equals(comboTipo.getSelectedItem(), "Otros") && codigo.equals("5")) {
                escribirTabla();
                escribirArchivo("otros.txt");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ponga un codigo valido");
                txtCode.setText(null);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mayúscula inicial y sin espacios");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
        dtm.getDataVector().removeAllElements();
        tblProducts.updateUI();

        if(Objects.equals(comboTipo.getSelectedItem(), "Granolas")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("granolas.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Cereales")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("cereales.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Avenas")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("avenas.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Bebidas")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("bebidas.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Otros")) {
            dtm = (DefaultTableModel) tblProducts.getModel();
            cargarDatos("otros.txt");
        }
    }//GEN-LAST:event_comboTipoItemStateChanged

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (!validarNombre(txtName.getText())) {
            JOptionPane.showMessageDialog(null, "Mayúscula inicial y sin espacios");
        }
    }//GEN-LAST:event_txtNameFocusLost
    
    public void escribirArchivo(String filePath){

        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i < tblProducts.getRowCount(); i++){
                for(int j = 0; j < tblProducts.getColumnCount(); j++){
                    bw.write(tblProducts.getValueAt(i, j).toString()+" ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(AdminProductsEC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void escribirTabla() {
        o[0] = txtCode.getText();
        o[1] = txtName.getText();
        o[2] = txtPrice.getText();
        o[3] = txtAmount.getText();

        dtm.addRow(o);
    }
    
    private void cargarDatos(String filePath){
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)tblProducts.getModel();
            Object[] lines = br.lines().toArray();
            
            for (Object line : lines) {
                String[] row = line.toString().split(" ");
                model.addRow(row);
            }          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminProductsR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void limpiar(){
        txtCode.setText(null);
        txtName.setText(null);
        txtPrice.setText(null);
        txtAmount.setText(null);
    }
    
    public static boolean validarNombre(String nombre) {
        return nombre.matches("^([A-Z]{1}[a-z0-9]+)$");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
