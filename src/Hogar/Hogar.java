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
        Vivienda casal = new Vivienda(120000);
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        imprimirVivienda(casal);
    }

    public static void imprimirVivienda(Vivienda casal) {
        System.out.println("Precio: " + casal.getPrecio());
        System.out.println("Número de habitaciones: "+ casal.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casal.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casal.isParking());
        System.out.println("Estado: "+ casal.getEstado());
        System.out.println("Propietario: "+ casal.getPropietario());
    }
    
}
