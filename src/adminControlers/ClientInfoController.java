/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import AdminView.ScheduleAppointmentWindow;
import Storage.Storage;
import Usuario.User;

/**
 *
 * @author darod
 */
public class ClientInfoController {

    public void addAppointment(User user, Storage storage) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScheduleAppointmentWindow(user, storage).setVisible(true);
            }
        });
    }
    
}
