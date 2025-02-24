/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;
import java.util.ArrayList;
/**
 *
 * @author juand
 */
public class PreLoadUsers {
    ArrayList<Doctor> doctors;
    ArrayList<User> Patients;
    
    public PreLoadUsers() {
        this.doctors = new ArrayList<>();
        this.Patients = new ArrayList<>();
    }
    public void  PreloadDoctors(){
      doctors = new ArrayList<Doctor>();
     
      doctors.add(new Doctor("Chapatin", "11111", "55555", "chapatin@mail.com","internista"));
      doctors.add(new Doctor("House", "22222", "6666", "house@mail.com","Diagnostico Médico"));
      doctors.add(new Doctor("Derek", "3333", "7777", "Derek@mail.com","cirujano"));
    }

    public void PreLoadPatient(){
        Patients.add(new User("Esteban","172878249","82837492", "Soyestebitan@mail.com"));
        Patients.add(new User("Santiago","43758372","82342345", "Nosoysantaigo@mail.com"));
        Patients.add(new User("Manolo","3287384343","89278751", "Manolofernandez@mail.com"));
    }
    public ArrayList<Doctor> getDoctors(){
        return doctors;
    }
    public ArrayList<User> getPatients(){
    return Patients;
    }
}
