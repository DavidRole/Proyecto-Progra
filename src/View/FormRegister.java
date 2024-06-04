/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author darod
 */
public class FormRegister extends javax.swing.JFrame {

    /**
     * Creates new form FormRegister
     */
    public FormRegister() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jtxf_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxf_Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxf_BirthDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxf_Name = new javax.swing.JTextField();
        jpf_Password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jtxf_LastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxf_phoneNumber = new javax.swing.JTextField();
        jbt_Register = new javax.swing.JButton();
        jbt_Cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Formulario de inscripcion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 270, 29));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Numero de Cedula (Formato 00-0000-0000)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        getContentPane().add(Jtxf_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Correo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(jtxf_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña (Minimo 10 caracteres y maximo 16)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento (dd/mm/yyyy)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 240, -1));
        getContentPane().add(jtxf_BirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 220, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Nombre (Maximo 30 caracteres)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 230, -1));
        getContentPane().add(jtxf_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 220, -1));

        jpf_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpf_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jpf_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 220, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Apellido");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));
        getContentPane().add(jtxf_LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 220, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Numero de telefono (Formato 0000-0000)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));
        getContentPane().add(jtxf_phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 220, -1));

        jbt_Register.setText("Registrar");
        jbt_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jbt_Cancel.setText("Cancelar");
        jbt_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_CancelActionPerformed(evt);
            }
        });
        getContentPane().add(jbt_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpf_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpf_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpf_PasswordActionPerformed

    private void jbt_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_RegisterActionPerformed

    }//GEN-LAST:event_jbt_RegisterActionPerformed

    private void jbt_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_CancelActionPerformed

    }//GEN-LAST:event_jbt_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jtxf_ID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbt_Cancel;
    private javax.swing.JButton jbt_Register;
    private javax.swing.JPasswordField jpf_Password;
    private javax.swing.JTextField jtxf_BirthDate;
    private javax.swing.JTextField jtxf_Email;
    private javax.swing.JTextField jtxf_LastName;
    private javax.swing.JTextField jtxf_Name;
    private javax.swing.JTextField jtxf_phoneNumber;
    // End of variables declaration//GEN-END:variables
}
