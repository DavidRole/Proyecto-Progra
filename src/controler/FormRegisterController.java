/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Storage.Storage;
import Usuario.AbstractBuilder;
import Usuario.User;
import Usuario.UserBuilder;
import Usuario.UserException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author crist
 */
public class FormRegisterController {

    private ArrayList<User> userList;
    private AbstractBuilder builder;

    public FormRegisterController(ArrayList<User> userList) {
        this.userList = userList;
        builder = new UserBuilder();
    }
    
    public String Register(String id, String email, String password, GregorianCalendar birthdayDate, String name, String lastName, String phoneNumber,Storage storage) {
        User temp;
        try {
            temp = new User().getUser(builder, id, email, password, birthdayDate, name, lastName, phoneNumber);
        } catch (UserException ex) {
            return ex.getMessage();
        }
        for (User user : userList) {
            if (user.getId().equals(temp.getId())) {
                return "Ya se encuentra un usuario con la misma cedula";
            }
        }
        if (temp != null) {
            storage.addClient(temp);
            return "Usuario registrado correctamente";
        }
        return "";
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    

}
