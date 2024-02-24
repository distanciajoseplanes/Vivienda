/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;
/**
 * Clase que representa una vivienda.
 * 
 * Esta clase contiene atributos y métodos relacionados con una vivienda, como el precio, el número de habitaciones, la superficie, etc.
 * 
 * @author paqui
 */
public class Vivienda {
    
    /** Precio de la vivienda */
    private double precio;
    /** Número de habitaciones de la vivienda */
    private int numHabitaciones;
    /** Superficie de la vivienda en metros cuadrados */
    private double superficie;
    /** Indica si la vivienda tiene parking */
    private boolean parking;
    /** Estado de la vivienda */
    private String estado;
    /** Nombre del propietario de la vivienda */
    private String propietario; 
    
    /** Constructor que recibe todos los parámetros */
    public Vivienda (double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario)
    {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    /** Método que actualiza el precio de la vivienda aplicando un descuento */
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * (descuento / 100);
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
        public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    public double getSuperficie(){
        return superficie;
    }
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public boolean isParking() {
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
    
}
