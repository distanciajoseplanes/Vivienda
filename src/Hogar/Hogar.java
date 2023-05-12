/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author paqui
 * @author Editor Juan Carlos Aguirre Tarea 04 ED
 */
/** 
* En este código se ha creado una instancia de Vivienda llamada casa1 
* y se han asignado valores a todos los atributos utilizando el nuevo constructor.
* Luego, se utilizan los métodos getters para obtener
* los valores de los atributos y se imprimen en la consola.
* Además, se muestra cómo utilizar el método actualizarPrecio() 
* para aplicar un descuento del 10% al precio de la vivienda 
* y se imprime el precio actualizado.
 */
public class Hogar {

    public static void main(String[] args) {
        Vivienda casa1 = new Vivienda(120000, 3, 150.5, true, "Buen estado", "Juan");
        
        System.out.println("Datos de la vivienda:");
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("Número de habitaciones: " + casa1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa1.tieneParking());
        System.out.println("Estado: " + casa1.getEstado());
        System.out.println("Propietario: " + casa1.getPropietario());
        
        casa1.actualizarPrecio(10); // Aplica un 10% de descuento
        System.out.println("Precio actualizado: " + casa1.getPrecio());
    }
}

