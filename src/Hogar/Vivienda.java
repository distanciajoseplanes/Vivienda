/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * Esta clase muestra los parámetros de una vivienda
 * @author Miriam Cegarra Garcia
 * @author paqui
 * @version 13/13/2023/A
 */
public class Vivienda 
{
    //Atributos
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    /**
     * Constructor para la clase vivienda
     * @param precio El parámetro precio define el valor de la vivienda en euros
     * @param numHabitaciones El parámetro numHabitaciones define el número de habitaciones de la vivienda
     * @param superficie El parámetro superficie define la superficie en metros cuadrados de la vivienda
     * @param parking El parámetro parking define si la vivienda dispone de parking o no 
     * @param estado El parámetro estado define el estado actual de la vivienda
     * @param propietario El parámetro propietario define el nombre del propietario de la vivienda
     */
    
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
    

    /**
     * Constructor que solo permite introducir el precio
     * @param precio El parámetro precio define el valor de la vivienda en euros
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    //Métodos getter y setter   
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
    
    /**
     * Método que calcula el precio final de la vivienda restándole un descuento
     * @param descuento El parámetro descuento es el porcentaje que se desea restar al precio total de la vivienda
     */
    public void actualizarPrecio(int descuento)
    {
        precio = precio - precio * descuento/100;
    }
    
    /**
     * Método que imprime por pantalla los datos de la vivienda
     * @param casa El parámetro casa representa los datos de la vivienda
     */
    public void imprimirVivienda(Vivienda casa)
    {
        System.out.println("Precio: " + casa.precio);
        System.out.println("Número de habitaciones: "+ casa.numHabitaciones);
        System.out.println("Superficie en m2: " + casa.superficie);
        System.out.println("¿Dispone de parking?: " + casa.parking);
        System.out.println("Estado: "+ casa.estado);
        System.out.println("Propietario: "+ casa.propietario);
    }
    
}
