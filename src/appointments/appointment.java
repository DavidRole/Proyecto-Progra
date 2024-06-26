/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appointments;

import Usuario.User;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class appointment implements Comparable<appointment>, Serializable{
    private static final long serialVersionUID = 987651234L; 
    private User pacient; 
    private GregorianCalendar date;
    private static int id = 0; 
    private boolean available;
    
    public appointment() {
        id++;
    }
    
    
    public appointment(User pacient, GregorianCalendar date){
        this.pacient = pacient; 
        this.date = date; 
        this.available = true;
        id++; 
    }

    public User getPacient() {
        return pacient;
    }

    public void setPacient(User pacient) {
        this.pacient = pacient;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
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
        return pacient.getFullName(); 
    }
    
    private static String format(GregorianCalendar calendar){
        SimpleDateFormat sdf = new SimpleDateFormat("H:m dd MMM yyyy");
        sdf.setCalendar(calendar);
        String modDate = sdf.format(calendar.getTime());
        return modDate;
    }

    @Override
    public int compareTo(appointment o) {
        return date.compareTo(o.getDate());
    }
    
    public Object[] toRow(){
        Object[] data = {pacient,format(date)};
        
        return data;
    }
     public Object[] appointMenttoRow(){
        Object[] data = {format(date)};
        
        return data;
    }
}
