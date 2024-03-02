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
        Vivienda casa1 = new Vivienda(120000);
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        imprimirVivienda(casa1);
    }

    public static void imprimirVivienda(Vivienda casa){
        System.out.println("Precio: " + casa.getPrecio());
        System.out.println("Número de habitaciones: "+ casa.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa.tieneParking());
        System.out.println("Estado: "+ casa.getEstado());
        System.out.println("Propietario: "+ casa.getPropietario());
    }
    
}
