/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author paqui
 */
public class Hogar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vivienda casa1 = new Vivienda(120000, 2, 800, false, "Perfecto", "Rafael");
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        imprimirVivienda(casa1);
  }
  public static void imprimirVivienda(Vivienda casa1) {
        System.out.println("Precio: " + casa1.precio);
        System.out.println("Número de habitaciones: "+ casa1.numHabitaciones);
        System.out.println("Superficie en m2: " + casa1.superficie);
        System.out.println("¿Dispone de parking?: " + casa1.parking);
        System.out.println("Estado: "+ casa1.estado);
        System.out.println("Propietario: "+ casa1.propietario);
  }
}
