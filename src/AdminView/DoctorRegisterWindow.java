/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminView;

import Storage.Storage;
import adminControlers.DoctorRegisterController;
import doctor.speciality;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author darod
 */
public class DoctorRegisterWindow extends javax.swing.JFrame {

    private Storage storage;
    private DoctorRegisterController controller;

    /**
     * Creates new form DoctorRegisterWindow
     */
    public DoctorRegisterWindow(Storage storage) {
        initComponents();
        setLocationRelativeTo(null);
        this.storage = storage;
        cb_speciality.addItem(speciality.anastesiologia.name());
        cb_speciality.addItem(speciality.cardiologia.name());
        cb_speciality.addItem(speciality.dermatologia.name());
        cb_speciality.addItem(speciality.endocrinologia.name());
        cb_speciality.addItem(speciality.gastroenterologia.name());
        cb_speciality.addItem(speciality.internismo.name());
        cb_speciality.addItem(speciality.neurologia.name());
        cb_speciality.addItem(speciality.oncologia.name());
        cb_speciality.addItem(speciality.pediatria.name());
        cb_speciality.addItem(speciality.radiologia.name());
        
        controller = new DoctorRegisterController(storage);
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
        lb_title = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cb_speciality = new javax.swing.JComboBox<>();
        bt_registerDoc = new javax.swing.JButton();
        bt_home = new javax.swing.JButton();
        lb_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_title.setBackground(new java.awt.Color(255, 255, 255));
        lb_title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 255, 255));
        lb_title.setText("Formulario de Registro de Doctores");
        jPanel1.add(lb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lb_name.setBackground(new java.awt.Color(255, 255, 255));
        lb_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_name.setText("Nombre");
        jPanel1.add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, 20));

        lb_id.setBackground(new java.awt.Color(255, 255, 255));
        lb_id.setForeground(new java.awt.Color(255, 255, 255));
        lb_id.setText("ID del Empleado");
        jPanel1.add(lb_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 160, -1));
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 160, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Especialidad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        cb_speciality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion" }));
        jPanel1.add(cb_speciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, -1));

        bt_registerDoc.setText("Registrar Doctor");
        bt_registerDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registerDocActionPerformed(evt);
            }
        });
        jPanel1.add(bt_registerDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        bt_home.setText("Atrás");
        bt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_homeActionPerformed(evt);
            }
        });
        jPanel1.add(bt_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundAdmin.jpg"))); // NOI18N
        jPanel1.add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 300, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_registerDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registerDocActionPerformed
        String name = txt_name.getText();
        int id = Integer.parseInt(txt_id.getText());
        speciality spec = parser((String) cb_speciality.getSelectedItem());

        if (controller.register(name, id, spec)) {
            JOptionPane.showMessageDialog(null, "El doctor fue agregado exitosamente");
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"El doctor no se ha podido agregar porque ya existe" , "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_bt_registerDocActionPerformed

    private void bt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_homeActionPerformed
        dispose();
    }//GEN-LAST:event_bt_homeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_home;
    private javax.swing.JButton bt_registerDoc;
    private javax.swing.JComboBox<String> cb_speciality;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_title;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
    public speciality parser(String spec) {
        switch (spec) {
            case "cardiologia":
                return speciality.cardiologia;
            case "radiologia":
                return speciality.radiologia;
            case "endocrinologia":
                return speciality.endocrinologia;
            case "dermatologia":
                return speciality.dermatologia;
            case "neurologia":
                return speciality.neurologia;
            case "internismo":
                return speciality.internismo;
            case "oncologia":
                return speciality.oncologia;
            case "pediatria":
                return speciality.oncologia;
            case "gastroenterologia":
                return speciality.gastroenterologia;
            case "anastesiologia":
                return speciality.anastesiologia;
            default:
                return null;
        }
    }
}
