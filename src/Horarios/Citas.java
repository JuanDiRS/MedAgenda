/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Horarios;

/**
 *
 * @author juand
 */
public class Citas {
     private String fechaCita;
     private String horaCita;

  public String getFecha(){
      return fechaCita;

  }

  public void setFecha(String fecha){
      this.fechaCita = fecha;
  }

  public String getHora(){
      return horaCita;

  }

  public void setHora(String hora){
      this.horaCita = hora;
  }
}
