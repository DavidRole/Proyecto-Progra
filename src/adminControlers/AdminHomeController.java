/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import AdminView.DoctorManagerWindow;


/**
 *
 * @author crist
 */
public class AdminHomeController {
    public void manegeWindow(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorManagerWindow().setVisible(true);
            }
        });
    }
    
}
