/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citas;

import Usuario.User;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class appointment {

    private User pacient; 
    private GregorianCalendar date;
    private static int id = 0; 

    public appointment() {
    }
    
    
    public appointment(User pacient, GregorianCalendar date){
        this.pacient = pacient; 
        this.date = date; 
    }

    public appointment(GregorianCalendar date) {
        this.date = date;
        id++; 
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public static int getId() {
        return id;
    }
    

    @Override
    public String toString() {
        return pacient.getName() + ": "+ "date: " + format(date); 
    }
    
    private static String format(GregorianCalendar calendar){
        SimpleDateFormat sdf = new SimpleDateFormat("H:m dd MMM yyyy");
        sdf.setCalendar(calendar);
        String modDate = sdf.format(calendar.getTime());
        return modDate;
    }
    
}
