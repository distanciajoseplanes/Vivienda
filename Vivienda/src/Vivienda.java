/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 * @version 2.0 - Eduardo Breitkopf Weisz
 */

public class Vivienda 
{
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    /**
     * Constructor que recibe todos los parámetros de la clase Vivienda
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario 
     */
    public Vivienda (double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    /**
     * Constructor que recibe por parámetro el precio de la vivienda
     * @param precio 
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Actualiza el precio actual restándole un descuento pasado como parámetro
     * @param descuento 
     */
    public void actualizarPrecio (double descuento)
    {
        precio = precio - precio * descuento;
    }

    /**
     * Consulta el precio de la vivienda
     * @return el precio de la vivienda
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Consulta el número de habitaciones de la vivienda
     * @return  número de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Modifica el número de habitaciones
     * @param numHabitaciones 
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Consulta los metros cuadrados de la vivienda
     * @return metros cuadrados (superficie)
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Modifica la superficie de la vivienda
     * @param superficie 
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Consulta si hay parking o no
     * @return verdadero o falso
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Modifica si hay parking o no
     * @param parking 
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Devuelve el estado de la vivienda
     * @return estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Modifica el estado de la vivienda
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Consulta el propietario de la vivienda
     * @return propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Modifica el propietario de la vivienda
     * @param propietario 
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}