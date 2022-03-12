/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 * @version 2.0
 */
public class Vivienda 
{
    //campos de la clase
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /**
     * constructor que solo recibe el parámetro precio 
     * @param precio 
     * 
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Segundo constructor que recibe como parámetros todos los atributos
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario 
     * 
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
     * metodo que actualiza el precio por medio del descuento aplicado
     * @param descuento 
     * 
     */
    
    public void actualizarPrecio(double descuento)
    {
        precio = precio - descuento;
    }

    /**
     * getter de precio
     * @return double
     * 
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * setter de precio
     * @param precio 
     * 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * getter de numHabitaciones
     * @return int
     * 
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * setter del numHabitaciones
     * @param numHabitaciones 
     * 
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
     * getter de superficie
     * @return superficie
     * 
     */
    public double getSuperficie() {
        return superficie;
    }
    /**
     * setter de superficie
     * @param superficie 
     * 
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    /**
     * getter de parking
     * @return boolean
     * 
     */
    public boolean isParking() {
        return parking;
    }
    /**
     * setter de parking
     * @param parking 
     * 
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    /**
     * getter de String
     * @return String
     * 
     */
    public String getEstado() {
        return estado;
    }
    /**
     * setter de estado
     * @param estado 
     * 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * getter de propietario
     * @return string
     * 
     */
    public String getPropietario() {
        return propietario;
    }
    /**
     * setter propietario
     * @param propietario
     * 
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
}