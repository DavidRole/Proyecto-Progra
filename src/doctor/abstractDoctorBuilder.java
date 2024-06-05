/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doctor;

/**
 *
 * @author david
 */
public interface abstractDoctorBuilder {
    public void createDoctor();
    public void createName(String name);
    public void createId(int id); 
    public void createSpeciality(speciality s);
    public doctor getDoctor() throws Exception;
}
