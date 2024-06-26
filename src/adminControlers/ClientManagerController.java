/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminControlers;

import AdminView.ClientInfoWindow;
import Storage.Storage;
import Usuario.User;

/**
 *
 * @author darod
 */
public class ClientManagerController {
    public void clientInfo(User client, Storage storage){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientInfoWindow(client, storage).setVisible(true);
            }
        });
    }
}
