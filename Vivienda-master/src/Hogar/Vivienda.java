/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author paqui
 * @version 1.2
 * @since 10-03-2023
 * 
 * La clase que se muestra en estea parte contendra las caracteristicas 
 * basicas de una vivienda, los getter y setters de todos los atributos,
 * el constructor del mismo y el metodo actualizarPrecio
 * adelante
 * @see actualizarPrecio
 */
public class Vivienda {
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /**
     * El constructor se encargara de la creacion de nuevos objetos de 
     * la clase vivienda guardando los datos introducidos como parametro
     * del espacio en memoria crado para el nuevo objeto
     * @param precio Coste de la vivienda
     * @param numHabitaciones las que posea la vivienda
     * @param superficie en metros cuadrador de la vivienda
     * @param parking si la vivienda dispone de aparcamiento
     * @param estado en que condiciones se encuentra la vivienda
     * @param propietario quien tiene la propiedad de la vivienda
     * 
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
     * @return el precio de la vivienda
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio se introduce el precio de la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return el numHabitaciones de la vivienda
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones el numHabitaciones que se introduce
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return la superficie de la vivienda
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie la superficie que se introduce
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return si tiene o no parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking se introduce si tiene o no parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return el estado de la vivienda
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado se introduce el estado de la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return el propietario de la vivienda
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario se introduce el propietario de la vivienda
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * 
     * @param descuento 
     * Este netidi tndra la finalidad de calcular el precio final de 
     * un objeto vivienda conforme a la cantidad de porcentaje de 
     * descuento que se le introduzca
     */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - descuento * 0.05);
    }
    
}
