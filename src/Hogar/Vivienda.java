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
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    
    
    
    
    
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * descuento;
    }
      public void imprimirVivienda(double precio, int habitaciones, double superficie, boolean parking, String estado, String propitario) {
    
          System.out.println("El precio de la casa es: $" + precio);
          System.out.println("Número de habitaciones: " + habitaciones);
          System.out.println("La superficie de la casa es: "+superficie);
          if (parking==true) System.out.println("La casa tiene parking"); 
          else System.out.println("La casa no tiene parking");
          System.out.println("El estado de la casa es: "+estado);
          System.out.println("EL propietario de la casa es: "+propietario);
          
  }
}
