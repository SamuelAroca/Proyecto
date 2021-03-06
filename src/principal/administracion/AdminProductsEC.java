package principal.administracion;

import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.logging.*;

public class AdminProductsEC extends javax.swing.JPanel {
    
    DefaultTableModel dtm;
    int filaSeleccionada;

    public AdminProductsEC() {
        initComponents();
        
        //Inicializa la tabla granolas
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
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        comboTipo = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/TitleBarModificar.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnNo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnPr.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/BtnCa.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 680, 50));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 680, 50));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 680, 50));
        jPanel1.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 680, 50));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/btnActualizar.png"))); // NOI18N
        btnActualizar.setToolTipText("");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setFocusPainted(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 200, 130, 50));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/icons/administracion/Eliminar.png"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 130, 50));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "nombre", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
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
        jPanel1.add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 130, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1075, 767));
    }// </editor-fold>//GEN-END:initComponents

    //Actualiza la tabla
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (validarNombre(txtName.getText()) && validarPrecio(txtPrice.getText()) && validarCabtidad(txtAmount.getText())) {
            
            String codigo = txtCode.getText();
            String[] codigosplit;
            codigosplit = codigo.split("-");
            
            if(Objects.equals(comboTipo.getSelectedItem(), "Granolas") && codigosplit[1].equals("1")) {
                actualizar();
                actualizarArchivo("granolas.txt");
                limpiar();
            } else if(Objects.equals(comboTipo.getSelectedItem(), "Cereales") && codigosplit[1].equals("2")) {
                actualizar();
                actualizarArchivo("cereales.txt");
                limpiar();
            } else if(Objects.equals(comboTipo.getSelectedItem(), "Avenas") && codigosplit[1].equals("3")) {
                actualizar();
                actualizarArchivo("avenas.txt");
                limpiar();
            } else if(Objects.equals(comboTipo.getSelectedItem(), "Bebidas") && codigosplit[1].equals("4")) {
                actualizar();
                actualizarArchivo("bebidas.txt");
                limpiar();
            } else if(Objects.equals(comboTipo.getSelectedItem(), "Otros") && codigosplit[1].equals("5")) {
                actualizar();
                actualizarArchivo("otros.txt");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ponga un codigo valido");
                txtCode.setText(null);
            }
        } else {
            JOptionPane.showMessageDialog(null, "May??scula inicial y sin espacios," + "\nel precio o la cantidad");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    //Elimina productos de la tabla
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila= tblProducts.getSelectedRow();
        if (fila >= 0){
            dtm.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
        
        if(Objects.equals(comboTipo.getSelectedItem(), "Granolas")) {
            actualizarArchivo("granolas.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Cereales")) {
            actualizarArchivo("cereales.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Avenas")) {
            actualizarArchivo("avenas.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Bebidas")) {
            actualizarArchivo("bebidas.txt");
        }
        if(Objects.equals(comboTipo.getSelectedItem(), "Otros")) {
            actualizarArchivo("otros.txt");
        }
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Carga los datos del producto seleccionado en los Label de los datos
    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        int seleccionar = tblProducts.rowAtPoint(evt.getPoint());
        txtCode.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 0)));
        txtName.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 1)));
        txtPrice.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 2)));
        txtAmount.setText(String.valueOf(tblProducts.getValueAt(seleccionar, 3)));
    }//GEN-LAST:event_tblProductsMouseClicked

    //Cambia la tabla dependiendo el tipo de producto que elijan
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
        limpiar();
    }//GEN-LAST:event_comboTipoItemStateChanged
    
    //Actualiza el archivo de texto (Base de datos)
    private void actualizarArchivo(String filePath){
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
    
    //Carga los datos en la tabla
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
            Logger.getLogger(AdminProductsEC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Actualiza la tabla
    private void actualizar() {
        filaSeleccionada = tblProducts.getSelectedRow();
        if (filaSeleccionada != -1) {
            tblProducts.setValueAt(txtCode.getText(), filaSeleccionada, 0);
            tblProducts.setValueAt(txtName.getText(), filaSeleccionada, 1);
            tblProducts.setValueAt(txtPrice.getText(), filaSeleccionada, 2);
            tblProducts.setValueAt(txtAmount.getText(), filaSeleccionada, 3);
            limpiar();
            filaSeleccionada = -1;
        }else{
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun dato");
        }
    }
    
    //Limpia los Label de datos
    public void limpiar(){
        txtCode.setText(null);
        txtName.setText(null);
        txtPrice.setText(null);
        txtAmount.setText(null);
    }
    //Verifican que el usuario no digite mal un dato
    public static boolean validarNombre(String nombre) {
        return nombre.matches("^([A-Z??-??]{1}[a-z0-9A-Z??????-??]+)$");
    }
    
    public static boolean validarPrecio(String precio) {
        return precio.matches("^[0-9]{3}[0-9]+$");
    }
    
    public static boolean validarCabtidad(String cantidad) {
        return cantidad.matches("^[0-9]+$");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
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
