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
    
    public Vivienda (double precio,int numHabitaciones,double superficie
    ,boolean parking,String estado,String propietario){
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado= estado;
        this.propietario = propietario;
    }
    
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * (descuento/100);
    }
    public void setprecio(double precio){
        this.precio=precio;
    }
    public double getprecio(){
        return precio;
    }
    public void setnumHabitaciones(int numHabitaciones){
        this.numHabitaciones=numHabitaciones;
    }
    public int getnumHabitaciones(){
        return numHabitaciones;
    }
    public void setsuperficie(double superficie){
        this.superficie=superficie;
    }
    public double getsuperficie(){
        return superficie;
    }
    public void setparking(boolean parking){
        this.parking=parking;
    }
    public boolean getparking(){
        return parking;
    }
    public void setestado(String estado){
        this.estado=estado;
    }
    public String getestado(){
        return estado;
    }
    public void setpropietario(String propietario){
        this.propietario=propietario;
    }
    public String getpropietario(){
        return propietario;
    }
    
    
}
