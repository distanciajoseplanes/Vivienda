/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/** 
 * Clase Vivienda
 * Este metodo sirve para definir caracteristicas de las viviendas que vamos a vender
 * como pueden ser: precio, numero de habitaciones, superficie de la vivienda,
 * si tiene parking  o no, el estado en el que se encuentra y el nombre del propietario.
 * Tambien consta de 2 metodos mas: vivienda y actualizar precio(en caso de descuento.)
 * 
 *
 * @author paqui
 */
public class Vivienda {

    /**
     * Este metodo sirve para obtener el precio.
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Este metodo sirve para cambiar el atributo precio.
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Este metodo sirve para obtener el número de Habitaciones.
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * Este metodo sirve para cambiar el atributo numero de habitaciones.
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
     * Este metodo sirve para obtener la superficie.
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }
    /**
     * Este metodo sirve para cambiar el atributo superficie de la vivienda.
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
     * Este metodo sirve para cambiar el atributo parking.
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    /**
     * Este metodo sirve para obtener el estado de la vivienda.
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }
    /**
     * Este método sirve para cambiar el atributo del estado de la vivienda.
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Este metodo sirve para obtener el propietario de la vivienda.
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }
    /**
     * Este metodo sirve para cambiar el atributo propietario.
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * El siguiente bloque de codigo es el constructor de esta clase
     * con el que podemos crear diferentes instancias de esta clase 
     * con los siguientes atributos.
     * 
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario 
     */

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    /**
     * El siguiente bloque de codigo tenemos los atributos  de la clase que tienen acceso privado
     * y solo se puede acceder a ellos a traves de los metodos setters and getters anteriores.
     */
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /**
     * El metodo siguiente define el precio de la vivienda a traves del 
     * parametro precio.
     * @param precio 
     */
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * El metodo actualizar precio, es uno de los metodos refactorizados en el cual
     * se cambio el descuento fijo del 5, a un descuento introducido como parametro del metodo, 
     * y sirve para calcular el precio con el descuento aplicado.
     * @param descuento 
     */
    
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() *(descuento/100));
    }
    
}
