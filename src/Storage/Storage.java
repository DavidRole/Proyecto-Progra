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
import java.util.GregorianCalendar;

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

    public Storage() {
        doctors = new ArrayList<>();
        clients = new ArrayList<>();
        schedules = new ArrayList<>();
        canceled = new ArrayList<>();
    }

    /**
     * Lee el documento que contiene la lista de doctores
     */
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

    /**
     * Escribe el listado de los doctores activos
     */
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

    /**
     * lee la lista de los clientes en el documento respectivo
     */
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

    /**
     * Escribe la lista de clientes activos en su documento
     */
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

    /**
     * Leelos horarios del documento respectivo
     */
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

    /**
     * Escribe los horarios en su respectivo documento
     */
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

    /**
     * lee el documento de las citas canceladas
     */
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

    /**
     * Escribe el el documento las citas canceladas
     */
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

    /**
     *
     * @param id cedula del cliente a buscar citas activas
     * @return listado de las citas activas del cliente
     */
    public synchronized ArrayList<appointment> getActiveAppointments(String id) {
        ArrayList<appointment> activeAppointments = new ArrayList<>();
        appointment temp = null;

        for (schedule schedule1 : schedules) {
            temp = schedule1.getAppointment(id);
            activeAppointments.add(temp);
        }

        return activeAppointments;
    }

    /**
     *
     * @param id cedula del cliente
     * @return Array con los doctores
     */
    public synchronized ArrayList<doctor> getDoctorAsocietedToClient(String id) {
        ArrayList<doctor> doctorsR = new ArrayList<>();
        ArrayList<appointment> appointments = getActiveAppointments(id);

        for (int i = 0; i < schedules.size(); i++) {
            schedule temp = schedules.get(i);
            if (temp.getAppointment(appointments.get(i)) != null) {
                doctorsR.add(findDoctor(temp.getDoctorID()));
            }
        }
        
        return doctorsR;
    }

    /**
     *
     * @param ap cita a buscar
     * @return null si la cita no se encuentra o la cita en caso de que se
     * encuentre
     */
    public synchronized appointment getAppointment(appointment ap) {
        appointment temp = null;

        for (schedule schedule1 : schedules) {
            schedule1.getAppointment(ap);
        }

        return temp;
    }

    /**
     *
     * @param id ID de empleado del doctor que desea saber el horario
     * @return el horario asignado al id del doctor solicitado
     */
    public synchronized schedule getSchedulePerDoctor(int id) {
        for (schedule schedule1 : schedules) {
            if (schedule1.getDoctorID() == id) {
                return schedule1;
            }
        }
        return null;// cambiar por exception TALVEZ
    }

    /**
     *
     * @param id id del doctor a confirmar si tiene citas pendientes
     * @return true si tiene citas pendientes o false si ya tiene el horario
     * libre
     */
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

    /**
     * \
     *
     * @return lista de Doctores activos
     */
    public synchronized ArrayList<doctor> getDoctors() {
        return doctors;
    }

    /**
     *
     * @return lista de clientes activos
     */
    public synchronized ArrayList<User> getClients() {
        return clients;
    }

    /**
     *
     * @return lista de horarios
     */
    public synchronized ArrayList<schedule> getSchedules() {
        return schedules;
    }

    /**
     *
     * @return lista de citas canceladas asignadas a clientes
     */
    public synchronized ArrayList<appointment> getCanceled() {
        return canceled;
    }

    /**
     * No sé por que está este metodo acá
     *
     * @return
     */
    public synchronized ObjectInputStream getInput() {
        return input;
    }

    /**
     *
     * @param d Doctor a añadir
     * @return true si se añade el Doctor o false si ya existe
     */
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

    /**
     *
     * @param client cliente a añadir
     * @return True si se puedo añadir o false si ya existe el cliente
     */
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

    /**
     *
     * @param sq horario a añadir
     * @return True si se puedo añadir o false si ya existe el horario
     */
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

    /**
     *
     * @param appointment cita cancelada a agregar a el documento y lista de
     * citas canceladas
     * @return true si se agrega correctamente o false en el caso contrario
     */
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

    /**
     * El metodo valida que el doctor no tenga citas pendientes y posteriormente
     * lo elimina del archivo y la lista
     *
     * @param d doctor a eliminar
     * @param i posición del doctor en la lista (se obtiene de la tabla que los
     * muestra)
     * @return True si se elimina correctamente o false en caso contrario
     */
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

    /**
     *
     * @param client cliente a eliminar de la lista y archivo
     * @return true si se elimina correctamente o false en caso contrario
     */
    public synchronized boolean removeClient(User client) {
        clientReader();

        clients.remove(client);
        clientWriter();
        clientReader();
        return true;

    }

    /**
     *
     * @param sq horario a eliminar de la lista
     * @return true si se elimina correctamente o false en caso contrario
     */
    public synchronized boolean removeSchedule(schedule sq) {
        scheduleReader();

        schedules.remove(sq);
        scheduleWriter();
        scheduleReader();
        return true;
    }

    /**
     *
     * @param doc doctor a buscar
     * @return el doctor si se encuentra en la lista o null en caso contrario
     */
    public synchronized doctor findDoctor(int doc) {
        for (doctor doctor : doctors) {
            if (doctor.getId() == doc) {
                System.out.println(doctor + "\n" + doc);
                return doctor;
            }
        }
        return null;
    }

    /**
     *
     * @param client cliente a buscar
     * @return el cliente si se encuentra en la lista o null en caso contrario
     */
    public synchronized User findClient(String client) {
        for (User client1 : clients) {
            if (client1.getId().equals(client)) {
                return client1;
            }
        }
        return null;
    }

    /**
     *
     * @param sq horario a buscar
     * @return el horario si se encuentra en la lista o null en caso contrario
     */
    public synchronized schedule findSchedule(schedule sq) {
        for (schedule schedule1 : schedules) {
            if (schedule1.equals(sq)) {
                return schedule1;
            }
        }
        return null;
    }

    /**
     *
     * @param app cita a buscar
     * @return la cita cancelada si se encuentra en la lista o null en caso
     * contrario
     */
    public synchronized appointment findCanceledApp(appointment app) {
        for (appointment appointment1 : canceled) {
            if (appointment1.equals(app)) {
                return appointment1;
            }
        }
        return null;
    }

    /**
     *
     * @param schedule horario a actualizar
     * @return true
     */
    public synchronized boolean updateSchedule(schedule schedule) {
        scheduleReader();
        schedule temp = findSchedule(schedule);
        temp = schedule;
        scheduleWriter();
        scheduleReader();

        return true;
    }

    /**
     * Busca los horarios pasados del cliente
     *
     * @return el horario cuya fecha ya pasó
     */
    public synchronized ArrayList getPassedSchedule() {

        GregorianCalendar today = new GregorianCalendar();
        ArrayList<schedule> passedSchedule = new ArrayList();

        for (schedule schedule1 : schedules) {
            if (schedule1.getDate().before(today)) {
                passedSchedule.add(schedule1);
            }
        }
        return passedSchedule;
    }

}
