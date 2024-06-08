/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Storage;


import Usuario.User;
import appointments.appointment;
import appointments.schedule;
import doctor.doctor;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author emanu
 */
public class Storage {
    ArrayList<doctor> doctors;
    ArrayList<User> clients; 
    ArrayList<schedule> schedules;
    ArrayList<appointment> canceled;
    
    File doctorsFile = new File("doctors.dat"); 
    File clientsFile = new File("clients.dat"); 
    File scheduleFile = new File("schedule.dat"); 
    File canceledFile = new File("cancel.dat"); 
    
    ObjectInputStream input = null; 
    ObjectOutputStream output = null;
/**
 *
 * @author Usuario
 */
    
    
    public Storage(){
        this.canceled = new ArrayList<>();
        this.schedules = new ArrayList<>();
        this.clients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        
    }

    
    
    public synchronized void doctorReader() {
         
        
        try {
            //Codigo lectura
            FileInputStream fileInput = new FileInputStream(doctorsFile);
            input = new ObjectInputStream(fileInput);
            Object object = input.readObject();
            doctor doctor; 
           
            while(object != null){
                doctor = (doctor) object; 
                System.out.println(doctor);
                doctors.add(doctor); 
                object = input.readObject();
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }catch(EOFException ex){
            System.err.println("Fin del archivo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                if(input != null){
                     input.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            
            }
            
        }
    }
    
    public synchronized void doctorWriter(){
        //Codigo escritura

        try { 
            FileOutputStream fileout = new FileOutputStream(doctorsFile);
            output = new ObjectOutputStream(fileout); 
            
            for (doctor d : doctors) {
                output.writeObject(d);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                output.close();
            } catch (IOException ex) {
                System.err.println("Fin del archivo");
            }
        }
    }
    
    public synchronized void clientReader() {
        
        try {
            //Codigo lectura
            FileInputStream fileInput = new FileInputStream(clientsFile);
            input = new ObjectInputStream(fileInput);
            Object object = input.readObject();
            User user; 
           
            while(object != null){
                user = (User) object; 
                System.out.println(user);
                clients.add(user); 
                object = input.readObject();
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }catch(EOFException ex){
            System.err.println("Fin del archivo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                if(input != null){
                     input.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            
            }
            
        }
    }
    
    public synchronized void clientWriter(){
        //Codigo escritura 
        try { 
            FileOutputStream fileout = new FileOutputStream(clientsFile);
            output = new ObjectOutputStream(fileout); 
            
            for (doctor d : doctors) {
                output.writeObject(d);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                output.close();
            } catch (IOException ex) {
                System.err.println("Fin del archivo");
            }
        }
    }
    
    public synchronized void scheduleReader() {
         
        
        try {
            //Codigo lectura
            FileInputStream fileInput = new FileInputStream(scheduleFile);
            input = new ObjectInputStream(fileInput);
            Object object = input.readObject();
            schedule schedule; 
           
            while(object != null){
                schedule = (schedule) object; 
                System.out.println(schedule);
                schedules.add(schedule); 
                object = input.readObject();
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }catch(EOFException ex){
            System.err.println("Fin del archivo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                if(input != null){
                     input.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            
            }
            
        }
    }
    
    public synchronized void scheduleWriter(){
        //Codigo escritura 
        try { 
            FileOutputStream fileout = new FileOutputStream(scheduleFile);
            output = new ObjectOutputStream(fileout); 
            
            for (schedule s : schedules) {
                output.writeObject(s);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                output.close();
            } catch (IOException ex) {
                System.err.println("Fin del archivo");
            }
        }
    }
    
    public synchronized void cancelReader() {
         
        
        try {
            //Codigo lectura
            FileInputStream fileInput = new FileInputStream(canceledFile);
            input = new ObjectInputStream(fileInput);
            Object object = input.readObject();
            appointment appointment; 
           
            while(object != null){
                appointment = (appointment) object; 
                System.out.println(appointment);
                canceled.add(appointment); 
                object = input.readObject();
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }catch(EOFException ex){
            System.err.println("Fin del archivo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                if(input != null){
                     input.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            
            }
            
        }
    }
    
    public synchronized void cancelWriter(){
        //Codigo escritura 
        try { 
            FileOutputStream fileout = new FileOutputStream(canceledFile);
            output = new ObjectOutputStream(fileout); 
            
            for (appointment c : canceled) {
                output.writeObject(c);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }finally{
            try {
                output.close();
            } catch (IOException ex) {
                System.err.println("Fin del archivo");
            }
        }
    }
    
    public synchronized ArrayList<appointment> getActiveAppointments(String id){
        ArrayList<appointment> activeAppointments = new ArrayList<>();
        appointment temp = null;
        
        for (schedule schedule1 : schedules) {
            temp = schedule1.getAppointment(id);
            activeAppointments.add(temp);
        }
        
        return activeAppointments;
    }
    
    public synchronized appointment getAppointment(appointment ap){
        appointment temp = null;
        
        for (schedule schedule1 : schedules) {
            schedule1.getAppointment(ap);
        }
        
        return temp;
    }
    
    public synchronized schedule getSchedulePerDoctor(int id){
        for (schedule schedule1 : schedules) {
            if(schedule1.getDoctor().getId() == id){
                return schedule1;
            }
        }
        return null;// cambiar por exception TALVEZ
    }

    public synchronized ArrayList<doctor> getDoctors() {
        return doctors;
    }

    public synchronized ArrayList<User> getClients() {
        return clients;
    }

    public synchronized ArrayList<schedule> getSchedules() {
        return schedules;
    }

    public synchronized ArrayList<appointment> getCanceled() {
        return canceled;
    }

    public synchronized ObjectInputStream getInput() {
        return input;
    }
    
    
}


