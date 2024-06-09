/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminView;

import Storage.Storage;
import Usuario.User;

import adminControlers.AdminLogInController;
import appointments.schedule;
import doctor.doctor;
import doctor.speciality;
import java.util.GregorianCalendar;

//aca estuvo juanpa arreglando
/**
 *
 * @author darod
 */
public class AdminLogInWindow extends javax.swing.JFrame {

    private static Storage storage;
    private AdminLogInController controler;

    /**
     * Creates new form AdminSignInWindow
     */
    public AdminLogInWindow() {
        initComponents();
        setLocationRelativeTo(null);
        storage = new Storage();
        storage.doctorReader();
        storage.clientReader();
        storage.scheduleReader();
        controler = new AdminLogInController(storage);
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
        pf_password = new javax.swing.JPasswordField();
        lb_indication = new javax.swing.JLabel();
        lb_password = new javax.swing.JLabel();
        lb_title = new javax.swing.JLabel();
        lb_LogIn = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        bt_singUp = new javax.swing.JButton();
        lb_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pf_password.setBackground(new java.awt.Color(255, 255, 255));
        pf_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pf_password.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(pf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, -1));

        lb_indication.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_indication.setForeground(new java.awt.Color(255, 255, 255));
        lb_indication.setText("ID");
        jPanel1.add(lb_indication, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        lb_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_password.setForeground(new java.awt.Color(255, 255, 255));
        lb_password.setText("Contraseña");
        jPanel1.add(lb_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        lb_title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("Bienvenido al Administrador");
        jPanel1.add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 240, 40));

        lb_LogIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_LogIn.setForeground(new java.awt.Color(255, 255, 255));
        lb_LogIn.setText("Inicio de Sesión");
        jPanel1.add(lb_LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 100, 30));

        txt_Id.setBackground(new java.awt.Color(255, 255, 255));
        txt_Id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Id.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, -1));

        bt_singUp.setForeground(new java.awt.Color(0, 0, 0));
        bt_singUp.setText("Iniciar Sesión");
        bt_singUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_singUpActionPerformed(evt);
            }
        });
        jPanel1.add(bt_singUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, -1));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundAdmin.jpg"))); // NOI18N
        jPanel1.add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_singUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_singUpActionPerformed
        String id = txt_Id.getText();
        String password = pf_password.getText();

        controler.logIn(id, password);
    }//GEN-LAST:event_bt_singUpActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogInWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        Storage storage = new Storage();
//        storage.addClient(new User("25", "g@mail.com", "Juana2511!", new GregorianCalendar(), "David", "Rodriguez", "8888-8888"));
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogInWindow().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_singUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_LogIn;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_indication;
    private javax.swing.JLabel lb_password;
    private javax.swing.JLabel lb_title;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField txt_Id;
    // End of variables declaration//GEN-END:variables
}
