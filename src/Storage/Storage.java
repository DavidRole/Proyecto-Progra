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

    private ArrayList<doctor> doctors;
    private ArrayList<User> clients;
    private ArrayList<schedule> schedules;
    private ArrayList<appointment> canceled;

    private final File doctorsFile = new File("doctors.dat");
    private final File clientsFile = new File("clients.dat");
    private final File scheduleFile = new File("schedule.dat");
    private final File canceledFile = new File("cancel.dat");

    private ObjectInputStream input = null;
    private ObjectOutputStream output = null;

    /**
     *
     * @author Usuario
     */
    public Storage() {
        doctors = new ArrayList<>();
        clients = new ArrayList<>();
        schedules = new ArrayList<>();
        canceled = new ArrayList<>();
    }

    public synchronized void doctorReader() {
        doctors = new ArrayList<>();

        try {
            //Codigo lectura
            FileInputStream fileInput = new FileInputStream(doctorsFile);
            input = new ObjectInputStream(fileInput);
            Object object = input.readObject();
            doctor doctor;

            while (object != null) {
                doctor = (doctor) object;
                System.out.println(doctor);
                doctors.add(doctor);
                object = input.readObject();
            }

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (EOFException ex) {
            System.err.println("Fin del archivo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());

            }

        }
    }

    public synchronized void doctorWriter() {
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
        } finally {
            try {
                output.close();
            } catch (IOException ex) {
                System.err.println("Fin del archivo");
            }
        }
    }

    public synchronized void clientReader() {
        this.clients = new ArrayList<>();
        try {
            //Codigo lectura
            FileInputStream fileInput = new FileInputStream(clientsFile);
            input = new ObjectInputStream(fileInput);
            Object object = input.readObject();
            User user;

            while (object != null) {
                user = (User) object;
                System.out.println(user);
                clients.add(user);
                object = input.readObject();
            }

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (EOFException ex) {
            System.err.println("Fin del archivo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());

            }

        }
    }

    public synchronized void clientWriter() {
        //Codigo escritura 
        try {
            FileOutputStream fileout = new FileOutputStream(clientsFile);
            output = new ObjectOutputStream(fileout);

            for (User d : clients) {
                output.writeObject(d);
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                output.close();
            } catch (IOException ex) {
                System.err.println("Fin del archivo");
            }
        }
    }

    public synchronized void scheduleReader() {
        this.schedules = new ArrayList<>();

        try {
            //Codigo lectura
            FileInputStream fileInput = new FileInputStream(scheduleFile);
            input = new ObjectInputStream(fileInput);
            Object object = input.readObject();
            schedule schedule;

            while (object != null) {
                schedule = (schedule) object;
//                System.out.println(schedule);
                schedules.add(schedule);
                object = input.readObject();
            }

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (EOFException ex) {
            System.err.println("Fin del archivo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());

            }

        }
    }

    public synchronized void scheduleWriter() {
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
        } finally {
            try {
                output.close();
            } catch (IOException ex) {
                System.err.println("Fin del archivo");
            }
        }
    }

    public synchronized void cancelReader() {
        this.canceled = new ArrayList<>();

        try {
            //Codigo lectura
            FileInputStream fileInput = new FileInputStream(canceledFile);
            input = new ObjectInputStream(fileInput);
            Object object = input.readObject();
            appointment appointment;

            while (object != null) {
                appointment = (appointment) object;
                System.out.println(appointment);
                canceled.add(appointment);
                object = input.readObject();
            }

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (EOFException ex) {
            System.err.println("Fin del archivo");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());

            }

        }
    }

    public synchronized void cancelWriter() {
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
        } finally {
            try {
                output.close();
            } catch (IOException ex) {
                System.err.println("Fin del archivo");
            }
        }
    }

    public synchronized ArrayList<appointment> getActiveAppointments(String id) {
        ArrayList<appointment> activeAppointments = new ArrayList<>();
        appointment temp = null;

        for (schedule schedule1 : schedules) {
            temp = schedule1.getAppointment(id);
            activeAppointments.add(temp);
        }

        return activeAppointments;
    }

    public synchronized appointment getAppointment(appointment ap) {
        appointment temp = null;

        for (schedule schedule1 : schedules) {
            schedule1.getAppointment(ap);
        }

        return temp;
    }

    public synchronized schedule getSchedulePerDoctor(int id) {
        for (schedule schedule1 : schedules) {
            if (schedule1.getDoctorID() == id) {
                return schedule1;
            }
        }
        return null;// cambiar por exception TALVEZ
    }
    public synchronized boolean pendientAppointment(int id) {
        for (schedule schedule1 : schedules) {
            if (schedule1.getDoctorID() == id) {
                if (schedule1.pendientAppointment()) {
                    return true;
                }
            }
        }
        return false;
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

    public synchronized boolean addDoctor(doctor d) {
        doctorReader();
        if (findDoctor(d.getId()) == null) {
            doctors.add(d);
            doctorWriter();
            doctorReader();
            return true;
        } else {
            return false;
        }

    }

    public synchronized boolean addClient(User client) {
        clientReader();
        if (findClient(client.getId()) == null) {
            clients.add(client);
            clientWriter();
            clientReader();
        } else {
            return false;
        }
        return true;
    }

    public synchronized boolean addSchedule(schedule sq) {
        scheduleReader();
        if (findSchedule(sq) == null) {
            schedules.add(sq);
            scheduleWriter();
            scheduleReader();
        } else {
            return false;
        }
        return true;
    }

    public synchronized boolean addCanceledApp(appointment appointment) {
        cancelReader();
        if (findCanceledApp(appointment) == null) {
            canceled.add(appointment);
            cancelWriter();
            cancelReader();
        } else {
            return false;
        }
        return true;
    }

    public synchronized boolean removeDoctor(doctor d, int i) {
        doctorReader();
        
        if (!pendientAppointment(d.getId())) {
            doctors.remove(i);
            doctorWriter();
            doctorReader();
            return true;
        } else {
            return false;
        }
    }

    public synchronized boolean removeClient(User client) {
        clientReader();

        clients.remove(client);
        clientWriter();
        clientReader();
        return true;

    }

    public synchronized boolean removeSchedule(schedule sq) {
        scheduleReader();

        schedules.remove(sq);
        scheduleWriter();
        scheduleReader();
        return true;
    }

    private doctor findDoctor(int doc) {
        for (doctor doctor : doctors) {
            if (doctor.getId() == doc) {
                System.out.println(doctor + "\n" + doc);
                return doctor;
            }
        }
        return null;
    }

    private User findClient(String client) {
        for (User client1 : clients) {
            if (client1.getId().equals(client)) {
                return client1;
            }
        }
        return null;
    }

    private schedule findSchedule(schedule sq) {
        for (schedule schedule1 : schedules) {
            if (schedule1.equals(sq)) {
                return schedule1;
            }
        }
        return null;
    }

    private appointment findCanceledApp(appointment app) {
        for (appointment appointment1 : canceled) {
            if (appointment1.equals(app)) {
                return appointment1;
            }
        }
        return null;
    }

}
