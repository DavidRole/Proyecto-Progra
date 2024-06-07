/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminView;

import adminControlers.ManageDoctorsControler;

/**
 *
 * @author darod
 */
public class DoctorManagerWindow extends javax.swing.JFrame {
    private ManageDoctorsControler controler;
    /**
     * Creates new form DoctorManagerWindow
     */
    public DoctorManagerWindow() {
        initComponents();
        setLocationRelativeTo(null);
        controler=new ManageDoctorsControler();

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
        bt_addSchedule = new javax.swing.JButton();
        bt_removeSchedule = new javax.swing.JButton();
        bt_addDoctor = new javax.swing.JButton();
        bt_removeDoctor = new javax.swing.JButton();
        lb_docs = new javax.swing.JLabel();
        lb_appointments = new javax.swing.JLabel();
        jl_doctorList = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jl_schedule = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lb_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_home.setText("Inicio");
        bt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_homeActionPerformed(evt);
            }
        });
        getContentPane().add(bt_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, -1, -1));

        bt_cancelAppointment.setText("Cancelar Cita");
        bt_cancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cancelAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        bt_addSchedule.setText("Agregar Día Laboral");
        bt_addSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addScheduleActionPerformed(evt);
            }
        });
        getContentPane().add(bt_addSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

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
        getContentPane().add(bt_removeDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

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

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jl_doctorList.setViewportView(jList2);

        getContentPane().add(jl_doctorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 530, 260));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jl_schedule.setViewportView(jList1);

        getContentPane().add(jl_schedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 300, 260));

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

    private void bt_addScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_addScheduleActionPerformed

    private void bt_removeScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removeScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_removeScheduleActionPerformed

    private void bt_addDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addDoctorActionPerformed
        controler.registerWindow();
    }//GEN-LAST:event_bt_addDoctorActionPerformed

    private void bt_removeDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removeDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_removeDoctorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addDoctor;
    private javax.swing.JButton bt_addSchedule;
    private javax.swing.JButton bt_cancelAppointment;
    private javax.swing.JButton bt_home;
    private javax.swing.JButton bt_removeDoctor;
    private javax.swing.JButton bt_removeSchedule;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jl_doctorList;
    private javax.swing.JScrollPane jl_schedule;
    private javax.swing.JLabel lb_appointments;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_docs;
    // End of variables declaration//GEN-END:variables
}
