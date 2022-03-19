/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Hogar
 * 
 * Contiene información de la vivienda que tenemos catalogada como hogar
 * 
 * @author Jose Maria Puertas
 * @version 2.0
 */
public class Hogar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vivienda casa1 = new Vivienda(120000);
        /**
         * precio de hogar
         */
        double precio;
        /**
         * número de habitaciones del hogar
         */
        int numHabitaciones;
        /**
         * superficie total del hogar en m2
         */
        double superficie;
        /**
         * Si dispone o no de parking
         */
        boolean parking;
        /**
         * Estado de conservación del hogar
         */
        String estado;
        /**
         * Nombre y apellidos del titular de la vivienda
         */
        String propietario;
        
        imprimirVivienda(casa1);
    }
   
    /**
     * Este método muestra los atributos de la clase Vivienda
     * @param casa1 Objeto de la clase Vivienda
     */
    public static void imprimirVivienda(Vivienda casa1) {
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa1.isParking());
        System.out.println("Estado: "+ casa1.getEstado());
        System.out.println("Propietario: "+ casa1.getPropietario());
    }
    
}
