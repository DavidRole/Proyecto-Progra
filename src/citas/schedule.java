/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;

/**
 *
 * @author david
 */
public class schedule {
    private PriorityQueue<appointment> list = new PriorityQueue<>();
    private GregorianCalendar date; 
    
    
    public String addAppointment(appointment ap){
        date = ap.getDate();
        int hour = date.get(Calendar.HOUR_OF_DAY);
        int minHour = 8;        //Eso representa a las 8am en formato 24h 
        int maxHour = 16;    //Eso representa a las 4pm en formato 24h 
        int inicioAlmuerzo = 12;    //inicio hora de almuerzo de los medicos  
        int finAlmuerzo = 13;       //final hora de almuerzo de los medicos .

        if(hour >= minHour && hour < maxHour){
            if(hour != inicioAlmuerzo && hour >= finAlmuerzo){
                list.add(ap);
                return "La cita fue registrada de manera exitosa";
            }
                return "La cita no puede ser agendada entre medio dia y 1pm por hora de almuerzo";
        }else{
            return "La hora propuesta para la cita es invalida, debe ser entre 8am y 4pm";
        }
    }
    
    
    
    public String getSchedule(){
        String msg = ""; 
        for (appointment object : list) {
            msg += object.toString();
        }
        return msg; 
    }
}
