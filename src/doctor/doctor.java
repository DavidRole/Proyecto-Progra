/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import citas.schedule;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author david
 */
public class doctor {

    private int id;
    private String name;
    private speciality spec;

    public doctor() {
    }

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

    public speciality getSpec() {
        return spec;
    }

    public void setSpec(speciality spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Name: " + name + " id: " + id + ", specialty: " + spec;
    }
}
