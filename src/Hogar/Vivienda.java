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
     * Devuelve el precio de la vivienda
     * @return 
     */
    public double getPrecio() {
        return precio;
    }

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    
    

    /**
     * Establece el precio de la vivienda
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el número de habitaciones
     * @return 
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Establece el número de habitaciones
     * @param numHabitaciones 
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Devuelve los metros de superficie que tiene la vivienda
     * @return 
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Establece los metros de superficie que tiene la vivienda
     * @param superficie 
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Devuelve verdadero o falso si tiene parking o no la vivienda
     * @return 
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Establece si dispone de parking la vivienda
     * @param parking 
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Devuelve el estado en el que está la vivienda
     * @return 
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado en el que está la vivienda
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve el nombre del propietario
     * @return 
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Establece el nombre del propietario
     * @param propietario 
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    
    /** 
     * 
     * Establece el precio de la vivienda 
     * @param precio 
     */
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Devuelve el precio de la vivienda aplicando el descuento 
     * @param descuento 
     */
    public void actualizarPrecio(Object descuento)
    {
        setPrecio(getPrecio() - getPrecio() * 0.05);
    }
    
}
