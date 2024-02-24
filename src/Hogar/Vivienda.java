/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *<h2>Clase Vivienda</h2>
 * Es una clase con diferentes atributos relacionados con la vivienda.
 * Cuenta con:
 * <ul>
 * <li>Constructores</li>
 * <li>Getter y Setter</li>
 * <li>Métodos propios</li>
 * </ul>
 * @author Jose Antonio Cano 
 * @version 1.0
 * @since 1.0
 */
public class Vivienda {
    /**
     * Atributo precio de la Vivienda. Tipo double
     */
    private double precio;
    /**
     * Atributo número de habitaciones de la Vivienda. Tipo int
     */
    private int numHabitaciones;
    /**
     * Atributo superficie de la Vivienda. Tipo double
     */
    private double superficie;
    /**
     * Atributo parking de la Vivienda. Tipo boolean
     */
    private boolean parking;
    /**
     * Atributo estado de la Vivienda. Tipo cadena
     */
    private String estado;
    /**
     * Atributo propietario de la Vivienda. Tipo cadena
     */
    private String propietario;
    
    /**
     * Constructor con 1 parámetro
     * Crea objetos de la clase Vivienda con precio
     * @param precio Precio de la Vivienda
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Constructor con 6 parámetros
     * Crea objetos de la clase Vivienda con precio, numHabitaciones,
     * superficie, parking, estado y propietario 
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario 
     */
    public Vivienda(double precio, int numHabitaciones, double superficie,
                    boolean parking, String estado, String propietario) 
    {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    /**
     * Método para obtener el precio
     * @return devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Método para obtener el número de habitaciones
     * @return devuelve el numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    /**
     * Método para obtener la superficie
     * @return devuelve superficie
     */
    public double getSuperficie() {
        return superficie;
    }
    
    /**
     * Método para saber si hay parking o no
     * @return devuelve true o false
     */
    public boolean isParking() {
        return parking;
    }
    
    /**
     * Método para obtener el estado
     * @return devuelve el estado
     */
    public String getEstado() {
        return estado;
    }
    
    /**
     * Método para obtener el propietario
     * @return devuelve el propietario
     */
    public String getPropietario() {
        return propietario;
    }
    
    /**
     * Método para cambiar el precio por otro dado
     * @param precio double que será cambiado por el actual
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     * Método para cambiar el número de habitaciones por otro dado
     * @param numHabitaciones int que será cambiado por el actual
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    /**
     * Método para cambiar la superficie por otra dada
     * @param superficie double que será cambiado por el actual
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    /**
     * Método para cambiar si tiene parking o no
     * @param parking boolean que será cambiado por el actual
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    
    /**
     * Método para cambiar el estado por otro dado
     * @param estado String que será cambiado por el actual
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Método para cambiar el propietario por otro dado
     * @param propietario String que será cambiado por el actual
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * Este método devuelve el precio de la vivienda actualizado con un descuento dado
     * @param descuento Porcentaje de descuento que se aplicará al precio de la vivienda 
     * @return Devuelve el precio actualizado
     */    
    public double actualizarPrecio(double descuento)
    { 
        return precio - (precio * descuento/100);
    }
    
    /**
     * Este método muestra por pantalla el valor de los atributos del objeto Vivienda
     * No tiene parámetro de entrada y no devuelve nada
     */
    public void imprimirVivienda()
    {
        System.out.println("Precio: " + precio);
        System.out.println("Número de habitaciones: "+ numHabitaciones);
        System.out.println("Superficie en m2: " + superficie);
        System.out.println("¿Dispone de parking?: " + parking);
        System.out.println("Estado: "+ estado);
        System.out.println("Propietario: "+ propietario);
    }
    
}
