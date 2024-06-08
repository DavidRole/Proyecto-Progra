/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointments;

import java.util.ArrayList;

/**
 *
 * @author darod
 */
public class scheduleList {
    private ArrayList<schedule> schedules;

    public scheduleList(ArrayList<schedule> schedules) {
        this.schedules = schedules;
    }
    
    public ArrayList<appointment> getActiveAppointments(String id){
        ArrayList<appointment> activeAppointments = new ArrayList<>();
        appointment temp = null;
        
        for (schedule schedule1 : schedules) {
            temp = schedule1.getAppointment(id);
            activeAppointments.add(temp);
        }
        
        return activeAppointments;
    }
    
    public appointment getAppointment(appointment ap){
        appointment temp = null;
        
        for (schedule schedule1 : schedules) {
            schedule1.getAppointment(ap);
        }
        
        return temp;
    }
    
    public schedule getSchedulePerDoctor(int id){
        for (schedule schedule1 : schedules) {
            if(schedule1.getDoctor().getId() == id){
                return schedule1;
            }
        }
        return null;// cambiar por exception TALVEZ
    }
}
