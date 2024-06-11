/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ClientView;

import Storage.Storage;
import Usuario.User;
import appointments.appointment;
import appointments.schedule;
import controler.CancelAppointmentController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darod
 */
public class CancelAppointmentWindow extends javax.swing.JFrame {

    private DefaultTableModel dmApp;
    private Storage storage;
    private User user;

    private CancelAppointmentController controler;

    public CancelAppointmentWindow(Storage storage, User user) {
        dmApp = new DefaultTableModel();
        initComponents();

        tb_AppointmentsList.setModel(dmApp);
        this.storage = storage;
        setLocationRelativeTo(null);
        this.user = user;
        
        initializeModels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_title = new javax.swing.JLabel();
        bt_cancelAppointment = new javax.swing.JButton();
        bt_home = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_AppointmentsList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_title.setText("Seleccione la cita a cancelar");
        getContentPane().add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        bt_cancelAppointment.setText("Cancelar Cita");
        bt_cancelAppointment.setEnabled(false);
        bt_cancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cancelAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        bt_home.setText("Inicio");
        bt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_homeActionPerformed(evt);
            }
        });
        getContentPane().add(bt_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_AppointmentsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor", "Especialidad", "Fecha"
            }
        ));
        tb_AppointmentsList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_AppointmentsList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 480, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6846089.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_homeActionPerformed
        dispose();
    }//GEN-LAST:event_bt_homeActionPerformed

    private void bt_cancelAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelAppointmentActionPerformed


    }//GEN-LAST:event_bt_cancelAppointmentActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelAppointment;
    private javax.swing.JButton bt_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_title;
    private javax.swing.JTable tb_AppointmentsList;
    // End of variables declaration//GEN-END:variables
    private void initializeModels() {
        // Encabezados de las columnas
        String[] appointmentColumnHeaders = {"Doctor", "Especialidad", "Fecha"};

        // Crear modelos de tabla con los encabezados
        dmApp = new DefaultTableModel(appointmentColumnHeaders, 0);

        // Asignar los modelos a las tablas
        tb_AppointmentsList.setModel(dmApp);

    }

    private void addScheduleRow(int id) {
        schedule temp = storage.getSchedulePerDoctor(id);
        ArrayList<appointment> list = temp.getAvailable();
        dmApp.setRowCount(0);

        for (appointment object : list) {
            dmApp.addRow(object.appointMenttoRow());

        }
        dmApp.fireTableDataChanged();
    }
}
