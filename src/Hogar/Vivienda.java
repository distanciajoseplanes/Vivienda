/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * Clase Vivienda, se utiliza para crear y leer viviendas de una Base de Datos
 * 
 * @version 0.2
 * @author paqui
 * @since 0.1
 */
public class Vivienda {
    
    /**
     * Atributo precio. Tipo double
     */
    private double precio;
    /**
     * Atributo número de habitaciones. Tipo entero
     */
    private int numHabitaciones;
    /**
     * Atributo superficie. Tipo double
     */
    private double superficie;
    /**
     * Atributo parking. Tipo boolean
     */
    private boolean parking;
    /**
     * Atributo estado. Tipo cadena
     */
    private String estado;
    /**
     * Atributo propietario. Tipo cadena
     */
    private String propietario;
    
    
    /**
     * Constructor con 6 parámetros
     * Crea objetos de la clase vivienda con precio, número de habitaciones, superficie, disponibilidad de plaza de parking, estadoo y nombre del/la propietario/a
     * 
     * @param precio Precio de la vivienda
     * @param numHabitaciones Número de habitaciones de la vivienda
     * @param superficie Superficie de la vivienda
     * @param parking Indica si la vivienda incluye parking
     * @param estado Indica el estado de la vivienda
     * @param propietario Nombre del/la propietario/a de la vivienda
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
     * Crea objetos de la clase vivienda con el precio de la vivienda
     * 
     * @param precio 
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    
    /**
     * Actualiza el precio de la vivienda acorde a un descuento introducido
     * 
     * @param descuento se multiplicará por el precio actual para restarle la cantidad resultante
     */
    public void actualizarPrecio(float descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
}
