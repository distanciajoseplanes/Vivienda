/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Manuel Morales Barba
 */
/**
 * 
 * <h2> Clase Vivienda, permite la creacion de una vivienda </h2>
 */
public class Vivienda {
    /**
     * Atributo precio de tipo double que da el precio a la Vivienda.
     */
    private double precio;
    /**
     * Atributo numHabitaciones de tipo int que da las habitaciones a la Vivienda.
     */
    private int numHabitaciones;
    /**
     * Atributo superficie de tipo double que da los m2 a la Vivienda.
     */
    private double superficie;
    /**
     * Atributo parking de tipo booleano que devuelve true o false si la vivienda tiene parking.
     */
    private boolean parking;
    /**
     * Atributo estado de tipo String que devuelve el estado de la Vivienda.
     */
    private String estado;
    /**
     * Atributo propietario de tipo String que devuelve el propietario de la Vivienda.
     */
    private String propietario;
    /**
     * Constructor con 6 parametros
     * Crea objetos de tipo Vivienda con precio,numHabitaciones,superficie,parking,estado y propietario.
     * @param precio precio de la vivienda.
     * @param numHabitaciones numero de habitaciones de la vivienda.
     * @param superficie m2 de la vivienda.
     * @param parking nos dice si la vivienda tiene parking o no.
     * @param estado nos dice el estado de la vivienda.
     * @param propietario nos dice el propietario de la vivienda.
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario){
        this.precio=precio;
        this.numHabitaciones=numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    /**
     * Este es un Constructor por defecto que en el que asignamos solo el precio de la Vivienda.
     * @param precio nos dice el precio de la Vivienda.
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /**
     * Método <b>modificado</b> que nos permite actualizar el precio de la Vivienda en base a un descuento dado.
     * @see Vivienda
     * @param descuento dato de tipo double que aplica directamente el descuento que se desea hacer la vivienda. 
     */
    public void actualizarPrecio(double descuento)
    {
        precio -=  precio * descuento;
    }
    
    /** Método <b>implementado</b> que nos permite visualizar todas las propiedades de la vivienda.
    * @see Vivienda
    */
    public void imprimirVivienda(){
    System.out.println("Precio: "+precio+"\nNúmero de habitaciones"+numHabitaciones+"\nSuperficie en m2: "+this.superficie+"\n¿Dispone de parking? "+this.parking+"\nEstado: "+this.estado+"\nPropietario: "+this.propietario);
    }
    /**
     * Método para obtener el precio de la vivienda.
     * 
     * @return Devuelve el precio que tenga la vivienda en ese momento.
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Método para obtener el número de habitaciones de la vivienda.
     * @return Devuelve las habitaciones que tenga la vivienda en ese momento.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * Método para obtener la superficie de la Vivienda
     * @return Devuelve la superficie que tenga la vivienda en ese momento.
     */
    public double getSuperficie() {
        return superficie;
    }
    /**
     * Método que devuelve si una vivienda tiene parking o no
     * @return <ul>
     * <li>True: la vivienda tiene parking</li>
     * <li>False: la vivienda no tiene parking</li>
     * </ul>
     */
    public boolean isParking() {
        return parking;
    }
    /**
     * Método que devuelve el estado de una Vivienda
     * @return Devueleve el estado que tenga la vivienda en ese momento.
     */
    public String getEstado() {
        return estado;
    }
    /**
     * Método que devuelve el propietario asignado a la Vivienda.
     * @return Devuelve el propietario que tenga la vivienda en ese momento.
     */
    public String getPropietario() {
        return propietario;
    }
    /**
     * Método que modifica el precio de la vivienda.
     * @param precio Precio que se asigna a la vivienda.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Método que mofica las habitaciones que tiene la vivienda.
     * @param numHabitaciones Número de habitaciones que asigna a la vivienda.
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
     * Método que modifica los m2 que tiene la vivienda.
     * @param superficie m2 que asigna a la vivienda.
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    /**
     * Método que modifica si una vivienda tiene parking o no.
     * @param parking asigna a la vivienda si tiene parking o no.
     */

    public void setParking(boolean parking) {
        this.parking = parking;
    }
    /**
     * Método que cambia el estado de una Vivienda.
     * @param estado modifica el estado de la vivienda.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Método que modifica el propietario de la vivienda
     * @param propietario cambia el nombre del propietario de la vivienda.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
