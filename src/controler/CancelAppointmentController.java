/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import citas.appointment;
import citas.scheduleList;

/**
 *
 * @author crist
 */
public class CancelAppointmentController {
    private scheduleList list;

    public CancelAppointmentController(scheduleList list) {
        this.list = list;
    }
    
    public void deleteAppoitment(appointment appointment){
        appointment temp = list.getAppointment(appointment);
        //escribir la cita cancelada en la otra vara
        temp.setAvailable(true);
        temp.setPacient(null);
    }
}
