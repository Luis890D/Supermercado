/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author DELL
 */
public class Supervisor extends javax.swing.JFrame {

    /**
     * Creates new form Supervisor
     */
    public Supervisor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Supervisor");
        this.setSize(820,510);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblSupervisor = new javax.swing.JLabel();
        lblVendedor2 = new javax.swing.JLabel();
        lblVendedor4 = new javax.swing.JLabel();
        lblVendedor5 = new javax.swing.JLabel();
        lblVendedor6 = new javax.swing.JLabel();
        lblVendedor3 = new javax.swing.JLabel();
        lblVendedor7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Atrás = new javax.swing.JButton();

        jButton3.setBackground(new java.awt.Color(243, 131, 28));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images__1_-removebg-preview.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 131, 28));

        lblSupervisor.setBackground(new java.awt.Color(51, 255, 51));
        lblSupervisor.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblSupervisor.setForeground(new java.awt.Color(255, 255, 255));
        lblSupervisor.setText("Bienvenido ");

        lblVendedor2.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor2.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor2.setText("(nombre del supervisor)");

        lblVendedor4.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor4.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor4.setText("Rol: ");

        lblVendedor5.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor5.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor5.setText("Usuario:");

        lblVendedor6.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblVendedor6.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor6.setText("Supervisor");

        lblVendedor3.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor3.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor3.setText("Gestion de Productos");

        lblVendedor7.setBackground(new java.awt.Color(0, 0, 153));
        lblVendedor7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblVendedor7.setForeground(new java.awt.Color(255, 255, 255));
        lblVendedor7.setText("Gestion de Inventarios");

        jButton5.setBackground(new java.awt.Color(243, 131, 28));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventarios-removebg-preview.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(243, 131, 28));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Atrás.setText("<- Atrás ");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVendedor5)
                                .addGap(208, 208, 208)
                                .addComponent(lblSupervisor))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Atrás)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblVendedor4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblVendedor6)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVendedor3)
                            .addComponent(jButton6))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(lblVendedor7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(lblVendedor2)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor4)
                    .addComponent(lblVendedor6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVendedor5)
                        .addGap(28, 28, 28)
                        .addComponent(lblVendedor2)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVendedor3)
                            .addComponent(lblVendedor7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addComponent(lblSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(Atrás)
                .addGap(47, 47, 47))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        GestionInventario getnInventario = new GestionInventario();
        getnInventario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        GestionProductos gestionP = new GestionProductos();
        gestionP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void AtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrásActionPerformed
        // TODO add your handling code here:
        inicio ini = new inicio();
        ini.setVisible(true);
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
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supervisor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atrás;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSupervisor;
    private javax.swing.JLabel lblVendedor2;
    private javax.swing.JLabel lblVendedor3;
    private javax.swing.JLabel lblVendedor4;
    private javax.swing.JLabel lblVendedor5;
    private javax.swing.JLabel lblVendedor6;
    private javax.swing.JLabel lblVendedor7;
    // End of variables declaration//GEN-END:variables
}
