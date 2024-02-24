/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *<h2>Clase Hogar</h2>
 * Es una clase que contiene el método main, en ella se crea un objeto
 * de tipo Vivienda y se muestra por pantalla el valor de sus atributos.
 * @see Vivienda
 * @author Jose Antonio Cano
 * @version 1.0
 * @since 1.0
 */
public class Hogar {

    /**
     * Este método se encarga de iniciar la ejecución del programa
     * Este es el método principal del proyecto
     * @param args Array tipo cadena
     */
    public static void main(String[] args) {
        Vivienda casa1 = new Vivienda(120000);
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa1.isParking());
        System.out.println("Estado: "+ casa1.getEstado());
        System.out.println("Propietario: "+ casa1.getPropietario());
        
    }
    
}
