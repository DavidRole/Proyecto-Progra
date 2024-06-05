/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

import doctor.abstractDoctorBuilder;

/**
 *
 * @author david
 */
public class director {
    
    public doctor createDoctor(abstractDoctorBuilder builder, String name, int id, speciality s) throws Exception{
        builder.createName(name);
        builder.createId(id);
        builder.createSpeciality(s);
        return builder.getDoctor();
    }
}
