/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import dao.ClientesDAO;
import modelo.Clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class GestionClientes extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    /**
     * Creates new form GestionClientes
     */
    public GestionClientes() {
        initComponents();
        this.setTitle("Gestion de clientes");
        this.setLocationRelativeTo(null);
        this.setSize(800, 500);
        initializeTableModel(); // Inicializa el modelo de la tabla
        setupListeners(); // Configura los listeners
    }

    private void initializeTableModel() {
        tableModel = new DefaultTableModel(new Object[][]{}, new String[]{
            "ID", "Nombre Completo", "NIT", "Direccion"
        });
        TableClientes.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSupervisor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        lblVendedor4 = new javax.swing.JLabel();
        lblVendedor5 = new javax.swing.JLabel();
        FieldUsuario = new javax.swing.JTextField();
        lblVendedor6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Atrás = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 138, 31));

        lblSupervisor.setBackground(new java.awt.Color(51, 255, 51));
        lblSupervisor.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblSupervisor.setForeground(new java.awt.Color(255, 255, 255));
        lblSupervisor.setText("Clientes");

        TableClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TableClientes.setForeground(new java.awt.Color(204, 204, 204));
        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Completo", "NIT", "Direccion"
            }
        ));
        TableClientes.setSelectionBackground(new java.awt.Color(204, 204, 204));
        TableClientes.setSelectionForeground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(TableClientes);

        lblVendedor4.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor4.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor4.setText("Rol: ");

        lblVendedor5.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor5.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor5.setText("Usuario: ");

        FieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsuarioActionPerformed(evt);
            }
        });

        lblVendedor6.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor6.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor6.setText("NIT CLIENTE");

        jButton1.setText("Buscar");

        Atrás.setText("<-Atrás");
        Atrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrásActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVendedor5)
                        .addGap(219, 219, 219)
                        .addComponent(lblSupervisor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVendedor4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Atrás)
                        .addGap(30, 30, 30))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVendedor6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Atrás))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVendedor5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void setupListeners() {
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarCliente(); // Llama al método de búsqueda al hacer clic en "Buscar"
            }
        });
    }

    private void buscarCliente() {
        String nitUsuario = FieldUsuario.getText();
        // Implement search logic using ClientesDAO
        ClientesDAO clientesDAO = new ClientesDAO();
        List<Clientes> clientes = clientesDAO.getClientesByUsuario(nitUsuario);

        // Clear the table before updating
        tableModel.setRowCount(0);

        for (Clientes cliente : clientes) {
            // Assuming Clientes has getters for ID, nombreCompleto, NIT, etc.
            tableModel.addRow(new Object[]{
                cliente.getIdCliente(), // Asegúrate de que este método esté definido en la clase Clientes
                cliente.getNombreCliente() + " " + cliente.getApellidoCliente(), // Concatenando nombre y apellido
                cliente.getNit(),
                cliente.getDireccion(), // Puedes agregar más atributos según sea necesario
                cliente.getCorreoElectronico(),
                cliente.getNumeroTelefonico()
            });
        }

        FieldUsuario.setText(""); // Clear the text field
    }
    
    private void FieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsuarioActionPerformed

    private void AtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrásActionPerformed

        Vendedor vendedor = new Vendedor();
        this.setVisible(false);
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrásActionPerformed

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
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atrás;
    private javax.swing.JTextField FieldUsuario;
    private javax.swing.JTable TableClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSupervisor;
    private javax.swing.JLabel lblVendedor4;
    private javax.swing.JLabel lblVendedor5;
    private javax.swing.JLabel lblVendedor6;
    // End of variables declaration//GEN-END:variables
}
