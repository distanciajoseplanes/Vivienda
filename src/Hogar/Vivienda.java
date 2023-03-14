/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Daniel Valverde :D
 */
public class Vivienda {

    /** Devuelve el precio de la vivienda
     */
    public double getPrecio() {
        return precio;
    }

    /** Aquí se establece el precio de la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /** Devulve el número de habitaciones que tiene la vivienda
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /** Para establecer el número de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /** Devuelve la superficie que tiene la vivienda
     */
    public double getSuperficie() {
        return superficie;
    }

    /** Se establece la superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /** Devuelve ''true'' si la vivienda tiene parking, ''false'' si no tiene.
     */
    public boolean isParking() {
        return parking;
    }

    /** Aquí se establece si tiene o no parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /** Devuelve el estado de la vivienda
     */
    public String getEstado() {
        return estado;
    }

    /** Establece el estado de la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /** Devuelve el nombre del propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /** Establece el nombre del propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    /**  Crea una nueva instancia de la clase Vivienda con los valores de atributo especificados
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    /** El precio que tiene la vivienda */
    private double precio;
    /** EL número de habitaciones de la vivienda */
    private int numHabitaciones;
    /** La superficie de la vivienda */
    private double superficie;
    /** Si la vivienda tiene parking o no */
    private boolean parking;
    /** Establece el estado de esta*/
    private String estado;
    /** Quién es el propietario de la vivienda */
    private String propietario;
    
    
    /** Crea una nueva instancia de la clase Vivienda con un precio especificado
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /** Aplica un descuento al precio actual de la vivienda y actualiza el precio a un nuevo valor con setPrecio
     */
    public void actualizarPrecio(double descuento) 
    {
    double precioDescuento = getPrecio() - (getPrecio() * (descuento / 100));
    
    setPrecio(precioDescuento);
    }

}
