/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appSuperMercado.Interfaces;

import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio");
        this.setLocationRelativeTo(null);
        //COLOCAR ANCHO
        //                       Hori    Verti
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 500);    
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblHola = new javax.swing.JLabel();
        lblAccedidoAlSistema = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnIniciar1 = new javax.swing.JButton();
        JLabelTIpoUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 131, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images.png"))); // NOI18N

        lblHola.setBackground(new java.awt.Color(51, 255, 51));
        lblHola.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblHola.setForeground(new java.awt.Color(255, 255, 255));
        lblHola.setText("¡Hola!");

        lblAccedidoAlSistema.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblAccedidoAlSistema.setForeground(new java.awt.Color(255, 255, 255));
        lblAccedidoAlSistema.setText("Bienvenido al sistema");

        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(153, 153, 153));
        btnIniciar.setText("Supervisor");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnIniciar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIniciar1.setForeground(new java.awt.Color(153, 153, 153));
        btnIniciar1.setText("Vendedor");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });

        JLabelTIpoUsuario.setBackground(new java.awt.Color(153, 153, 153));
        JLabelTIpoUsuario.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        JLabelTIpoUsuario.setForeground(new java.awt.Color(102, 102, 102));
        JLabelTIpoUsuario.setText("Seleccione el tipo de usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JLabelTIpoUsuario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIniciar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIniciar)))
                .addGap(294, 294, 294))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(lblHola))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lblAccedidoAlSistema))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblHola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAccedidoAlSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelTIpoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar1)
                    .addComponent(btnIniciar))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
        // TODO add your handling code here:
        Vendedor vendedor = new Vendedor();
        vendedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciar1ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        Supervisor supervisor = new Supervisor();
        supervisor.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelTIpoUsuario;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccedidoAlSistema;
    private javax.swing.JLabel lblHola;
    // End of variables declaration//GEN-END:variables
}
