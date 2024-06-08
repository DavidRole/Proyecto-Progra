/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminView;

import Storage.Storage;
import Usuario.User;
import adminControlers.DoctorManagerController;
import appointments.appointment;
import appointments.schedule;
import doctor.doctor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darod
 */
public class DoctorManagerWindow extends javax.swing.JFrame {
    private DoctorManagerController controler;
    private Storage storage;
    private DefaultTableModel dmDoc;
    private DefaultTableModel dmApp;
    /**
     * Creates new form DoctorManagerWindow
     */
    public DoctorManagerWindow(Storage storage) {
        initComponents();
        setLocationRelativeTo(null);
        controler=new DoctorManagerController();
        this.storage = storage;
        bt_cancelAppointment.setEnabled(false); 
        bt_removeDoctor.setEnabled(false);
        dmDoc = new DefaultTableModel();
        dmApp = new DefaultTableModel();
        tb_doctors.setModel(dmDoc);
        tb_appointments.setModel(dmApp);
        
        addDoctorsRows();
        
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
        bt_cancelAppointment = new javax.swing.JButton();
        bt_removeSchedule = new javax.swing.JButton();
        bt_addDoctor = new javax.swing.JButton();
        bt_removeDoctor = new javax.swing.JButton();
        lb_docs = new javax.swing.JLabel();
        lb_appointments = new javax.swing.JLabel();
        scrollAppointments = new javax.swing.JScrollPane();
        tb_appointments = new javax.swing.JTable();
        scrollDoctors = new javax.swing.JScrollPane();
        tb_doctors = new javax.swing.JTable();
        lb_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_home.setText("Inicio");
        bt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_homeActionPerformed(evt);
            }
        });
        getContentPane().add(bt_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, -1));

        bt_cancelAppointment.setText("Cancelar Cita");
        bt_cancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cancelAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        bt_removeSchedule.setText("Eliminar Horario");
        bt_removeSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removeScheduleActionPerformed(evt);
            }
        });
        getContentPane().add(bt_removeSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        bt_addDoctor.setText("Agregar Doctor");
        bt_addDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addDoctorActionPerformed(evt);
            }
        });
        getContentPane().add(bt_addDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, -1));

        bt_removeDoctor.setText("Eliminar Doctor");
        bt_removeDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removeDoctorActionPerformed(evt);
            }
        });
        getContentPane().add(bt_removeDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        lb_docs.setBackground(new java.awt.Color(255, 255, 255));
        lb_docs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_docs.setForeground(new java.awt.Color(255, 255, 255));
        lb_docs.setText("Doctores");
        getContentPane().add(lb_docs, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 80, 30));

        lb_appointments.setBackground(new java.awt.Color(255, 255, 255));
        lb_appointments.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_appointments.setForeground(new java.awt.Color(255, 255, 255));
        lb_appointments.setText("Citas Agendadas");
        getContentPane().add(lb_appointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        tb_appointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cliente", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollAppointments.setViewportView(tb_appointments);

        getContentPane().add(scrollAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 300, 270));

        tb_doctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Especialidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_doctors.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tb_doctorsFocusGained(evt);
            }
        });
        scrollDoctors.setViewportView(tb_doctors);

        getContentPane().add(scrollDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 510, 270));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundAdmin.jpg"))); // NOI18N
        getContentPane().add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_homeActionPerformed
        dispose();
    }//GEN-LAST:event_bt_homeActionPerformed

    private void bt_cancelAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelAppointmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_cancelAppointmentActionPerformed

    private void bt_removeScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removeScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_removeScheduleActionPerformed

    private void bt_addDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addDoctorActionPerformed
        controler.registerWindow(storage);
    }//GEN-LAST:event_bt_addDoctorActionPerformed

    private void bt_removeDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removeDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_removeDoctorActionPerformed

    private void tb_doctorsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tb_doctorsFocusGained
        bt_removeDoctor.setEnabled(true);
        int selected = tb_doctors.getSelectedRow();
        if(selected >-1){
            doctor temp = storage.getDoctors().get(selected); 
            addSchduleRow(temp.getId());
        }
       
    }//GEN-LAST:event_tb_doctorsFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addDoctor;
    private javax.swing.JButton bt_cancelAppointment;
    private javax.swing.JButton bt_home;
    private javax.swing.JButton bt_removeDoctor;
    private javax.swing.JButton bt_removeSchedule;
    private javax.swing.JLabel lb_appointments;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_docs;
    private javax.swing.JScrollPane scrollAppointments;
    private javax.swing.JScrollPane scrollDoctors;
    private javax.swing.JTable tb_appointments;
    private javax.swing.JTable tb_doctors;
    // End of variables declaration//GEN-END:variables

    private void addDoctorsRows() {
        ArrayList<doctor> list = storage.getDoctors();

        for (doctor d : list) {
            dmDoc.addRow(d.toRow());
        }
    }

    private void addSchduleRow(int id){
        schedule temp = storage.getSchedulePerDoctor(id);
        ArrayList<appointment> list = temp.getList();
        for (appointment object : list) {
            dmApp.addRow(object.toRow());
        }
    }
    
}
