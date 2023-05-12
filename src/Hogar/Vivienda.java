/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * Clase que representa una vivienda.
 * 
 * @author paqui
 * @author Edicion Juan Carlos Aguirre Tarea 04 ED
 * @version 1.0.2
 */
/**  
* Se cambió el nombre de la variable v por casa1.
* Se agregó el método imprimirVivienda() que imprime los datos de la vivienda.
* Se encapsularon los atributos de la clase Vivienda utilizando setters y getters.
* Se creó un nuevo constructor en la clase Vivienda que recibe todos los parámetros de la clase.
* El método actualizarPrecio() ahora recibe un parámetro llamado descuento, que es el porcentaje a restar del precio actual.
 */

// Se cambió el nombre de la variable v por casa1.
public class Vivienda {
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
//Se creó un nuevo constructor en la clase Vivienda que recibe todos los parámetros de la clase.
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
//Se encapsularon los atributos de la clase Vivienda utilizando setters y getters.
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    public double getSuperficie() {
        return superficie;
    }
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public boolean tieneParking() {
        return parking;
    }
    
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getPropietario() {
        return propietario;
    }
    
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

//El método actualizarPrecio() ahora recibe un parámetro llamado descuento, que es el porcentaje a restar del precio actual.    
    public void actualizarPrecio(double descuento) {
        double porcentajeDescuento = descuento / 100;
        precio = precio - (precio * porcentajeDescuento);
    }

//Se agregó el método imprimirVivienda() que imprime los datos de la vivienda.
    public void imprimirVivienda() {
        System.out.println("Datos de la vivienda:");
        System.out.println("Precio: " + precio);
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Superficie: " + superficie);
        System.out.println("Parking: " + parking);
        System.out.println("Estado: " + estado);
        System.out.println("Propietario: " + propietario);
    }
    
}
