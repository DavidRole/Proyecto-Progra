/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import citas.appointment;
import doctor.doctor;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class CancelAppointmentControler {
    private ArrayList<doctor> doctorList;

    public CancelAppointmentControler(ArrayList<doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
    public void deleteAppoitment(appointment appointment){
        for (int i = 0; i < doctorList.size()-1; i++) {
            if (doctorList.get(i) == appointment) {
                doctorList.remove(i);
            }
        }
    }
}
