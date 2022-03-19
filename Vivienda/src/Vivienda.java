/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Guzman
 */
public class Vivienda {

    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    /**
     * contructor con precio  por parametro
     * @param precio
     */
    public Vivienda(double precio) {
        this.precio = precio;
    }
    

    /**
     * metodo constructor con parametros
     * @param precio
     * @param numhabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario
     */
    public Vivienda(double precio, int numhabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numhabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
//metodo para porcentaje descuento

    /**
     *calulo de descueto
     * @param descuento
     */
    public void actualizarPrecio(double descuento) {

        precio = precio - ((descuento * 100) / precio);
    }
//getters y setters

    /**
     *devuelve el precio
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * devuelve la cantidad de habitaciones
     * @return
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     *devuelve la superficie
     * @return
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * devuelve el parking
     * @return
     */
    public boolean isParking() {
        return parking;
    }

    /**
     *devuelve el estado
     * @return
     */
    public String getEstado() {
        return estado;
    }

    /**
     * devuelve el propietario
     * @return
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @param numHabitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     *
     * @param superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     *
     * @param parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     *
     * @param propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
