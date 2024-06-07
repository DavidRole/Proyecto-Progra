/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import AdminView.ClientManagerWindow;
import AdminView.DoctorManagerWindow;
import Storage.Storage;


/**
 *
 * @author crist
 */
public class AdminHomeController {
    public void DoctorManagerWindow(Storage storage){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorManagerWindow().setVisible(true);
            }
        });
    }
    public void ClientManagerWindow(Storage storage){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientManagerWindow(storage).setVisible(true);
            }
        });
    }
    
}
