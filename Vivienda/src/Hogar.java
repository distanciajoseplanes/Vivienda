/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Hogar {

    public static void imprimirVivienda( double precio, int numHabitaciones, 
                                         double superficie, boolean parking, String estado, String propietario ){
        
        System.out.println("Precio: " + precio );
        System.out.println("Número de habitaciones: " + numHabitaciones );
        System.out.println("Superficie en m2: " + superficie );
        System.out.println("¿Dispone de parking? " + parking );
        System.out.println("Estado: " + estado );
        System.out.println("Propietario: " + propietario );
    }
    
    public static void main(String[] args) {
        
        Vivienda casa1 = new Vivienda(120000);
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        imprimirVivienda(casa1.getPrecio(), casa1.getNumHabitaciones(), casa1.getSuperficie(), 
                         casa1.isParking(), casa1.getEstado(), casa1.getPropietario());       
    }
    
}
