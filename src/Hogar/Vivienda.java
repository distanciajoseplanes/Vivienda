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
 * <h2> Clase Vivienda, se utiliza para crear y leer viviendas de una Base de Datos </h2>
 * 
 * @author Juanqui
 */
public class Vivienda {
    
    /**
     * Atributo precio de la vivienda. Tipo double (número con parte entera y parte decimal)
     */
    private double precio;
    /**
     * Atributo número de habitaciones de la vivienda. Tipo entero
     */
    private int numHabitaciones;
    /**
     * Atributo superficie de la vivienda. Tipo double
     */
    private double superficie;
    /**
     * Atributo parking de la vivienda. Tipo boolean (Sí/No)
     */
    private boolean parking;
    /**
     * Atributo estado de la vivienda. Tipo cadena de caracteres
     */
    private String estado;
    /**
     * Atributo propietario de la vivienda. Tipo cadena de caracteres
     */
    private String propietario;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Este método actualiza el precio aplicando el % de descuento que tenga el precio anterior
     * @param descuento 
     */
    public void actualizarPrecio(double descuento){
        precio = precio - precio * (descuento/100);
    }


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
    
    /**
     * Constructor con 6 parámetros
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario 
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario){
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
        
    }
}
