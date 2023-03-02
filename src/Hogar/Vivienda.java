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



/**
 * Clase que representa una vivienda.
 */
public class Vivienda {
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
   
    /**
     * Constructor que recibe el precio de la vivienda.
     * @param precio El precio de la vivienda.
     */
    
    public Vivienda(double precio) {
        this.precio = precio;
    }
    
     /**
     * Constructor que recibe todos los atributos de la vivienda.
     * @param precio El precio de la vivienda.
     * @param numHabitaciones El número de habitaciones de la vivienda.
     * @param superficie La superficie de la vivienda en metros cuadrados.
     * @param parking Indica si la vivienda dispone de parking o no.
     * @param estado El estado de la vivienda (buen estado, a reformar, etc.).
     * @param propietario El nombre del propietario de la vivienda.
     */
    
     public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) 
    {
    this.precio = precio;
    this.numHabitaciones = numHabitaciones;
    this.superficie = superficie;
    this.parking = parking;
    this.estado = estado;
    this.propietario = propietario;
    }
     
    /**
     * Método que actualiza el precio de la vivienda aplicando un descuento.
     * @param descuento El porcentaje de descuento a aplicar al precio actual.
     */ 
    public void actualizarPrecio(double descuento) 
    {
    precio = precio - precio * (descuento / 100);
    }
    
    // Setters
    /**
     * Método que establece el precio de la vivienda.
     * @param precio El nuevo precio de la vivienda.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
     /**
     * Método que establece el número de habitaciones de la vivienda.
     * @param numHabitaciones El nuevo número de habitaciones de la vivienda.
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
     /**
     * Método que establece la superficie de la vivienda en metros cuadrados.
     * @param superficie La nueva superficie de la vivienda en metros cuadrados.
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    /**
     *
     * @param parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    
    /**
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     *
     * @param propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    // Getters
    
    /**
     * Método que devuelve el precio de la vivienda.
     * @return El precio de la vivienda.
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Método que devuelve el número de habitaciones de la vivienda.
     * @return El número de habitaciones de la vivienda.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * Método que devuelve la superficie de la vivienda en metros cuadrados.
     * @return La superficie de la vivienda en metros cuadrados.
     */
    public double getSuperficie() {
        return superficie;
    }
    
    /**
     *
     * @return
     */
    public boolean isParking() {
        return parking;
    }
    
    /**
     *
     * @return
     */
    public String getEstado() {
        return estado;
    }
    
    /**
     *
     * @return
     */
    public String getPropietario() {
        return propietario;
    }
    
    /**
     *
     * @return
     */
    @Override 
    public String toString() 
    {
        return "Precio: " + precio + ", Número de habitaciones: " + numHabitaciones + ", Superficie: " + superficie + ", Parking: " + parking + ", Estado: " + estado + ", Propietario: " + propietario;
    }
}