/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author crist
 */
public class Server {
    private final int PORT = 8000;
    private ServerSocket server;
    private Socket connection;

    public static void main(String[] args) {
        new Server().runServer();
    }
    public void runServer() {
        try {
            // Inicializar la comunicación en el puerto 8000
            server = new ServerSocket(PORT);
            
            int count = 0;
            boolean execute = true;
            
            while (execute) {                
                // Escuchar nuevas peticiones de conexión
                System.out.println("Esperando por una conexión...");
                connection = server.accept();
                
                // Delegar la conexión a otro Thread
                ConexionSecuencial thread = new ConexionSecuencial(connection, count);
                
                System.out.println("Se ha generado la conexión #" + count);
                
                thread.start();
                
                count++;
            }
            server.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
