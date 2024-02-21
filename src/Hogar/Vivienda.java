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
    
    /**
    * Atributo precio de la vivienda. Tipo double
    **/
    private double precio;
    /**
    * Atributo número de habitaciones de la vivienda. Tipo int
    **/
    private int numHabitaciones;
    /**
    * Atributo Superficie de la vivienda. Tipo double
    **/
    private double superficie;
    /**
    * Atributo precio de la vivienda. Tipo boolean
    **/
    private boolean parking;
    /**
    * Atributo Estado de la vivienda. Tipo String
    **/
    private String estado;
    /**
    * Atributo Propietario de la vivienda. Tipo String
    **/
    private String propietario;

    /**
    * Es el constructor de la clase Vivienda
    * @param precio Precio de la vivienda
    * @param numHabitaciones Número de habitaciones
    * @param superficie Superficie de la vivienda
    * @param parking Tiene parking o no la vivienda
    * @param estado Como se encuentra la vivienda
    * @param propietario Nombre y apellidos del propietario
    **/
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }

    /**
     * Devuelve el precio de la vivienda
     * @return double Devuelve el precio de la vivienda
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Asigna el precio de la vivienda
     * @param precio Precio de la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Devuelve el número de habitaciones de la vivienda
     * @return int Devuelve el número de habitaciones de la vivienda
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * Asigna el número de habitaciones de la vivienda
     * @param numHabitaciones Número de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
     * Devuelve la superficie de la vivienda
     * @return double Devuelve la superficie de la vivienda
     */
    public double getSuperficie() {
        return superficie;
    }
    /**
     * Asigna la superficie de la vivienda
     * @param superficie Superficie de la vivienda
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    /**
     * Devuelve si tiene parking la vivienda
     * @return boolean Devuelve si tiene parking la vivienda
     */
    public boolean isParking() {
        return parking;
    }
    /**
     * Asigna si tiene parking la vivienda
     * @param parking Tiene parking o no la vivienda
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    /**
     * Devuelve el estado de la vivienda
     * @return String Devuelve el estado de la vivienda
     */
    public String getEstado() {
        return estado;
    }   
    /**
     * Asigna el estado de la vivienda
     * @param estado Como se encuentra la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve el propietario de la vivienda
     * @return String Nombre y apellidos del propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Asigna el propietario de la vivienda
     * @param propietario Nombre y apellidos del propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * Asigna el precio de la vivienda
     * @param precio Precio de la vivienda
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Actualiza el precio de la vivienda acorde a un descuento
     * @param descuento Descuento de la vivienda
     */
    public void actualizarPrecio(double descuento)
    {
        this.precio = this.precio - this.precio * descuento;
    }
    
}
