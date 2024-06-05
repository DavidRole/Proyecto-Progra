/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author darod
 */
public class CancelAppointmentWindow extends javax.swing.JFrame {

    /**
     * Creates new form CancelAppointmentWindow
     */
    public CancelAppointmentWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_AppointmentsList = new javax.swing.JTable();
        lb_title = new javax.swing.JLabel();
        bt_cancelAppointment = new javax.swing.JButton();
        bt_home = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb_AppointmentsList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor", "Especialidad", "Hora", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tb_AppointmentsList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 63, 480, 290));

        lb_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_title.setText("Seleccione la cita a cancelar");
        getContentPane().add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        bt_cancelAppointment.setText("Cancelar Cita");
        getContentPane().add(bt_cancelAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        bt_home.setText("Inicio");
        bt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_homeActionPerformed(evt);
            }
        });
        getContentPane().add(bt_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_homeActionPerformed
        dispose();
    }//GEN-LAST:event_bt_homeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelAppointment;
    private javax.swing.JButton bt_home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_title;
    private javax.swing.JTable tb_AppointmentsList;
    // End of variables declaration//GEN-END:variables
}
