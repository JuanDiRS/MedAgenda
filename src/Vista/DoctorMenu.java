/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
    
import Users.Doctor;
import Users.PreLoadUsers;
import static Vista.Menus.scanner;
import java.util.ArrayList;
import java.util.Scanner;
import Horarios.*;  
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author juand
 */
public class DoctorMenu {
    int Myoption;
    ArrayList<Doctor> doctors;
    static PreLoadUsers preloadU;
    Scanner optionRegistrar;
    Agenda agenda; 

    public DoctorMenu(){

        optionRegistrar = new Scanner(System.in);
        doctors = new ArrayList<Doctor>();
        preloadU = new PreLoadUsers();
        preloadU.PreloadDoctors();
        doctors = preloadU.getDoctors();
        agenda = new Agenda();
        preloadU.PreloadDoctors();
    }
    public boolean MenuMedico(){
        Myoption = 0; 
        while(Myoption<3){
            System.out.println("*** SECCIÓN MÉDICO ****"); 
            System.out.println("Digite la opción deseada:");
            System.out.println("1. Registrar Agenda");
            System.out.println("2. Consultar agenda");
            System.out.println("3. Volver al Menú Anterior");
            System.out.println("4. Salir");

            Myoption = scanner.nextInt();

            switch(Myoption){
                case 1:
                   int indexDocument = MenuRegistrarAgenda();
                   doctors.get(indexDocument).setHorario(agenda);
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

    public  int MenuRegistrarAgenda(){

       System.out.println("*** REGISTRO DE AGENDA MÉDICA ****");
       System.out.println("*** Elija la opción correspondiente a su documento: ****"); 

       for (int i=0; i<doctors.size();i++){
          System.out.println(i+1 + "." + doctors.get(i).identificacion);
       }

       int indexDocument = optionRegistrar.nextInt()-1; 

       System.out.println("****************** ");
       System.out.println("Bienvenido doctor:"+ doctors.get(indexDocument).nombre);
       boolean fechaValida = false;
        while (!fechaValida) {
            try {
                System.out.println("Digite Fecha (formato dd/MM/yyyy):");
                String fecha = optionRegistrar.next();
                DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechat = LocalDate.parse(fecha, formatoFecha);
                agenda.setFecha(fechat.format(formatoFecha));
                fechaValida = true;
            }
            catch (DateTimeParseException e) {
                System.out.println("Por favor, ingrese una fecha válida en el formato dd/MM/yyyy.");
            }
        }
       boolean horaValida = false;
        while (!horaValida) {
            try {
                System.out.println("Digite Hora (En formato HH:mm):");
                String hora = optionRegistrar.next();
                DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime horat = LocalTime.parse(hora, formatoHora);
                agenda.setHora(hora);
                horaValida = true;
            }
            catch (DateTimeParseException e) {
                System.out.println("Por favor, ingrese una fecha válida en el formato dd/MM/yyyy.");
            }
        }
       return indexDocument;
    }
     void MenuConsultarAgenda(){

       System.out.println("*** CONSULTA DE AGENDA MÉDICA ****");
       System.out.println("*** Elija la opción correspondiente a su documento: ****"); 

       for (int i=0; i<doctors.size();i++){
          System.out.println(i+1 + "." + doctors.get(i).identificacion);
       }

       int indexDocument = optionRegistrar.nextInt()-1;

       ArrayList<Agenda> agenda = new ArrayList<Agenda>();
       agenda = doctors.get(indexDocument).getHorario();

       System.out.println("Doctor:"+ doctors.get(indexDocument).nombre);
       System.out.println("Su agenda registrada es la siguiente:");

       for(Agenda a:agenda){
         System.out.println("Fecha: " + a.getFecha());  
         System.out.println("Hora: " + a.getHora()); 
         System.out.println("*********************");  
       }
    }
}       