/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author JCabanes
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
    
 
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * (descuento / 100);
    }

    public Vivienda () {
        
    }
    
    public Vivienda(double precio, int numHabitaciones, double superficie,boolean parking,String estado,String propietario)
            
    {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    

    public static void imprimirVivienda(Vivienda casa1) {
    System.out.println("Precio: " + casa1.getPrecio());
    System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
    System.out.println("Superficie en m2: " + casa1.getSuperficie());
    System.out.println("¿Dispone de parking?: " + casa1.isParking());
    System.out.println("Estado: "+ casa1.getEstado());
    System.out.println("Propietario: "+ casa1.getPropietario());
}

    
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

}

