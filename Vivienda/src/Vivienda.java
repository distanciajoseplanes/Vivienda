/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Vivienda 
{
    /**
     * @author Alvaro Camacho Gomez
     * @version: v0.1 git marzo_2022
     */
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    private double descuento = precio * 0.05;
    
    // nuevo constructor de vivienda que recibe todos los parametros
    
    public Vivienda(double prec, int numhab, double superf, boolean park, String estad, String propiet) {
        this.precio = prec;
        this.numHabitaciones = numhab;
        this.superficie = superf;
        this.parking = park;
        this.estado = estad;
        this.propietario = propiet;
        
    }
    
    // metodos getters
    
    public double getPrecio() {
        return this.precio;        
    }
    
    public int getNumHabitaciones() {
        return this.numHabitaciones;
    }
    
    public double getSuperficie() {
        return this.superficie;
    }
    
    public boolean getParking() {
        return this.parking;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    public String getPropietario() {
        return this.propietario;
    }
    
    // metodos setters 
    
    public void setPrecio(double prec) {
        this.precio = prec;
    }
    
    public void setNumHabitaciones(int numhab) {
        this.numHabitaciones = numhab;
    }
    
    public void setSuperficie(double superf) {
        this.superficie = superf;
    }
    
    public void setParking(boolean park) {
        this.parking = park;
    }
    
    public void setEstado(String estad) {
        this.estado = estad;
    }
    
    public void setPropietario(String propiet) {
        this.propietario = propiet;
    }
            
            
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio()
    {
        precio = precio - descuento; // hemos creado la variable descuento del 5% que era lo que había antes para refactorizar el codigo sin alterar los resultados
    }
    
    public static void imprimirVivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario)
    {
        System.out.println("Precio: " + precio);
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Superficie en m2: " + superficie);
        System.out.println("¿Dispone de parking?: " + parking);
        System.out.println("Estado: " + estado);
        System.out.println("Propietario: "+ propietario);
    }
}