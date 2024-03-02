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
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    /**
     * 
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
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio será el nuevo precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return el número de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones el nuevo número de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return la superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie la nueva superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return si hay parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking actualiza si hay no parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return el estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado la condición del estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return el propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario cambia el propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    /**
     * 
     * @param precio constructor sólo con preecio
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /**
     * 
     * @param descuento el porcentaje de descuento a aplicar
     */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
}
