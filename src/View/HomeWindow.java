/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Storage.Storage;
import controler.HomeWindowController;



/**
 *
 * @author darod
 */
public class HomeWindow extends javax.swing.JFrame {
    
    private HomeWindowController controler;
    private Storage storage;
    /**
     * Creates new form HomeWindow
     */
    public HomeWindow(Storage storage) {
        this.storage = storage;
        initComponents();
        setLocationRelativeTo(null);
        controler = new HomeWindowController();
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
        bt_sched = new javax.swing.JButton();
        bt_cancelApp = new javax.swing.JButton();
        bt_history = new javax.swing.JButton();
        lb_indication = new javax.swing.JLabel();
        lb_title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_sched.setBackground(new java.awt.Color(0, 0, 0));
        bt_sched.setForeground(new java.awt.Color(255, 255, 255));
        bt_sched.setText("Agendar Citas");
        bt_sched.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_schedActionPerformed(evt);
            }
        });
        jPanel1.add(bt_sched, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        bt_cancelApp.setBackground(new java.awt.Color(0, 0, 0));
        bt_cancelApp.setForeground(new java.awt.Color(255, 255, 255));
        bt_cancelApp.setText("Cancelar Citas");
        bt_cancelApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelAppActionPerformed(evt);
            }
        });
        jPanel1.add(bt_cancelApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        bt_history.setBackground(new java.awt.Color(0, 0, 0));
        bt_history.setForeground(new java.awt.Color(255, 255, 255));
        bt_history.setText("Consultar Historial");
        bt_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_historyActionPerformed(evt);
            }
        });
        jPanel1.add(bt_history, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        lb_indication.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_indication.setForeground(new java.awt.Color(0, 0, 0));
        lb_indication.setText("Por favor presione el botón de la accion a realizar");
        jPanel1.add(lb_indication, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 128, 343, 30));

        lb_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_title.setForeground(new java.awt.Color(0, 0, 0));
        lb_title.setText("Bienvenido a nuestro sistema de Citas");
        jPanel1.add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 330, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6846089.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_historyActionPerformed
        controler.historyAction();
    }//GEN-LAST:event_bt_historyActionPerformed

    private void bt_schedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_schedActionPerformed
        controler.schedAction(storage);
    }//GEN-LAST:event_bt_schedActionPerformed

    private void bt_cancelAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelAppActionPerformed
        controler.cancelApp();
    }//GEN-LAST:event_bt_cancelAppActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelApp;
    private javax.swing.JButton bt_history;
    private javax.swing.JButton bt_sched;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_indication;
    private javax.swing.JLabel lb_title;
    // End of variables declaration//GEN-END:variables
}
