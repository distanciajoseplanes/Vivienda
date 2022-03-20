/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @version 1.1
 * @author Paqui Elena
 */
public class Vivienda 
{
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    /**
     *
     * @param p precio de la vivienda
     * @param nh numero de habitaciones
     * @param estado estado de la casa
     * @param propietario propietario actual
     * @param parking si tiene parking o no
     */
    public Vivienda(double p, int nh,String estado,String propietario, boolean parking){
    this.precio = p;
    this.numHabitaciones = nh;
    this.estado = estado;
    this.propietario = propietario;
    this.parking = parking;
}

    /**
     *
     * @param casa devuelve lod datos
     */
    public void imprimirVivienda(Vivienda casa){
    System.out.println("Precio: " + casa.getPrecio());
        System.out.println("Número de habitaciones: "+ casa.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa.isParking());
        System.out.println("Estado: "+ casa.getEstado());
        System.out.println("Propietario: "+ casa.getPropietario());    
    }

    /**
     *
     * @param precio
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     *
     * @param descuento crea un descuento
     */
    public void actualizarPrecio(Vivienda descuento)
    {
        setPrecio(getPrecio() - getPrecio() * 0.05);
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}