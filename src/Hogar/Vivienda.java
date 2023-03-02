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
    
    public Vivienda(double precio, int numHabitaciones, double superficie,boolean parking, String estado, String propietario)
    {
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
    
    public void imprimirVivienda()
    {
        System.out.println("Precio: " + this.precio);
        System.out.println("Número de habitaciones: "+ this.numHabitaciones);
        System.out.println("Superficie en m2: " + this.superficie);
        System.out.println("¿Dispone de parking?: " + this.parking);
        System.out.println("Estado: "+ this.estado);
        System.out.println("Propietario: "+ this.propietario);
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public int getNumHabitaciones(){
        return numHabitaciones;
    }
    
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    public double getSuperficie(){
        return superficie;
    }
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    public boolean getParking(){
        return parking;
    }
    
    public void setParking(boolean parking) {
        this.parking = parking;
    }   

    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }  

    public String getPropietario(){
        return propietario;
    }
    
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }           
}
