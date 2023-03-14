/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * La clase Vivienda abarca las distintas características fundamentales
 * e información de una vivienda que vamos a poner en venta.
 * @author paqui
 */
public class Vivienda {

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }

    /**
     * @return de precio.
     * Devuelve el precio base de la vivienda puesta en venta.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set.
     * Indica el parámetro del precio base de la vivienda puesta en venta. 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones.
     * Devuelve el número total de habitaciones que hay en la vivienda.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     * Parámetro del número de habitaciones que hay en la vivienda.
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie en m2 que dispone la vivienda.
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     * Establece los m2 de la vivienda.
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     * Devuelve la posibilidad de que la vivienda disponga de parking o no.
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking the parking to set
     * Establece la posibilidad de que la vivienda disponga de parking o no.
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return the estado
     * Devuelve el estado general en el que se encuentra la vivienda.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     * Dicta el estado general en el que se encuentra la vivienda.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the propietario
     * Devuelve el propietario de la vivienda puesta en venta.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     * Establece el propietario de la vivienda.
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
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Método para actualizar el precio.
     * Con el fin de aplicar al precio base un descuento.
     * @author Jose Antonio Zomeño Pardo
     */
    public void actualizarPrecio()
    {
        descuento();
    }
    /**
     * Método para establecer el precio final.
     * Se multiplica el precio base por 0.05 para obtener la cantidad a restar
     * a este precio base. El resultado de la resta será el precio final de la
     * vivienda, obteniendo así un descuento del 5%.
     * @author Jose Antonio Zomeño Pardo
     */
    public void descuento() {
        setPrecio(getPrecio() - getPrecio() * 0.05);
    }
    
}
