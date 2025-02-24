 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.util.Scanner;
import Horarios.*;
import Users.*;
import java.util.ArrayList;
/**
 *
 * @author juand
 */
public class Menus {
    static Scanner scanner = new Scanner(System.in);

    public  int MenuPrincipal(){
       int opcion=5;

       while(opcion>=5 || opcion <0){
            System.out.println("*** BIENVENIDO ****");
            System.out.println("Digite la opción según su rol:");
            System.out.println("1. Médico");
            System.out.println("2. Paciente");
            System.out.println("3. Administrativo");
            System.out.println("4. Salir");

            opcion = scanner.nextInt();

            if(opcion>=5 || opcion <0){
                displayError("Opción no válida");
            }            

        }

       return opcion;

    }


    public static void displayError(String error){
       System.out.println("Error:" + error);
   } 
}
