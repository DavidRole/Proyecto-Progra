/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Usuario.User;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class ClientWindowControler {
    ArrayList<User> userlist;

    public ClientWindowControler(FormRegisterControler controler) {
        userlist = controler.getUserList();
    }
    
    public boolean logIn(String id, String password){
        for (User user : userlist) {
            if (user.getId().equals(id) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    
}
