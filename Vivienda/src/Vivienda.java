/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 * @author Silvia
 * @version 2.0
 */
public class Vivienda 
{   
    /**
    * Precio de la vivienda
    */
    private double precio;
    /**
    * Número de habitaciones que tiene la vivienda
    */
    private int numHabitaciones;
    /**
    * Superficie de la vivienda
    */
    private double superficie;
    /**
     * Atributo de tipo booleano que indica si la vivienda tiene parking (true) o no lo tiene (false)
     */
    private boolean parking;
    /**
     * Estado de la vivienda
     */
    private String estado;
    /**
     * Propietario de la vivienda
     */
    private String propietario;
    
    /**
     * Constructor a través del cual se crea un objeto de la clase vivienda, con todos sus atributos,
     * tomando como valores para los atributos los que se insertan en los parámetros de entrada del constructor.
     * 
     * @param precio precio de la vivienda
     * @param numHabitaciones número de habitaciones de la vivienda
     * @param superficie superficie de la vivienda
     * @param parking atributo que indica si tiene parking (true) o no lo tiene (false)
     * @param estado estado de la vivienda
     * @param propietario propietario de la vivienda
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
     * Método que devuelve el precio de la vivienda
     * @return precio: precio de la vivienda
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que permite modificar el valor del atributo precio de la vivienda
     * @param precio precio nuevo de la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve el número de habitaciones de la vivienda
     * @return numHabitaciones: nuevo número de habitaciones de la vivienda
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Método que permite modificar el número de habitaciones de la vivienda
     * @param numHabitaciones nuevo número de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Método que devuelve el valor de la superficie de la vivienda
     * @return superficie: superficie de la vivienda
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Método que permite modificar el valor del atributo superficie de la vivienda
     * @param superficie nuevo valor de superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Método que devuelve si una vivienda tiene o no tiene parking
     * @return si la vivienda tiene o no tiene parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Método que permite modificar el valor de parking, si la vivienda tiene o no parking
     * @param parking nuevo valor booleano de parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Método que devuelve el estado de la vivienda
     * @return estado: estado de la vivienda
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método que permite modificar el estado de la vivienda
     * @param estado: estado nuevo de la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método que devuelve el propietario de la vivienda
     * @return propietario: propietario de la vivienda
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Método que permite modificar el propietario de la vivienda
     * @param propietario: nuevo propietario de la vivienda
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * Constructor a través del cual se crea un objeto de la clase vivienda que tendrá un único atributo
     * que es el precio que insertaremos como parámetro de entrada
     * 
     * @param precio: precio de la vivienda
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /**
     * Método que permite acutalizar el precio realizando sobre él un descuento que se corresponde al valor que
     * se insertará como parámetro de entrada
     * @param descuento: valor que corresponde al porcentaje de descuento que queremos aplicar al precio 
     */
    public void actualizarPrecio(int descuento)
    {   
        setPrecio(getPrecio() - getPrecio() * descuento /100);        
    }
    
    /**
     * Método que permite imprimir todos los datos del objeto de la clase vivienda que se le pase como parámetro
     * @param casa1: objeto de la clase Vivienda del que queremos imprimir los datos
     */
    
    public static void imprimirVivienda(Vivienda casa1) {
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("N\u00famero de habitaciones: " + casa1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getSuperficie());
        System.out.println("\u00bfDispone de parking?: " + casa1.isParking());
        System.out.println("Estado: " + casa1.getEstado());
        System.out.println("Propietario: " + casa1.getPropietario());
    }
}