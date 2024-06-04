/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectoprogra;

import java.util.GregorianCalendar;

/**
 *
 * @author emanu
 */
public interface AbstractBuilder {
    public void createUser();
    public void createId(String id);
    public void createEmail(String email);
    public void createPassword(String password);
    public void createBirthdayDate(GregorianCalendar birthdayDate);
    public void createName(String name);
    public void createLastName(String lastName);
    public void createPhoneNumber(String phoneNumber);
    public User getUser() throws UserException;
}
