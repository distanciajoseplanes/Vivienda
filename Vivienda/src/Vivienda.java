/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena Jaime Gomez
 * @version 0.2 20/03/2022
 * @see Hogar
 */
public class Vivienda  
{

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio Precio a cambiar
     */
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

    /**
     * @return Numero de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones Numero de habitaciones a modificar
     */
    
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return Superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie Superficie a cambiar
     */
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return Parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking Indicar si tiene o no parking
     */
    
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return Estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado Modificar el estado
     */
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return Propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario Modificar el propietario
     */
    
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /**
     *
     * @param precio
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     *
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario
     */
    public Vivienda (double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario)
    {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado =  estado;
        this.propietario = propietario;
        
    }

    /**
     *
     * @param descuento Descuento que se aplica
     */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
}