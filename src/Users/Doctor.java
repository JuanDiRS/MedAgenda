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
public class Doctor extends User{
    String especialidad;
    ArrayList<Agenda> horarios = new ArrayList<Agenda>();

    public Doctor(String nombre, String identificacion, String telefono, String mail, String Especiaidad){

        super(nombre, identificacion, telefono, mail);
        this.especialidad = especialidad;

    }

    public void setHorario(Agenda agenda){
        horarios.add(agenda);
    }

    public ArrayList<Agenda> getHorario(){
        return horarios;
    }
}
