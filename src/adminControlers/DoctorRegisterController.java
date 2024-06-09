/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import Storage.Storage;
import doctor.doctor;
import doctor.speciality;

/**
 *
 * @author darod
 */
public class DoctorRegisterController {

    private final Storage storage;

    public DoctorRegisterController(Storage storage) {
        this.storage = storage;
    }

    public boolean register(String name, int id, speciality spec) {
        doctor d = new doctor(id, name, spec);
        return storage.addDoctor(d);
        
    }
}
