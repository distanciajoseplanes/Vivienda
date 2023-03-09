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
public class Vivienda {
    
    /**La clase Vivienda replica las características de una vivienda real, y con 
     * sus métodos nos permitirá manejar información relativa a una vivienda.
     */

    double precio;
    int numHabitaciones;
    double superficie;
    boolean parking;
    String estado;
    String propietario;
    
    /**
     *Método constructor. Acepta:
     * @param precio
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }

    /**
     *Método constructor. Acepta:
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
     * Método getter para acceder a los atributos privados.
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método setter para modificar los atributos privados.
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método getter para acceder a los atributos privados.
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Método setter para modificar los atributos privados.
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Método getter para acceder a los atributos privados.
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Método setter para modificar los atributos privados.
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Método equals para comprobar si la vivienda tiene parking o no.
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Método setter para modificar los atributos privados.
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Método getter para acceder a los atributos privados.
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método setter para modificar los atributos privados.
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método getter para acceder a los atributos privados.
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Método setter para modificar los atributos privados.
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
   
    /**
     * Método que facilita la actualización del precio de acuerdo al descuento
     * introducido.
     * @param descuento
     */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
}
