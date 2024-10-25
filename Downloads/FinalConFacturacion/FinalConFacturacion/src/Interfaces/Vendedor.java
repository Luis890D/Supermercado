/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appSuperMercado.Interfaces;

import appSuperMercado.Interfaces.Vender;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Vendedor extends javax.swing.JFrame {

    /**
     * Creates new form Vendedor
     */
    public Vendedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Vendedor");
        //COLOCAR ANCHO
        //                       Hori    Verti
        this.setSize(800, 500);
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
        lblVendedor1 = new javax.swing.JLabel();
        lblVendedor2 = new javax.swing.JLabel();
        lblVendedor3 = new javax.swing.JLabel();
        lblVendedor4 = new javax.swing.JLabel();
        lblVendedor5 = new javax.swing.JLabel();
        lblVendedor6 = new javax.swing.JLabel();
        lblVendedor7 = new javax.swing.JLabel();
        Atrás = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 131, 28));

        lblSupervisor.setBackground(new java.awt.Color(51, 255, 51));
        lblSupervisor.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblSupervisor.setForeground(new java.awt.Color(255, 255, 255));
        lblSupervisor.setText("Bienvenido ");

        lblVendedor1.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor1.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor1.setText("Realiza tus ventas");

        lblVendedor2.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor2.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor2.setText("(nombre del vendedor)");

        lblVendedor3.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor3.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor3.setText("Gestionar tus Clientes");

        lblVendedor4.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor4.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor4.setText("Rol: ");

        lblVendedor5.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVendedor5.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor5.setText("Vendedor");

        lblVendedor6.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor6.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor6.setText("Usuario:");

        lblVendedor7.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVendedor7.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor7.setText("asda");

        Atrás.setText("<- Atrás ");
        Atrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrásActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(243, 131, 28));
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appSuperMercado/imagenes/images__1_-removebg-preview.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(243, 131, 28));
        jButton4.setForeground(new java.awt.Color(153, 0, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/appSuperMercado/imagenes/686317.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVendedor6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVendedor7)
                                .addGap(170, 170, 170)
                                .addComponent(lblSupervisor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVendedor4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVendedor5))
                            .addComponent(Atrás)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVendedor1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblVendedor3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(lblVendedor2)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor4)
                    .addComponent(lblVendedor5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor6)
                    .addComponent(lblVendedor7)
                    .addComponent(lblSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVendedor2)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor1)
                    .addComponent(lblVendedor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Atrás)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrásActionPerformed
        // TODO add your handling code here:
        inicio ini = new inicio();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrásActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Vender vender = new Vender();
        vender.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        GestionClientes gestionC = new GestionClientes();
        gestionC.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atrás;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSupervisor;
    private javax.swing.JLabel lblVendedor1;
    private javax.swing.JLabel lblVendedor2;
    private javax.swing.JLabel lblVendedor3;
    private javax.swing.JLabel lblVendedor4;
    private javax.swing.JLabel lblVendedor5;
    private javax.swing.JLabel lblVendedor6;
    private javax.swing.JLabel lblVendedor7;
    // End of variables declaration//GEN-END:variables
}
