/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.proyect;
import Vista.DoctorMenu;
import Vista.*;
/**
 *
 * @author juand
 */
public class FinalProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menus menus = new Menus();
        DoctorMenu doctorMenu = new DoctorMenu();
        PatientMenu patientMenu = new PatientMenu();
        Boolean repetir = true;
        
        while (repetir==true){

            int opcion = menus.MenuPrincipal();

            switch(opcion){
                case 1:
                   repetir = doctorMenu.MenuMedico();          
                   break;

                case 2:
                   repetir = patientMenu.MenuPaciente();
                   break;

                case 3:
 //                  MenuAdministrativo();
                break;

                case 4:
                    System.out.println("Hasta Pronto");
                    repetir=false;
                break;
                default:
                    System.out.println("Usted es marica o se hace?");
                    repetir = false;
            }
        }
    }  
}
