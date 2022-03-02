/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @version 1.0
 * @author José Antonio Guillamón Melero
 * @since 01/03/2022
 */
public class Vivienda 
{
    /**
     * Crea un objeto Vivienda fijando todos sus atributos con los atributos pasados por parámetros
     * @param precio Cantidad de euros que cuesta la vivienda
     * @param numHabitaciones Número de habitaciones que tiene la vivienda
     * @param superficie Número de metros cuadrados de la vivienda
     * @param parking Indica si la vivienda cuenta con plaza de parking
     * @param estado Texto descriptivo del estado actual de la vivienda
     * @param propietario Nombre del propietariod de la vivienda
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /**
     * Crea un objeto Vivienda fijando unicamente el atributo precio con el pasado por parámetro
     * @param precio Cantidad de euros que cuesta la vivienda
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Actualiza el valor del atributo precio restandole el descuento pasado por parámetro
     * @param descuento Cantidad a descontar
     */
    public void actualizarPrecio(double descuento)
    {
        this.precio = precio - descuento;
    }
    
    /**
     * Imprimer por consola el precio, número de habitaciones, superficie en m2, disponibilidad de parking, estado y propietario de la vivienda
     */
    public void imprimirVivienda(){
        System.out.println("Precio: " + this.precio);
        System.out.println("Número de habitaciones: "+ this.numHabitaciones);
        System.out.println("Superficie en m2: " + this.superficie);
        System.out.println("¿Dispone de parking?: " + this.parking);
        System.out.println("Estado: "+ this.estado);
        System.out.println("Propietario: "+ this.propietario);
    }

    /**
     * Obtiene el valor de precio
     * @return Cantidad de euros que cuesta la vivienda
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Fija el valor de precio
     * @param precio Cantidad de euros que cuesta la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el valor de numHabitaciones
     * @return Número de habitaciones que tiene la vivienda
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    /**
     * Fija el valor de numHabitaciones
     * @param numHabitaciones Número de habitaciones que tiene la vivienda
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    /**
     * Obtiene el valor de superficie
     * @return Número de metros cuadrados de la vivienda
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Fija el valor de superficie
     * @param superficie Número de metros cuadrados de la vivienda
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Obtiene el valor de parking
     * @return Indica si la vivienda cuenta con plaza de parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Fija el valor de parking
     * @param parking Indica si la vivienda cuenta con plaza de parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Obtiene el valor de estado
     * @return Texto descriptivo del estado actual de la vivienda
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Fija el valor de estado
     * @param estado Texto descriptivo del estado actual de la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el valor de propietario
     * @return Nombre del propietariod de la vivienda
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Fija el valor de propietario
     * @param propietario Nombre del propietariod de la vivienda
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}