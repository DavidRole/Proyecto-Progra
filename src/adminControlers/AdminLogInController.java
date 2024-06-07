/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import AdminView.AdminHomeWindow;
import Storage.Storage;


/**
 *
 * @author crist
 */
public class AdminLogInController {
    private Storage storage;
    private final String ID = "Healer";
    private final String PASSWORD = "0000";

    public AdminLogInController(Storage storage) {
        this.storage = storage;
    }

    public boolean logIn(String id, String password) {

        if (ID.equals(id) && password.equals(PASSWORD)) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomeWindow(storage).setVisible(true);
            }
        });
            return true;
        }

        return false;
    }
}
