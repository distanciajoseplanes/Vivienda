/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Manuel
 */
public class Vivienda {
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * descuento;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean isParking() {
        return parking;
    }

    public String getEstado() {
        return estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    // Constructor
/**
 * Constructor de la clase vivienda
    * @param  precio  precio de la vivienda
    * @param  numHabitaciones habitaciones de la vivienda
    * @param  superficie superficie de la vivienda
    * @param  parking parking de la vivienda
    * @param  estado estado de la vivienda
    * @param  propietario propietario de la vivienda
*/
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario){
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    Vivienda v2 = new Vivienda(2.2,1,2.1,true,"asd","das");
}
