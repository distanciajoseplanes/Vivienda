/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 * @version 1.1Carmen
 * @since 19/03/2022
 */
public class Vivienda 
{

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
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    /**
     * Este es el método contructor dados unos valores
     * @param precio introdudimos el precio
     * @param numHabitaciones introducimos el nº de habitaciones
     * @param superficie introduce la superficie de la vivienda
     * @param parking intruduce true o false para indicar si tiene parking
     * @param estado indica el estado de la vivienda
     * @param propietario indica el propietario
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
     * @param precio the vivienda to set
     */    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio()
    {
        actualizarPrecio(0);
    }
    
    /**
     * Este método actualiza el precio dado un descuento indicado
     */    
    public void actualizarPrecio(Object descuento) {
        setPrecio(getPrecio() - getPrecio() * 0.05);
    }
}