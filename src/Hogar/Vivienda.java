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

    /**
     * @return the precio
     */
    private double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    private void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones
     */
    private int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    private void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie
     */
    private double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    private void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     */
    private boolean isParking() {
        return parking;
    }

    /**
     * @param parking the parking to set
     */
    private void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return the estado
     */
    private String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    private void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the propietario
     */
    private String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    private void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    public double precio;
    public int numHabitaciones;
    public double superficie;
   public boolean parking;
  public String estado;
   public String propietario;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * 0.05);
    }
    
}
