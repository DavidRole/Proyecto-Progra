/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import Usuario.User;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author emanu
 */
public class UserBuilder implements AbstractBuilder{

    private User usuario;
    
    @Override
    public void createUser() {
        usuario = new User();
    }

    @Override
    public void createId(String id) {
        if(id != null){
            if(id.length() == 10 && id.matches("0\\d{9}")){
                usuario.setId(id);
            }
        }
    }
    @Override
    public void createEmail(String email) {
        if(email != null){
            if(email.matches("^[a-zA-Z][a-zA-Z0-9._]*@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")){
                usuario.setEmail(email);
            }
        }
    }
    @Override
    public void createPassword(String password) {
        String index = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?!.*(012|123|234|345|456|567|678|789|890|901))(?=.*[!@#$%&/()=+?\\[\\]~\\-^])[A-Za-z0-9!@#$%&/()=+?\\[\\]~\\-^]{10,16}$";
        if(password.matches(index)){
            usuario.setPassword(password);
        }
    }
    @Override
    public void createBirthdayDate(GregorianCalendar birthdayDate) {
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar maxDate = new GregorianCalendar();
        GregorianCalendar minDate = new GregorianCalendar(); 
        
        minDate.add(Calendar.YEAR, -18);
        
        maxDate.add(Calendar.YEAR, -100);      
        if(birthdayDate.before(minDate) && birthdayDate.after(maxDate)){
            usuario.setBirthdayDate(birthdayDate);
        }
    }

    @Override
    public void createName(String name) {
        if(name != null && name.matches("[a-zA-Z ]{1,30}")){
            usuario.setName(name);
        }
    }

    @Override
    public void createLastName(String lastName) {
        if(lastName != null && lastName.matches("[a-zA-Z ]{1,30}")){
            usuario.setLastName(lastName);
        }
    }

    @Override
    public void createPhoneNumber(String phoneNumber) {
       if(phoneNumber != null && phoneNumber.matches("^\\d{4}-\\d{4}$")){
           usuario.setPhoneNumber(phoneNumber);
       }
    }

    @Override
    public User getUser() throws UserException {
       String text = "";
        
        if(usuario.getId() == null){
            text += "El id deberá tener el formato de cédula costarricense. En el campo de entrada deberá mostrar una hilera "
            + "de ayuda para indicar el formato, el cual consiste en 10 dígitos iniciando con 0.\n";
        }
        if(usuario.getEmail() == null){
            text += "El correo deberá comenzar con una letra y podrá tener o no más letras, números, guiones bajo o puntos, "
                    + "luego debe estar el @ seguido de una o más letras, números, puntos o guiones cortos, seguidas de un punto y por último entre 2 y 4 letras.\n";
        }
        if(usuario.getPassword() == null){
            text += "La contraseña debe tener al menos una letra mayúscula (A – Z), tener al menos una letra minúscula (a – z), incluir números (0 - 9), "
                    + "los cuales no se pueden repetir de manera secuencial, tener 1 o más de los siguientes "
                    + "caracteres especiales: ! @ # $ % & / ( ) = + ? [ ] ~ – ^, no se permite el ingreso de otros caracteres, "
                    + "el campo de entrada debe ser enmascarado para que no se muestren los caracteres ingresados. \n";
        }
        if(usuario.getBirthdayDate() == null){
            text += "La fecha de nacimiento deberá ser a una fecha válida y corresponder a una persona mayor de edad. "
                    + "En el campo de entrada deberá mostrar una hilera de ayuda para indicar el formato, a menos que la fecha sea seleccionable.\n";
        }
        if(usuario.getName() == null){
            text += "El nombre no debe contener números ni caracteres especiales y su largo no debe exceder los 30 caracteres.\n";
        }
        if(usuario.getLastName() == null){
            text += "El apellido no debe contener números ni caracteres especiales y su largo no debe exceder los 30 caracteres.\n";
        }
        if(usuario.getPhoneNumber() == null){
            text += "El numero telefonico deberá tener el formato de un teléfono costarricense. "
                    + "En elcampo de entrada deberá mostrar una hilera de ayuda para indicar el formato\n";
        }
        if(!text.equals(null)){
            throw new UserException(text);
        }
        return usuario;
    }
}
