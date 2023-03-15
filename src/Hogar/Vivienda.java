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
     * Este parámetro te devuelve el precio de la vivienda.
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Este parámetro se usa para establecer el precio de la vivienda.
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Este parámetro te devuelve el número de habitaciones.
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Este parámetro se usa para establecer el número de habitaciones.
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Este parámetro te devuelve la superficie de la vivienda en metros cuadrados.
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Este parámetro establece la superficie de la vivienda en metros cuadrados.
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Este parámetro te indíca si la vivienda dispone o no de parking.
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Este parámetro establece si la vivienda dispone o no de parking.
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Este parámetro te indíca el estado de la vivienda.
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Este parámetro establece el estado de la vivienda.
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Este parámetro te indica el nombre del propietario de la vivienda.
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Este parámetro establece el nombre del propietario de la vivienda.
     * @param propietario the propietario to set
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
    
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /*
    * Este parámetro te indica el nombre del propietario de la vivienda.
    * @return the propietario
    */
    public void actualizarPrecio(double descuento) {
    
        double precioDescontado=this.getPrecio()-(this.getPrecio()*descuento/100);
        this.setPrecio(precioDescontado);
    }
    
}
