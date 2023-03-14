/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * Clase que representa una vivienda
 * @author alex
 */
public class Vivienda {
    
    private double precio; // Precio de la vivienda
    private int numHabitaciones; // Numero de habitaciones de la vivienda
    private double superficie; // Superficie de la vivienda 
    private boolean parking;// Parking de la vivienda
    private String estado; // Estado de la vivienda
    private String propietario; // Propietario de la vivienda
    
    /*
    Constructor de la clase vivienda
    @param precio 
    @param numHabitaciones de la vivienda
    @param superficie de la vivienda
    @param parking de la vivienda
    @param estado de la vivienda
    @param propietario de la vivienda  
    */
    public Vivienda (double precio,int numHabitaciones,double superficie
    ,boolean parking,String estado,String propietario){
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado= estado;
        this.propietario = propietario;
    }
    /*
    Actualiza el precio de la vivienda aplicando un descuento
    @param descuento el procentaje de descuento a aplicar
    */
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * (descuento/100);
    }
    /*
    Establece el precio de la vivienda
    @param precio nuevo precio de la vivienda
    */
    public void setprecio(double precio){
        this.precio=precio;
    }
    /*
    Obtiene el precio de la vivienda 
    @return precio de la vivienda
    */
    public double getprecio(){
        return precio;
    }
    /*
    Establece el Numero de habitaciones de la vivienda
    @param numHabitaciones nuevo Numero de habitaciones de la vivienda
    */
    public void setnumHabitaciones(int numHabitaciones){
        this.numHabitaciones=numHabitaciones;
    }
    /*
    Obtiene el Numero de habitaciones de la vivienda
    @return numHabitaciones de la vivienda
    */
    public int getnumHabitaciones(){
        return numHabitaciones;
    }
    /*
    Establece el Superficie de la vivienda 
    @param superficie nuevo superficie de la vivienda
    */
    public void setsuperficie(double superficie){
        this.superficie=superficie;
    }
    /*
    Obtiene el Superficie de la vivienda 
    @return superficie de la vivienda
    */
    public double getsuperficie(){
        return superficie;
    }
    /*
    Establece el Parking de la vivienda
    @param parking nuevo parking de la vivienda
    */
    public void setparking(boolean parking){
        this.parking=parking;
    }
    /*
    Obtiene el Parking de la vivienda
    @return parking de la vivienda
    */
    public boolean getparking(){
        return parking;
    }
    /*
    Establece el Estado de la vivienda
    @param estado nuevo estado de la vivienda
    */
    public void setestado(String estado){
        this.estado=estado;
    }
    /*
    Obtiene el Estado de la vivienda 
    @return estado de la vivienda
    */
    public String getestado(){
        return estado;
    }
    /*
    Establece el Propietario de la vivienda
    @param propietario nuevo propietario de la vivienda
    */
    public void setpropietario(String propietario){
        this.propietario=propietario;
    }
    /*
    Obtiene el Propietario de la vivienda 
    @return propietario de la vivienda
    */
    public String getpropietario(){
        return propietario;
    }
    
    
}
