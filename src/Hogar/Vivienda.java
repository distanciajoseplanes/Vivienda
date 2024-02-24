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
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }

    public Vivienda(double precio, int numHabitaciones, double superficie,
                    boolean parking, String estado, String propietario) 
    {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
            
    public double getPrecio() {
        return precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean isParking() {
        return parking;
    }

    public String getEstado() {
        return estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    
    public double actualizarPrecio(double descuento)
    { 
        return precio - (precio * descuento/100);
    }
    
    public void imprimirVivienda()
    {
        System.out.println("Precio: " + precio);
        System.out.println("Número de habitaciones: "+ numHabitaciones);
        System.out.println("Superficie en m2: " + superficie);
        System.out.println("¿Dispone de parking?: " + parking);
        System.out.println("Estado: "+ estado);
        System.out.println("Propietario: "+ propietario);
    }
    
}
