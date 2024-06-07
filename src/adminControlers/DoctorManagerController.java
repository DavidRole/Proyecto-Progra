/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import AdminView.DoctorRegisterWindow;

/**
 *
 * @author crist
 */
public class DoctorManagerController {
    
    public void registerWindow(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorRegisterWindow().setVisible(true);
            }
        });
    }
    public void deleteDoctor(){
    
    }
}
