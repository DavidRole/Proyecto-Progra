/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorchozz
 */
public class ConexionSecuencial extends Thread {
    private Socket connection;
    private int id;
    private DataInputStream input;
    private DataOutputStream output;

    public ConexionSecuencial(Socket connection, int id) {
        super("Conexión #" + id);
        this.connection = connection;
        this.id = id;
    }

    public void run() {
        try {
            // Inicializar los flujos
            output = new DataOutputStream(connection.getOutputStream());
            input = new DataInputStream(connection.getInputStream());
            
            // Recibir datos del cliente
            String mensaje = input.readUTF();
            
            // Responder el mensaje
            mensaje = "Se ha asignado el número " + id;
            output.writeUTF(mensaje);
            
            // Cerrar las conexiones
            output.close();
            input.close();
            connection.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    
}
