/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Usuario.User;
import appointments.appointment;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class ScheduleAppointmentController {
    
    
    
    public void addAppointment(appointment appointment ,User u){
        
        appointment.setPacient(u);
    }
}
