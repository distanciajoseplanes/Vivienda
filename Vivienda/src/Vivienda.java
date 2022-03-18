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
public class Vivienda {

    /**
     * Devuelve precio
     * @return the precio
     */
    protected double getPrecio() {
        return precio;
    }

    /**
     * Establece precio
     * @param precio the precio to set
     */
    protected void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve habitaciones
     * @return the numHabitaciones
     */
    protected int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Establece numnero habitaciones
     * @param numHabitaciones the numHabitaciones to set
     */
    protected void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * devuelve superficie
     * @return the superficie
     */
    protected double getSuperficie() {
        return superficie;
    }

    /**
     * Establece superficie
     * @param superficie the superficie to set
     */
    protected void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Devuelve si tiene parking
     * @return the parking
     */
    protected boolean isParking() {
        return parking;
    }

    /**
     * Establece si tiene parking
     * @param parking the parking to set
     */
    protected void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Devuelve estado
     * @return the estado
     */
    protected String getEstado() {
        return estado;
    }

    /**
     * Establece estado
     * @param estado the estado to set
     */
    protected void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve propietario
     * @return the propietario
     */
    protected String getPropietario() {
        return propietario;
    }

    /**
     * Establece propietario
     * @param propietario the propietario to set
     */
    protected void setPropietario(String propietario) {
        this.propietario = propietario;
    }
       // Atributos
    /**
     * precio de la vivienda
     */
    private double precio;
    
    /**
     * numero de habitaciones de la vivienda
     */
    private int numHabitaciones;
    /**
     * superficie de la vivienda
     */
    private double superficie;
    /**
     * Indica si la vivienda tiene parking
     */
    private boolean parking;
    /**
     * Indica el estado de la vivienda
     */
    private String estado;
    /**
     * Indica el propietario de la vivienda
     */
    private String propietario;
    /**
     * Metodo constructor parametrizado
     * @param precio 
     */
    public Vivienda(double precio) {
        this.precio = precio;
    }
    /**
     * Metodo constructor parametrizado
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
     * Metodo que actualiza el precio de la vivienda 
     *
     */
    public void actualizarPrecio() 
    {
        /**
         * @param descuento calcula el precio de la vivienda con el descuento
         */
        final double descuento = getPrecio() - getPrecio() * 0.05;

        setPrecio(descuento);
    }
}
