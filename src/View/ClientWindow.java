/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import controler.ClientWindowControler;
import controler.FormRegisterControler;
import controler.HomeWindowControler;

/**
 *
 * @author darod
 */
public class ClientWindow extends javax.swing.JFrame {

    private ClientWindowControler controler;
    private FormRegisterControler controlerForm;

    /**
     * Creates new form ClientWindow
     */
    public ClientWindow() {
        initComponents();
        setLocationRelativeTo(null);
        controlerForm = new FormRegisterControler();
        controler = new ClientWindowControler(controlerForm);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pf_password = new javax.swing.JPasswordField();
        txt_Id = new javax.swing.JTextField();
        lb_indication = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bt_singUp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_register = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenido al registro de citas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 240, 40));

        pf_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, -1));

        txt_Id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 130, -1));

        lb_indication.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_indication.setText("Cedula");
        getContentPane().add(lb_indication, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        lb_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_password.setText("Contraseña");
        getContentPane().add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Inicio de Sesión");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 100, 30));

        bt_singUp.setText("Iniciar Sesión");
        bt_singUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_singUpActionPerformed(evt);
            }
        });
        getContentPane().add(bt_singUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 130, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel4.setText("Si aún no tienes cuenta, puedes registrarte");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 240, 20));

        bt_register.setText("Registrarse");
        bt_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registerMouseClicked(evt);
            }
        });
        getContentPane().add(bt_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 130, -1));

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 300, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_singUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_singUpActionPerformed
        String id = txt_Id.getText();
        String password = pf_password.getText();

        if (controler.logIn(id, password)) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new HomeWindow().setVisible(true);
                }
            });
        }

    }//GEN-LAST:event_bt_singUpActionPerformed

    private void bt_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registerMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister(controlerForm).setVisible(true);
            }
        });
    }//GEN-LAST:event_bt_registerMouseClicked

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
            java.util.logging.Logger.getLogger(ClientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_register;
    private javax.swing.JButton bt_singUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_indication;
    private javax.swing.JLabel lb_password;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField txt_Id;
    // End of variables declaration//GEN-END:variables
}
