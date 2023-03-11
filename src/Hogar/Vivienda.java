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
public final class Vivienda {
    
    double precio;
    int numHabitaciones;
    double superficie;
    boolean parking;
    String estado;
    String propietario;

public void setPrecio(double precio) {
    this.precio = precio;}

public void setNumHabitaciones(int numHabitaciones) {
    this.numHabitaciones = numHabitaciones;}

public void setSuperficie(double superficie) {
    this.superficie = superficie;}

public void setParking(boolean parking) {
    this.parking = parking;}

public void setEstado(String estado) {
    this.estado = estado;}

public void setPropietario(String propietario) {
    this.propietario = propietario;}
   

public double getPrecio() {
    return precio;}

public int getNumHabitaciones() {
    return numHabitaciones;}

public double getSuperficie() {
    return superficie;}

public boolean isParking() {
    return parking;}

public String getEstado() {
    return estado;}

public String getPropietario() {
    return propietario;}  

public Vivienda(int numHabitaciones) {
    this.setPrecio(precio);
    this.setNumHabitaciones(numHabitaciones);
    this.setSuperficie(superficie);
    this.setParking(parking);
    this.setEstado(estado);
    this.setPropietario(propietario);
}


    Vivienda() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void actualizarPrecio(double descuento){
       this.precio = this.precio - (this.precio * descuento / 100);
    }
    
}
