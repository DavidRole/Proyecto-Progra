/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import AdminView.DoctorRegisterWindow;
import Storage.Storage;

/**
 *
 * @author crist
 */
public class DoctorManagerController {
    
    public void registerWindow(Storage storage){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorRegisterWindow(storage).setVisible(true);
            }
        });
    }
    public void deleteDoctor(){
    
    }
}
