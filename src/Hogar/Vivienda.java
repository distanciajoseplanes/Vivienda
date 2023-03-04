/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author arturo
 */
public class Vivienda {
    
    /**
     * Atributo precio de la Vivienda. Tipo doble
     */
    private double precio;
    /**
     * Atributo numHabitaciones de la Vivienda. Tipo entero
     */
    private int numHabitaciones;
    /**
     * Atributo superficie de la Vivienda. Tipo doble
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
     * Atributo pripietario de la Vivienda. Tipo cadena
     */
    private String propietario;
    
    /**
     * Constructor con 6 parámetros
     * Crea objetos Vivienda con precio, numHabitaciones, superficie, parking, estado y propietario
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
     * Constructor con 1 parámetro
     * Crea objetos Vivienda con precio
     * @param precio 
     */
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Metodo para imprimir la información de una vivienda indicando el precio, numero de habitaciones, superficio, disponibilidad de parking, estado y el propietario
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
     * Devuelve el precio de la vivienda
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Metodo para establecer el precio de la vivienda
     * @param precio nuevo de vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Devuelve el número de habitaciones de la vivienda
     * @return numHabitaciones
     */

    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * Metodo para establecer el número de habitaciones de la vivienda
     * @param numHabitaciones número nuevo
     */

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
     * Devuelve la superficie de la vivienda
     * @return superficie
     */

    public double getSuperficie() {
        return superficie;
    }
    /**
     * Metodo para esablecer superficie de la vivienda
     * @param superficie 
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    /**
     * Devuelve si tiene parking o no
     * @return 
     */

    public boolean isParking() {
        return parking;
    }
    /**
     * Metodo para establecer si tiene parking o no
     * @param parking 
     */

    public void setParking(boolean parking) {
        this.parking = parking;
    }
    /**
     * Devuelve el estado de la vivienda
     * @return estado
     */

    public String getEstado() {
        return estado;
    }
    /**
     * Metodo para establecer estado de la vivienda
     * @param estado nuevo estado de la vivienda
     */

    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Devuelve el propietario de la vivienda
     * @return propietario
     */

    public String getPropietario() {
        return propietario;
    }
    /**
     * Metodo para establcecer un nuevo propiertario
     * @param propietario nuevo propietario
     */

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    } 
    
    /**
     * Este método devuelve el número 
     * @param descuento 
     */
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * descuento;
    }
    
    
}
