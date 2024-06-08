/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointments;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class schedule implements Serializable {

    private Integer doctorID;
    private final ArrayList<appointment> list;
    private GregorianCalendar date;

    public schedule(Integer id) {
        this.list = new ArrayList<>();
        this.doctorID = id;
        fillSchedule();
    }

    public String addAppointment(appointment ap) {
        date = ap.getDate();
        int hour = date.get(Calendar.HOUR_OF_DAY);
        int minHour = 8;        //Eso representa a las 8am en formato 24h 
        int maxHour = 16;    //Eso representa a las 4pm en formato 24h 
        int inicioAlmuerzo = 12;    //inicio hora de almuerzo de los medicos  
        int finAlmuerzo = 13;       //final hora de almuerzo de los medicos

        if (hour >= minHour && hour < maxHour) {
            if (hour != inicioAlmuerzo && hour >= finAlmuerzo) {
                list.add(ap);
                list.sort((appointment o1, appointment o2) -> o1.getDate().compareTo(o2.getDate()));

                return "La cita fue registrada de manera exitosa";
            }
            return "La cita no puede ser agendada entre medio dia y 1pm por hora de almuerzo";
        } else {
            return "La hora propuesta para la cita es invalida, debe ser entre 8am y 4pm";
        }
    }

    public appointment getAppointment(String id) {
        for (int i = 0; i < list.size(); i++) {
            appointment appointmet = list.get(i);
            if (appointmet.getPacient().getId().equals(id)) {
                return appointmet;
            }
        }
        return null;
    }

    public appointment getAppointment(appointment ap) {
        for (int i = 0; i < list.size(); i++) {
            appointment appointmet = list.get(i);
            if (appointmet.equals(ap)) {
                return appointmet;
            }
        }
        return null;//cambiar por exception TALVEZ
    }

    public String getSchedule() {
        String msg = "";
        for (appointment object : list) {
            msg += object.toString();
        }
        return msg;
    }

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public ArrayList<appointment> getList() {
        return list;
    }

    private void fillSchedule() {

        for (int i = 8; i < 16; i++) {
            int j = 0;
            GregorianCalendar date = new GregorianCalendar(2024, 06, 07, i, j);
            appointment a = new appointment(null, date);

            addAppointment(a);

            if (j == 0) {
                j = 30;
            } else {
                j = 0;
            }
        }

    }
}
