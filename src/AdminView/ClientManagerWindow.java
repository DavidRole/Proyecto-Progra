/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminView;

import Storage.Storage;
import Usuario.User;
import adminControlers.ClientManagerController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darod
 */
public class ClientManagerWindow extends javax.swing.JFrame {

    private ClientManagerController controller;
    private Storage storage;
    private DefaultTableModel dm;

    /**
     * Creates new form DoctorManagerWindow
     */
    public ClientManagerWindow(Storage storage) {
        initComponents();
        setLocationRelativeTo(null);
        controller = new ClientManagerController();
        bt_askClient.setEnabled(false);
        this.storage = storage;
        String[] clientsColumnHeaders = { "Nombre", "Apellido", "Cedula"};
        dm = new DefaultTableModel(clientsColumnHeaders, 0);
        tb_clients.setModel(dm);
        
        addRows();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_home = new javax.swing.JButton();
        bt_askClient = new javax.swing.JButton();
        lb_docs = new javax.swing.JLabel();
        scrollClients = new javax.swing.JScrollPane();
        tb_clients = new javax.swing.JTable();
        lb_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_home.setText("Inicio");
        bt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_homeActionPerformed(evt);
            }
        });
        getContentPane().add(bt_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        bt_askClient.setText("Consultar Cliente");
        bt_askClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_askClientActionPerformed(evt);
            }
        });
        getContentPane().add(bt_askClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 160, -1));

        lb_docs.setBackground(new java.awt.Color(255, 255, 255));
        lb_docs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_docs.setForeground(new java.awt.Color(255, 255, 255));
        lb_docs.setText("Clientes");
        getContentPane().add(lb_docs, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, 30));

        tb_clients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cedula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_clients.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tb_clientsFocusGained(evt);
            }
        });
        scrollClients.setViewportView(tb_clients);

        getContentPane().add(scrollClients, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 60, 520, 260));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundAdmin.jpg"))); // NOI18N
        getContentPane().add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_homeActionPerformed
        dispose();
    }//GEN-LAST:event_bt_homeActionPerformed

    private void bt_askClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_askClientActionPerformed
        int row = tb_clients.getSelectedRow();
        User temp;
        if (row > -1) {
            temp = storage.getClients().get(row);
        } else {
            temp = null;
        }
        controller.clientInfo(temp, storage);
    }//GEN-LAST:event_bt_askClientActionPerformed

    private void tb_clientsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tb_clientsFocusGained
        bt_askClient.setEnabled(true);
    }//GEN-LAST:event_tb_clientsFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_askClient;
    private javax.swing.JButton bt_home;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_docs;
    private javax.swing.JScrollPane scrollClients;
    private javax.swing.JTable tb_clients;
    // End of variables declaration//GEN-END:variables

    private void addRows() {
        ArrayList<User> list = storage.getClients();
        dm.setRowCount(0);
        
        for (User user : list) {
            dm.addRow(user.toRow());
        }
        
        dm.fireTableDataChanged();
    }
    
    
}
