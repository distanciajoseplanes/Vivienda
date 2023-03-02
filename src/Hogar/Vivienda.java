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
public class Vivienda {
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) 
    {
    this.precio = precio;
    this.numHabitaciones = numHabitaciones;
    this.superficie = superficie;
    this.parking = parking;
    this.estado = estado;
    this.propietario = propietario;
    }
    
    public Vivienda(double precio) {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento) 
    {
    precio = precio - precio * (descuento / 100);
    }
    
    // Setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    // Getters
    public double getPrecio() {
        return precio;
    }
    
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    public double getSuperficie() {
        return superficie;
    }
    
    public boolean isParking() {
        return parking;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public String getPropietario() {
        return propietario;
    }
    
    @Override 
    public String toString() 
    {
        return "Precio: " + precio + ", Número de habitaciones: " + numHabitaciones + ", Superficie: " + superficie + ", Parking: " + parking + ", Estado: " + estado + ", Propietario: " + propietario;
    }
}