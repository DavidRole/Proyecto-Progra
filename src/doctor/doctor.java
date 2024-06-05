/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

/**
 *
 * @author david
 */
public class doctor {
       private int id; 
    private String name;
    private speciality s; 

    public doctor() {}

    public doctor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public speciality getS() {
        return s;
    }

    public void setS(speciality s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Name: " + name +" id: " + id + ", specialty: " + s ;
    }
}
