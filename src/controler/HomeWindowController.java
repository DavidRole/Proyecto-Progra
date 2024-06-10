/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Storage.Storage;
import Usuario.User;
import ClientView.CancelAppointmentWindow;
import ClientView.HistoryAppointmentWindow;
import ClientView.scheduleAppointmentWindow;

/**
 *
 * @author crist
 */
public class HomeWindowController extends javax.swing.JFrame {
    
    public void historyAction(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryAppointmentWindow().setVisible(true);
            }
        });
    }
    public void schedAction(Storage storage,User user){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scheduleAppointmentWindow(storage,user).setVisible(true);
            }
        });
    }
    public void cancelApp(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelAppointmentWindow().setVisible(true);
            }
        });
    }
}
