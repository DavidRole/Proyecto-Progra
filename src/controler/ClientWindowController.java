/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import Storage.Storage;
import Usuario.User;
import ClientView.ClientWindow;
import ClientView.FormRegister;
import ClientView.HomeWindow;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class ClientWindowController {
    ArrayList<User> userlist;

    public ClientWindowController(ArrayList<User> userList) {
        this.userlist = userList;
    }
    
    public boolean logIn(String id, String password){
        for (User user : userlist) {
            if (user.getId().equals(id) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    public void homeWindow(Storage storage, User user){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeWindow(storage, user).setVisible(true);
            }
        });
    }
    public void registerWindow(Storage storage){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegister(storage).setVisible(true);
            }
        });
    }
}
