/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * Clase que representa una vivienda.
 */
public class Vivienda {
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    /**
   * Obtiene el precio de la vivienda.
   *
   * @return El precio de la vivienda.
   */
    public double getPrecio() {
        return precio;
    }
    /**
   * Establece el precio la vivienda.
   *
   * @param precio El precio de la vivienda.
   */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
   * Obtiene el numero de habitaciones de la vivienda.
   *
   * @return El numero de habitaciones de la vivienda.
   */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
   * Establece el número de habitaciones de la vivienda.
   *
   * @param numHabitaciones El nuevo número de habitaciones de la vivienda.
   */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
   * Obtiene la superficie de la vivienda.
   *
   * @return La superfice de la vivienda.
   */
    public double getSuperficie() {
        return superficie;
    }
    /**
   * Establece la superficie de la vivienda.
   *
   * @param superficio La superfice de la vivienda.
   */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    /**
   * Obtiene si tiene parking o no la vivienda.
   *
   * @return Si tiene parking o no la vivienda.
   */
    public boolean isParking() {
        return parking;
    }
  
    /**
   * Establece si tiene parking o no la vivienda.
   *
   * @param parking Si tiene parking o no la vivienda.
   */
    public void setParking(boolean parking) {
        this.parking = parking;
    }
     /**
   * Obtiene el estado de la vivienda.
   *
   * @return El estado de la vivienda.
   */
    public String getEstado() {
        return estado;
    }
      /**
   * Establece el estado de la vivienda.
   *
   * @param estado El estado de la vivienda.
   */
    public void setEstado(String estado) {
        this.estado = estado;
    }
     /**
   * Obtiene el propietario de la vivienda.
   *
   * @return El propietario de la vivienda.
   */
    public String getPropietario() {
        return propietario;
    }
     /**
   * Establece el propietario de la vivienda.
   *
   * @param propietario El propietario de la vivienda.
   */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
/**
   * Constructor de la clase Vivienda.
   *
   * @param superficie La superficie de la vivienda.
   * @param numHabitaciones El número de habitaciones de la vivienda.
   * @param precio El precio de la vivienda.
   * @param parking El parking de la vivienda.
   * @param estado El estado de la vivienda.
   * @param propietario El propietario de la vivienda.
   */
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