/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appSuperMercado.Interfaces;

import appSuperMercado.dao.ProductoDAO;
import appSuperMercado.modelo.Producto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class GestionProductos extends javax.swing.JFrame {

    /**
     * Creates new form VistaSupervisor
     */
    public GestionProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Gestión de Productos");
        this.setLocationRelativeTo(null);
        this.setSize(799, 510);
        this.setLayout(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSupervisor = new javax.swing.JPanel();
        lblVendedor1 = new javax.swing.JLabel();
        lblGestionClientesVentas = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lblVendedor2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        lblVendedor4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        FieldUsuario = new javax.swing.JTextField();
        lblVendedor6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelSupervisor.setBackground(new java.awt.Color(243, 131, 28));

        lblVendedor1.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor1.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor1.setText("Usuario:");

        lblGestionClientesVentas.setBackground(new java.awt.Color(51, 255, 51));
        lblGestionClientesVentas.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblGestionClientesVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblGestionClientesVentas.setText("Gestion Productos");

        jButton3.setText("Agregar nuevo Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblVendedor2.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor2.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor2.setText("Supervisor: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Código de barras", "Precio", "Promocion", "Categoría"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Editar Producto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblVendedor4.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor4.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor4.setText("Productos existentes:");

        jButton5.setText("Buscar producto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        FieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsuarioActionPerformed(evt);
            }
        });

        lblVendedor6.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVendedor6.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor6.setText("Código de barras");

        jButton1.setText("<-Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSupervisorLayout = new javax.swing.GroupLayout(PanelSupervisor);
        PanelSupervisor.setLayout(PanelSupervisorLayout);
        PanelSupervisorLayout.setHorizontalGroup(
            PanelSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSupervisorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSupervisorLayout.createSequentialGroup()
                        .addComponent(lblVendedor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelSupervisorLayout.createSequentialGroup()
                        .addComponent(lblVendedor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(lblGestionClientesVentas)
                        .addGap(87, 87, 87)))
                .addComponent(jButton1)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSupervisorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVendedor6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelSupervisorLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(PanelSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSupervisorLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelSupervisorLayout.createSequentialGroup()
                        .addGroup(PanelSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVendedor4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelSupervisorLayout.setVerticalGroup(
            PanelSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSupervisorLayout.createSequentialGroup()
                .addGroup(PanelSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSupervisorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVendedor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVendedor1)
                            .addComponent(lblGestionClientesVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelSupervisorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor6)
                    .addComponent(FieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(lblVendedor4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSupervisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSupervisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AggProducto agregarP = new AggProducto();
        agregarP.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "REALIZAR LA LOGICA");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Obtener el código de barras del campo de texto
        String codigoStr = FieldUsuario.getText();

        // Validar que el campo no esté vacío
        if (codigoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa un código de barras.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Convertir el código a un entero
            int codigo = Integer.parseInt(codigoStr);

            // Crear una instancia del DAO
            ProductoDAO productoDAO = new ProductoDAO();

            // Obtener el producto por su código
            Producto producto = productoDAO.getProductoPorCodigo(codigo);

            // Verificar si se encontró el producto
            if (producto != null) {
                // Limpiar la tabla antes de mostrar el nuevo producto
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0); // Limpiar la tabla

                // Agregar el producto a la tabla
                model.addRow(new Object[]{
                    producto.getNombreProducto(),
                    producto.getCodigo(),
                    producto.getPrecio(),
                    producto.getPromocion(),
                    producto.getIdCategoria()
                });
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el producto con el código ingresado.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El código de barras debe ser un número.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void FieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Supervisor supervisor = new Supervisor();
        supervisor.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldUsuario;
    private javax.swing.JPanel PanelSupervisor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblGestionClientesVentas;
    private javax.swing.JLabel lblVendedor1;
    private javax.swing.JLabel lblVendedor2;
    private javax.swing.JLabel lblVendedor4;
    private javax.swing.JLabel lblVendedor6;
    // End of variables declaration//GEN-END:variables
}
