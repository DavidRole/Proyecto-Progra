/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import java.util.GregorianCalendar;
import Usuario.AbstractBuilder;
import Usuario.UserException;

/**
 *
 * @author emanu
 */
public class User {
    private String id;
    private String email;
    private String password;
    private GregorianCalendar birthdayDate;
    private String name;
    private String lastName;
    private String phoneNumber;

    public User() {
    }
    public User getUser(AbstractBuilder builder, String id, String email, String password, GregorianCalendar birthdayDate, String name, String lastName, String phoneNumber) throws UserException{
        builder.createUser();
        builder.createId(id);
        builder.createEmail(email);
        builder.createPassword(password);
        builder.createBirthdayDate(birthdayDate);
        builder.createName(name);
        builder.createLastName(lastName);
        builder.createPhoneNumber(phoneNumber);
        return builder.getUser();
    }
    public User(String id, String email, String password, GregorianCalendar birthdayDate, String name, String lastName, String phoneNumber) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.birthdayDate = birthdayDate;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public GregorianCalendar getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(GregorianCalendar birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", email=" + email + ", password=" + password + ", birthdayDate=" + birthdayDate + ", name=" + name + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + '}';
    }
}
