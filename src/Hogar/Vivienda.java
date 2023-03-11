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
 * Clase que representa una vivienda.
 */
public class Vivienda {

    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /** Constructor de la clase Vivienda
     * 
     * @param precio            El precio de la vivienda.
     * @param numHabitaciones   El número de habitaciones de la vivienda.
     * @param superficie        La superficie de la vivienda en metros cuadrados.
     * @param parking           Indica si la vivienda tiene parking o no.
     * @param estado            El estado de la vivienda (nuevo, usado, reformado, etc.).
     * @param propietario       El nombre del propietario de la vivienda.
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
     * Obtiene el precio de la vivienda.
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de la vivienda.
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el número de habitaciones de la vivienda.
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Establece el número de habitaciones de la vivienda.
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Obtiene la superficie de la vivienda en metros cuadrados.
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Establece la superficie de la vivienda en metros cuadrados.
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Indica si la vivienda tiene parking o no.
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Establece si la vivienda tiene parking o no.
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Obtiene el estado de la vivienda.
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la vivienda
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el nombre del propietario de la vivienda.
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Establece el nombre del propietario de la vivienda.
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * Obtiene el precio de la vivienda.
     * @param precio de la vivienda
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /**
     * Actualiza el precio de la vivienda aplicando un descuento.
     * @param descuento de la vivienda
     */
    public void actualizarPrecio(double descuento) 
    {
        double precioConDescuento=this.precio-(this.precio*descuento/100);
        this.setPrecio(precioConDescuento);
    }   
}
