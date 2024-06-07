/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Usuario.User;
import View.ClientWindow;
import View.FormRegister;
import View.HomeWindow;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class ClientWindowController {
    ArrayList<User> userlist;

    public ClientWindowController(FormRegisterController controler) {
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
    public void homeWindow(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeWindow().setVisible(true);
            }
        });
    }
    public void registerWindow(FormRegisterController controler){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister(controler).setVisible(true);
            }
        });
    }
}
