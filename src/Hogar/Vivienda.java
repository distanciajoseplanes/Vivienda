/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * Clase que recoge las propiedades de una Vivienda
 * @author paqui
 * modificado por Alfonso José Sánchez Costa
 * @version 1.0
 */
public class Vivienda {
    
    /**
     * Atributos de la clase Vivienda
     * */

    /**
     * Precio de la vivienda
     */
    private double precio;
    
    /**
     * Número de habitaciones de la vivienda
     */
    private int numHabitaciones;
    
    /**
     * Superficie en m2 de la vivienda
     */
    private double superficie;
    
    /**
     * True si la vivienda tiene parking y false si no
     */
    private boolean parking;
    
    /**
     * Indica el estado de la vivienda
     */
    private String estado;
    
    /**
     * Propietario actual de la vivienda
     */
    private String propietario;
    
    /**
     * Constructor que inicializa el atributo precio de la clase Vivienda
     * @param precio
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }

    /**
     * Constructor que inicializa todos los parámetros de la clase Vivienda
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
     * devuelve el precio
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * devuelve el número de habitaciones
     * @return numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * devuelve la superficie de la vivienda
     * @return superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * devuelve true si tiene parking y false si no
     * @return parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * devuelve el estado de la vivienda
     * @return estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * devuelve el nombre del propietario de la vivienda
     * @return propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * establece el precio
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * establece el número de habitaciones
     * @param numHabitaciones 
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * establece la superficie
     * @param superficie 
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * establece si tiene o no parking
     * @param parking 
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * establece el estado de la casa
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * establece el nombre del propietario de la casa
     * @param propietario 
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
        
    /**
     * Actualiza el precio de la vivienda al aplicarle un descuento
     * @param descuento descuento a alicar sobre el precio
     */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
}
