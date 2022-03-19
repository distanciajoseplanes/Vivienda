/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase Vivienda
 * 
 * Contiene información de cada vivienda
 * 
 * @author Jose Maria Puertas
 * @version 2.0
 */
public class Vivienda 
{
    /**
     * Precio de la vivienda
     */
    private double precio;
    /**
    * Número de habitaciones de la vivienda
    */
    private int numHabitaciones;
    /**
     * Superficie total de la vivienda en m2
     */
    private double superficie;
    /**
     * Dispone o no de parking la vivienda
     */
    private boolean parking;
    /**
     * Estado de conservación en el que se encuentra la vivienda: Bueno, Normal, Regular, Malo o Ruinoso
     */
    private String estado;
    /**
     * Nombre y apellidos del propietario de la vivienda
     */
    private String propietario;
    /**
    * Constructor de la clase Vivienda donde se le introducen todos los parametros
    * @param precio precio de la vivienda en euros
    * @param numHabitaciones número de habitaciones incluidos baños, cocinas, comedor, etc.
    * @param superficie superficie total de la vivienda en metros cuadrados
    * @param parking si dispone de parking o no
    * @param estado estado de conservación el que se encuentra la vivienda
    * @param propietario Nombre y apellidos del titular de la vivienda
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
     * Construtor de la clase Vivienda donde solo se le introduce el nuevo valor del precio
     * @param precio precio de la vivienda en euros
     */    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /**
     * Este metodo aplica un descuento sobre el precio original
     * @param descuento porcentaje en tanto por uno a restar del precio actual
     */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
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
}