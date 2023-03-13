/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**Clase creada para crear las viviendas que tendremos en venta en nuestra web inmobiliaria
 *
 * @author paqui
 */
public class Vivienda {

//Propiedades básica de la Clase Vivienda    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
 
/*Metodo para asignar precio a la vivienda
 *   
 */   
    public Vivienda (double precio)
    {
        this.precio = precio;
    }

/*Metodo para asignar valor a cada una de las propiedades de la vivienda
 *   
 */ 
    
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
/* Metodo para ver el valor actual de precio
 *   
 */ 
    public double getPrecio() {
        return precio;
    }

/* Metodo para ver el número de habitaciones de la vivienda
 *   
 */     
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

/* Metodo para ver las dimensiones de la vivienda
 *   
 */     
    public double getSuperficie() {
        return superficie;
    }

/* Metodo para saber si la vivienda dispone de garaje
 * Nos devolvera true o false  
 */     
    public boolean isParking() {
        return parking;
    }

/* Metodo para saber si la vivienda en nueva o de segunda mano
 *   
 */ 
    public String getEstado() {
        return estado;
    }

/* Metodo para ver los datos del propietario de la vivienda
 *   
 */     
    public String getPropietario() {
        return propietario;
    }

/* Metodo que nos permite modificar el precio de la vivienda
 *   
 */     
    public void setPrecio(double precio) {
        this.precio = precio;
    }

/* Metodo que nos permite modificar el número de habitaciones de la vivienda
 *   
 */      
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

/* Metodo que nos permite modificar las dimensiones de la vivienda
 *   
 */  
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
/* Metodo que nos permite modificar si la vivienda tiene garaje o no
 *   
 */  
    public void setParking(boolean parking) {
        this.parking = parking;
    }

/* Metodo que nos permite modificar el estado de la vivienda
 *   
 */      
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
/* Metodo que nos permite modificar los datos del propietario de la vivienda
 *   
 */  
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

/* Metodo que nos permite modificar el precio de la vivienda aplicandole un descuento
 *   
 */      
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * (descuento/100));
    }
    
    
}
