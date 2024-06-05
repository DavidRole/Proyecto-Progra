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
public class doctorBuilder implements abstractDoctorBuilder {

    private String name;
    private int id;
    private speciality s;
    private doctor doctor = new doctor();

    public doctorBuilder() {
    }

    @Override
    public void createDoctor() {
        doctor = new doctor();
    }

    @Override
public void createName(String name) {
    if (name != null && !name.isEmpty() && name.length() < 50) {
        doctor.setName(name);
    }else{
        doctorExc e = new doctorExc("Se genero un error al crear el nombre");
        System.err.println(e.getMessage());
    }
}


    @Override
    public void createId(int id) {
        if (id != 0) {
            if (id < 999999) {
                doctor.setId(id);
            }
        }
    }

    @Override
    public void createSpeciality(speciality s) {
        doctor.setS(s);
    }

    @Override
    public doctor getDoctor() throws Exception {
        String msg = "";
        if (doctor.getName() == null) {
            msg += "El nombre no puede estar vacio y debe tener maximo una extension de 50 caracteres\n";
        }
        if (doctor.getId() == 0) {
            msg += "El id no puede estar vacio ni ser igual a 0\n";
        }
        if (doctor.getS() == null) {
            msg += "La especialidad no puede estar vacia";
        }
        if (!msg.equals("")) {
            throw new doctorExc(msg);
        }
        return doctor;
    }
}
