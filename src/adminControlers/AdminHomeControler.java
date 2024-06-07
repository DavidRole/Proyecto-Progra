/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import AdminView.AdminLogInWindow;
import AdminView.DoctorManagerWindow;


/**
 *
 * @author crist
 */
public class AdminHomeControler {
    public void manegeWindow(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorManagerWindow().setVisible(true);
            }
        });
    }
    public void adminLogInWindow(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogInWindow().setVisible(true);
            }
        });
    }
}
