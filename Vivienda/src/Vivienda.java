/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro Martinez
 */
public class Vivienda 
{
    //atributos
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    //constructores
    public Vivienda (double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario)
    {
        this.precio = precio;
        this.numHabitaciones=numHabitaciones;
        this.superficie=superficie;
        this.parking=parking;
        this.estado=estado;
        this.propietario=propietario;
    }
    
    //getters
    
    /**
     * devuelve precio
     * @return precio
     */
    public double getPrecio(){
        return precio;
    }
    /**
     * devuelve el numero de habitaciones
     * @return numHabitaciones
     */
    public int getnumHabitaciones(){
        return numHabitaciones;
    }
    
    /**
     * devuelve la superficie
     * @return superficie
     */
    public double getSuperficie(){
        return superficie;
    }
    
    /**
     * devuelve si contiene parking(true),(false)
     * @return parking
     */
    public boolean getParking(){
        return parking;
    }
    
    /**
     * devuelve el estado
     * @return estado
     */
    public String getEstado(){
        return estado;
    }
    /**
     * devuelve el propietario
     * @return propietario
     */
    public String getPropietario(){
        return propietario;
    }
    
    //setters
    
    /**
     * actualiza el valor de la variable precio
     * @param precio 
     */
    public void setPrecio(double precio){
        this.precio=precio;
    }
    /**
     * actualiza el valor de la variable habitaciones
     * @param habitaciones 
     */
    public void setNumHabitaciones(int habitaciones){
        this.numHabitaciones=habitaciones;
    }
    /**
     * actualiza el valor de la variable 
     * @param superficie 
     */
    public void setSuperficie(double superficie){
        this.superficie=superficie;
    }
    /**
     * actualiza el valor de la variable parking
     * @param parking 
     */
    public void setParking(boolean parking){
        this.parking=parking;
    }
    /**
     * actualiza el valor de la variable estado
     * @param estado 
     */
    public void setEstado(String estado){
        this.estado=estado;
    }
    /**
     * actualiza el valor de la variable propietario
     * @param propietario 
     */
    public void setPropietario(String propietario){
        this.propietario=propietario;
    }
    
    
    //metodos
    
    /**
     * Este metodo calcula el precio con el descuento aplicado
     * @param descuento 
     * @return precio
     */
    public void actualizarPrecio(int descuento)
    {
        precio = precio - descuento;
    }
    
    /**
     * Mostrar Atributos Vivienda
     * @param a 
     */
    public void imprimirVivienda(Vivienda a){
        
        System.out.println("Precio: " + this.precio);
        System.out.println("Número de habitaciones: "+ this.numHabitaciones);
        System.out.println("Superficie en m2: " + this.superficie);
        System.out.println("¿Dispone de parking?: " + this.parking);
        System.out.println("Estado: "+ this.estado);
        System.out.println("Propietario: "+ this.propietario);
    } 
}