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
/**
 *Con la clase Vivienda se hace una descripción de las características
 *de una vivienda, incluyendo entre sus atributos el precio, número de
 * habitaciones, superficie, si tiene plaza de aparcamiento, el estado en
 * que se encuentra y el nombre del propietario.
 */
public class Vivienda {
    /**
     * Precio de la vivienda
     */
    private double precio;
    /**
     * Número de habitaciones
     */
    private int numHabitaciones;
    /**
     * Superficie habitable
     */
    private double superficie;
    /**
     * Disponibilidad de plaza de aparcamiento
     */
    private boolean parking;
    /**
     * Estado en el que se encuentra la vivienda
     */
    private String estado;
    /**
     * Nombre del propietario
     */
    private String propietario;
    
    /**
     * Constructor con todos los atributos de la clase
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
     * Constructor que solo recibe como parámetro el atributo precio
     * @param precio 
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Método que aplica un descuento al precio inicial
     * @param descuento 
     */
    public void actualizarPrecio(float descuento)
    {
        setPrecio(getPrecio() - descuento);
    }

    /**
     * Método get del atributo precio
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método get del atributo numHabitaciones
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Método get del atributo superficie
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Método booleano que devuelve true si la vivienda tiene parking y false si no la tiene
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Método get del atributo estado
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método get del atributo propietario
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Método set para cambiar el precio
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método set para cambiar el número de habitaciones
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Método set para cambiar la superficie
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Método set para cambiar el atributo parking
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Método set para cambiar el estado de la vivienda
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método set para cambiar el propietario
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
