/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *<h2>Esto es la tarea evaluable de entornos de desarrollo</h2><br>
 * Esta es la clase vivienda, donde se introducen todos los datos de la misma
 * @author ruben
 * @version 1.0
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
     * @return devuelve el precio de la vivienda
     */
    public double getPrecio() 
   {
        return precio;
    }

    /**
     * @param precio cambiar precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return devuelve el numero de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones numero de habitaciones a modificar
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return devuelve la superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie superficie a modificar
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return devuelve si tiene parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking modificar si tiene parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return devuelve si es nueva o de segunda mano
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado cambia si es nueva o no
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return devuelve si tiene propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario modifica si tiene propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    /**
     *  Atributo del precio de la vivienda. Tipo double
     */
    private double precio;
     /**
     *  Atributo del numero de habitaciones de la vivienda. Tipo numero entero
     */
    private int numHabitaciones;
      /**
     *  Atributo del la superficie de la vivienda. Tipo double
     */
    private double superficie;
     /**
     *  Atributo para indicar si tiene parking la vivienda. Tipo boolean
     */
    private boolean parking;
    /**
     *  Atributo del estado de la vivienda. Tipo String
     */
    private String estado;
    /**
     *  Atributo para saber si tiene propietario la vivienda. Tipo String
     */
    private String propietario;
     
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * 0.05);
    }
    
}
