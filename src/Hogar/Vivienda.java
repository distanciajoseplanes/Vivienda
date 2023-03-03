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
 * La clase Vivienda representa una vivienda.
 */
public class Vivienda {
    
    /** Getters y Setters */
    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * Constructor que inicializa la clase vivienda con sus atributos:
     * 
     * @param precio           Precio de la vivienda.
     * @param parking          Si la vivienda tiene parking o no.
     * @param numHabitaciones  Número de habitaciones de la vivienda.
     * @param superficie       Superficie de la vivienda.
     * @param estado           Estado de la vivienda.
     * @param propietario      El nombre del propietario de la vivienda.
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
     * Atributos de la vivienda.
     * 
     */
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    
    /**
    Método que inicia la clase Vivienda pero solo introduciendo el precio de la misma.
    @param precio el precio de la vivienda.
    */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    
    /**
    Método que actualiza el precio de la vivienda restando un porcentaje de descuento como argumento.
    @param descuento El porcentaje de descuento a aplicar sobre el precio actual de la vivienda
    */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
}
