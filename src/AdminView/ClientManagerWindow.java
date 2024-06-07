/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdminView;

/**
 *
 * @author darod
 */
public class ClientManagerWindow extends javax.swing.JFrame {

    /**
     * Creates new form DoctorManagerWindow
     */
    public ClientManagerWindow() {
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

        bt_home = new javax.swing.JButton();
        bt_askClient = new javax.swing.JButton();
        lb_docs = new javax.swing.JLabel();
        jl_doctorList = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
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
        getContentPane().add(bt_askClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 130, -1));

        lb_docs.setBackground(new java.awt.Color(255, 255, 255));
        lb_docs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_docs.setForeground(new java.awt.Color(255, 255, 255));
        lb_docs.setText("Clientes");
        getContentPane().add(lb_docs, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, 30));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jl_doctorList.setViewportView(jList2);

        getContentPane().add(jl_doctorList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 530, 260));

        lb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundAdmin.jpg"))); // NOI18N
        getContentPane().add(lb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_homeActionPerformed
        dispose();
    }//GEN-LAST:event_bt_homeActionPerformed

    private void bt_askClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_askClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_askClientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_askClient;
    private javax.swing.JButton bt_home;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jl_doctorList;
    private javax.swing.JLabel lb_background;
    private javax.swing.JLabel lb_docs;
    // End of variables declaration//GEN-END:variables
}
