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

    public String register(String name, int id, speciality spec) {
        doctor d = new doctor(id, name, spec);
        boolean var = storage.addDoctor(d);
        System.out.println(var);
        if (var) {
            return "El doctor fue agregado exitosamente";
        } else {
            return "El doctor ya se encontraba en la base de datos";
        }
    }
}
