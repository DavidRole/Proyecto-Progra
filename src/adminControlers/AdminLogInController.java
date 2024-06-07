/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import AdminView.AdminHomeWindow;
import AdminView.AdminLogInWindow;
import doctor.doctor;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class AdminLogInController {

    private final String ID = "10";
    private final String PASSWORD = "1234";

    public boolean logIn(String id, String password) {

        if (ID.equals(id) && password.equals(PASSWORD)) {
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomeWindow().setVisible(true);
            }
        });
            return true;
        }

        return false;
    }
}
