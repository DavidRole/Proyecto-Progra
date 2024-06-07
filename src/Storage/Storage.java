/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Storage;


import Usuario.User;
import citas.appointment;
import citas.schedule;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author emanu
 */
public class Storage {
    ArrayList<doctor> doctors = new ArrayList<>();
    ArrayList<User> clients = new ArrayList<>(); 
    ArrayList<schedule> schedules = new ArrayList<>();
    ArrayList<appointment> cancels = new ArrayList<>();
    
    File doctorsFile = new File("doctors.dat"); 
    File clientsFile = new File("clients.dat"); 
    File scheduleFile = new File("schedule.dat"); 
    File cancelFile = new File("cancel.dat"); 
    
    ObjectInputStream input = null; 
    ObjectOutputStream output = null;
/**
 *
 * @author Usuario
 */
    public void doctorReader() {
         
        
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
    public void doctorWriter(){
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
    public void clientReader() {
        
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
    public void clientWriter(){
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
    public void scheduleReader() {
         
        
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
    public void scheduleWriter(){
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
    public void cancelReader() {
         
        
        try {
            //Codigo lectura
            FileInputStream fileInput = new FileInputStream(cancelFile);
            input = new ObjectInputStream(fileInput);
            Object object = input.readObject();
            appointment appointment; 
           
            while(object != null){
                appointment = (appointment) object; 
                System.out.println(appointment);
                cancels.add(appointment); 
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
    public void cancelWriter(){
        //Codigo escritura 
        try { 
            FileOutputStream fileout = new FileOutputStream(cancelFile);
            output = new ObjectOutputStream(fileout); 
            
            for (appointment c : cancels) {
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
}


