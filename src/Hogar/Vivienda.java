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
 * 
 * @author ruben
 * @version Febrero_2023
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
     * @return
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio asds
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @return
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
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
     * @return
     */
    public double getSuperficie() {
        return superficie;
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
     * @return
     */
    public boolean isParking() {
        return parking;
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
     * @return
     */
    public String getEstado() {
        return estado;
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
     * @return
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     *
     * @param propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     *
     * @param precio
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     *
     * @param descuento
     */
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * descuento/100;
    }

    /**
     *
     */
    public void imprimirVivienda(){
        System.out.println("Precio: " + precio);
        System.out.println("Número de habitaciones: "+ numHabitaciones);
        System.out.println("Superficie en m2: " + superficie);
        System.out.println("¿Dispone de parking?: " + parking);
        System.out.println("Estado: "+ estado);
        System.out.println("Propietario: "+ propietario);
    }

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
    
}
