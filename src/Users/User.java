/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;
import java.util.ArrayList;
import Horarios.*;
/**
 *
 * @author juand
 */
public class User {
    public String nombre;
    public String identificacion;
    public String telefono;
    public String mail;
    ArrayList<Citas> Disponible = new ArrayList<Citas>();
    
    public User(String nombre, String identificacion, String telefono, String mail){
      this.nombre = nombre;
      this.identificacion = identificacion;
      this.mail = mail;
      this.telefono = telefono;
    }
    
    public void setHorarioP(Citas cita){
        Disponible.add(cita);
    }

    public ArrayList<Citas> getHorarioP(){
        return Disponible;
    }
}