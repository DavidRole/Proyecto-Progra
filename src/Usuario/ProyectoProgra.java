/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprogra;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emanu
 */
public class ProyectoProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User usuario = new User();
        AbstractBuilder builder = new UserBuilder();
        GregorianCalendar calendario = new GregorianCalendar(2005,6,20);
        
        
        try {
            usuario.getUser(builder, "0249787789", "emanuel@gmail.com", "@7Ab9&H74u", calendario, "David", "Cardenas", "8779-5689");
        } catch (UserException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
