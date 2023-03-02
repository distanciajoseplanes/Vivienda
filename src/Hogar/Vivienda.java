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
    
    /* Hacemos los atributos privados */
    double precio;
    int numHabitaciones;
    double superficie;
    boolean parking;
    String estado;
    String propietario;
    
    /* Constructor */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String perfecto, String rafael) {
      this.precio = precio;
      this.numHabitaciones = numHabitaciones;
      this.superficie = superficie;
      this.parking = parking;
      this.estado = estado;
      this.propietario = propietario;
    }

    /* Getters y Setters */
    public void setPrecio(double precio){
      this.precio = precio;
    }

    public double getPrecio() {
      return precio;
    }

    public void setNumHabitaciones(int numHabitaciones){
      this.numHabitaciones = numHabitaciones;
    }

    public int getNumHabitaciones() {
      return numHabitaciones;
    }

    public void setSuperficie(double superficie){
      this.superficie = superficie;
    }

    public double getSuperficie() {
      return superficie;
    }

    public void setParking(boolean parking){
      this.parking = parking;
    }

    public boolean getParking() {
      return parking;
    }

    public void setEstado(String estado){
      this.estado = estado;
    }

    public String getEstado() {
      return estado;
    }

    public void setPropietario(String propietario){
      this.propietario = propietario;
    }

    public String getPropietario() {
      return propietario;
    }

    /* actualiza el precio multiplicando por un descuento */ 
    /* descuento debe tener un valor como "0.05" para un 5% de descuento */
    public void actualizarPrecio(float descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
}
