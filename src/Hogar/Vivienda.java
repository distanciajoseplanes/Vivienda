/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * <H2> Documentacion de la clase Vivienda.java </h2>
 * @author Francisco Javier Montiel Noguera
 * @see <a href="https://www.google.es">Google</a>
 * @version 1.1
 * @since 1.0
 */
public class Vivienda {
   
    /**
     * Atributo precio de la vivienda. Tipo double
     */
    private double precio;
    /**
     * Atributo numero de habitaciones de la vivienda. Tipo int
     */
    private int numHabitaciones;
    /**
     * Atributo numero de habitaciones de la vivienda. Tipo int
     */
    private double superficie;
    /**
     * Atributo parking de la vivienda. Tipo boolean
     */
    private boolean parking;
    /**
     * Atributo estado de la vivienda. Tipo cadena
     */
    private String estado;
    /**
     * Atributo propietario de la vivienda. Tipo cadena
     */
    private String propietario;
    
    /**
     * 
     * @param precio 
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }

    /**
     * 
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario 
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    /**
     * 
     * @param descuento 
     */
    public void actualizarPrecio(java.lang.Double descuento)
    {
        precio = precio - descuento;
    }
    
    
    /**
     * 
     * @return double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * 
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * 
     * @return int
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * 
     * @param numHabitaciones 
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * 
     * @return double
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * 
     * @param superficie 
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * 
     * @return boolean
     */
    public boolean isParking() {
        return parking;
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
     * @return String
     */
    public String getEstado() {
        return estado;
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
     * @return String
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * 
     * @param propietario 
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }    
}
