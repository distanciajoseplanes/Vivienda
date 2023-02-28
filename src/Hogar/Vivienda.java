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

    /** LA CLASE VIVIENDA
     * La clase vivienda incluye atributos que describen al objeto vivienda, que refleja las propiedades de una vivienda en el mundo real.ç
     * Por ejemplo, incluye datos físicos como la superficie o el numero de habitaciones, o intangibles como el precio o el propietario de la vivienda. 
     */
    
    
    /**
     * ATRIBUTOS DE LA CLASE VIVIENDA
     * @param precio - hace referencia al valor de la vivienda
     * @param numHabitaciones - determina el número de habitaciones de la vivienda
     * @param superficie - determina la superficie de la vivienda, acepta decimales
     * @param parking - informa de si la vivienda dispone de parking (booleano)
     * @param estado - describe el estado de conservación de la vivienda
     * @param propietario - describe el nombre del propietario de la vivienda
     */
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    /**
     * CONSTRUCTOR DE LA CLASE VIVIENDA QUE INCLUYE TODOS LOS ATRIBUTOS
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
     * CONSTRUCTOR DE VIVIENDA QUE SOLO INCLUYE PRECIO
     */
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Metodo getter para precio
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo setter para precio
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo getter para numHabitaciones
     * @return numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Metodo setter para numHabitaciones
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Metodo getter para superficie
     * @return superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Metodo setter para superficie
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Metodo getter para parking
     * @return parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Metodo setter para parking
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Metodo getter para estado
     * @return estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo setter para estado
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Metodo getter para propietario
     * @return propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Metodo setter para propietario
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    /**
     * Metodo actualizarPrecio
     * Permite modificar el precio de la vivienda usando un descuento como parámetro de entrada
     * @param descuento  - puede tener decimales, y se expresa como ratio de un porcentaje, es decir 5% = 0.05.
     */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
}
