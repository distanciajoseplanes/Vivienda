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
 * Clase que representa una vivienda en venta
 */ 
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    
    /**
     * Método que devuelve el precio de la vivienda.
     *
     * @return El precio de la vivienda.
     */
    public double getPrecio() {
        return precio;
    }

     /**
     * Método que establece el precio de la vivienda.
     *
     * @param precio El precio de la vivienda.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

     /**
     * Método que devuelve el número de habitaciones de la vivienda.
     *
     * @return El número de habitaciones de la vivienda.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Método que establece el número de habitaciones de la vivienda.
     *
     * @param numHabitaciones El número de habitaciones de la vivienda.
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Método que devuelve la superficie de la vivienda.
     *
     * @return La superficie de la vivienda.
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Método que establece la superficie de la vivienda.
     *
     * @param superficie La superficie de la vivienda.
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Método que indica si la vivienda dispone de parking.
     *
     * @return true si la vivienda dispone de parking, false en caso contrario.
     */
    public boolean isParking() {
        return parking;
    }

     /**
     * Método que establece si la vivienda dispone de parking.
     *
     * @param parking true si la vivienda dispone de parking, false en caso contrario.
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

   /**
     * Método que devuelve el estado de la vivienda.
     *
     * @return El estado de la vivienda.
     */
    public String getEstado() {
        return estado;
    }

   /**
     * Método que establece el estado de la vivienda.
     *
     * @param estado El estado de la vivienda.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método que devuelve el propietario de la vivienda.
     *
     * @return El propietario de la vivienda.
     */
    public String getPropietario() {
        return propietario;
    }

     /**
     * Método que establece el propietario de la vivienda.
     *
     * @param propietario El propietario de la vivienda.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * Constructor de la clase Vivienda que recibe solo el precio.
     *
     * @param precio El precio de la vivienda.
     */

      public Vivienda (double precio)
    {
        this.precio = precio;
    }
      
       /**
     * Constructor de la clase Vivienda que recibe todos los parámetros.
     *
     * @param numHabitaciones El número de habitaciones de la vivienda.
     * @param superficie La superficie de la vivienda.
     * @param parking Indica si la vivienda dispone de parking.
     * @param estado El estado de la vivienda.
     * @param propietario El propietario de la vivienda.
     */
    public Vivienda( int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
      
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }

    /**
     * Método que actualiza el precio de la vivienda aplicando un descuento.
     *
     * @param descuento El porcentaje de descuento a aplicar.
     */
    
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * (descuento / 100));
    }
    
}
