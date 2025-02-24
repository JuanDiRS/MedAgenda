/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Horarios.Citas;
import Users.User;
import Users.Doctor;
import Users.PreLoadUsers;
import static Vista.PatientMenu.preloadP;
import static Vista.Menus.scanner;
import Horarios.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class PatientMenu {
    int Myoption;
    int MyoptionE;
    ArrayList<User> users;
    ArrayList<Doctor> doctors;
    static PreLoadUsers preloadP;
    Scanner optionElegirDoc;
    Citas cita;
    Agenda agenda; 
    
    public PatientMenu(){
        optionElegirDoc = new Scanner(System.in);
        users = new ArrayList<User>();
        preloadP = new PreLoadUsers();
        preloadP.PreLoadPatient();
        users = preloadP.getPatients();
        cita = new Citas();
        preloadP.PreLoadPatient();
    }
    public boolean MenuPaciente(){
        Myoption = 0; 
        while(Myoption<3){
            System.out.println("*** SECCIÓN Paciente ****"); 
            System.out.println("Digite la opción deseada:");
            System.out.println("1. Agendar Cita");
            System.out.println("2. Consultar Cita");
            System.out.println("3. Volver al Menú Anterior");
            System.out.println("4. Salir");

            Myoption = scanner.nextInt();

            switch(Myoption){
                case 1:
                   int indexDocument = MenuRegistrarCitas();
                   users.get(indexDocument).setHorarioP(cita);
                   break;

                case 2:
                   MenuConsultarAgenda();
                   break;

                case 3:
                   return true;


                case 4:
                    System.out.println("Hasta Pronto");
                break;

                default:
                    Menus.displayError("Opción no válida");

            }


        }

      return false;  
    }

    public int MenuRegistrarCitas(){
    System.out.println("*** REGISTRO DE CITA MÉDICA ****");
    
    String documento;
    boolean esvalido = false;
    int index = -1;

    while (!esvalido) {
        System.out.println("*** Digite su Documento: ****");            
        documento = scanner.nextLine().trim();
                
        for (int i = 0; i < users.size(); i++){
            if (users.get(i).identificacion.equals(documento)) {
                esvalido = true;
                index = i;
                break;
            }
        }
        if (!esvalido) {
            System.out.println("Documento no encontrado. Intente de nuevo:");
        }
    }
       
    System.out.println("Bienvenido paciente: " + users.get(index).nombre + " ¿Desea agendar por especialidad o por especialista?"); // Si se rompe el blucle con el paciente encontrado se dara su nombre
    while(MyoptionE<3){
        System.out.println("1. Agendar Por especialista");
        System.out.println("2. Agendar Por especialidad");
        System.out.println("3. Volver al Menú Anterior");
        System.out.println("4. Salir");

        MyoptionE = scanner.nextInt();

        switch(MyoptionE){
            case 1:
                int Indexdoc = MenuEspecialista();
                doctors.get(Indexdoc).setHorario(agenda);
            case 2:
                int Indexesp = Menuespecialidad();
                doctors.get(Indexesp).setHorario(agenda);
                break;
            case 3:
                default:
                Menus.displayError("Opción no válida");
            }
        }
        return 5;
    }
    public int MenuEspecialista(){
        return 2;
    }
    public int Menuespecialidad(){
        return 2;
    }
    public int MenuConsultarAgenda(){
        return 3;
    }
}