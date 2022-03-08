/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase contiene los atributos y metodos de una Vivienda
 * @see Vivienda
 * @author Oscar Sanchez
 */
public class Vivienda 
{
    /**
     * valore de una vivienda
    */
    private double precio;
    
    /**
     * Numero de habitaciones de la vivienda
    */
    private int numHabitaciones;
    
    /**
     * superficie de la vivienda
    */
    private double superficie;
    
    /**
     * atributo que indica si la vivienda tiene parking
    */
    
    private boolean parking;
    
    /**
     * estado de la vivienda
    */
    
    private String estado;
    
    /**
     * Propietario de la vivienda
    */
    private String propietario;
    
    /**
    Metodo constructor parametrizado
     * @param pvp Precio de la vivienda
     * @param numRoom Numero de habitaciones de la vivienda
     * @param area Superficie de la vivienda
     * @param park Indica si la vivienda tiene parking
     * @param state Numero de empleado
     * @param prop Numero de empleado
    */
    
    public Vivienda(double pvp, int numRoom, double area, boolean park, String state, String prop)
    {
         this.precio = pvp;
         this.numHabitaciones = numRoom;
         this.superficie = area;
         this.parking = park;
         this.estado = state;
         this.propietario = prop;   
    }
    
    /**
    Metodo constructor con solo un valor "Precio"
     * @param precio Nombre del empleado
    */
    
    public Vivienda(double precio)
    {
        this.precio = precio;
    }
    
    /**
    Metodo que actualiza el precio aplicando un descuento
    * 
     * @param descuento aplica un descuento introducido como parametro
    */
    
    public void actualizarPrecio(double descuento)
    {
        precio -= precio * descuento;
    }
    
    /**
    Metodo que devuelve el precio de la vivienda
    * 
     * @return precio devuelve el precio de la vivienda
    */

    public double getPrecio() {
        return precio;
    }
    
    /**
    Metodo modifica precio de la vivienda
    * 
     * @param precio es el nuevo precio de la vivienda
    */

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
    Metodo devuelve el numero de habitaciones
    * 
     * @return numHabitaciones devuelve el nuevo numero de habitaciones
    */

    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    /**
    Metodo modifica el numero de habitaciones
    * 
     * @param numHabitaciones es el nuevo numero de habitaciones
    */

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    /**
    Metodo devuelve la superficie de la casa
    * 
     * @return superficie devuelve la superficie de la casa
    */
    
    public double getSuperficie() {
        return superficie;
    }
    
     /**
    Metodo modifica la superficie de la casa
    * 
     * @param superficie es la nueva superficie de la casa
    */

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    /**
    Metodo devuelve si la casa tiene parking
    * 
     * @return parking devuelve si la casa tiene parking o no
    */

    public boolean isParking() {
        return parking;
    }
    
     /**
    Metodo modifica si la casa tiene parking
    * 
     * @param parking indica si la casa tiene parking o no
    */

    public void setParking(boolean parking) {
        this.parking = parking;
    }
    
    /**
    Metodo devuelve el estado de la casa
    * 
     * @return estado devuelve el estado de la casa
    */

    public String getEstado() {
        return estado;
    }
    
    /**
    Metodo modifica el estado de la casa
    * 
    * @param estado es el nuevo estado de la casa
    */

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
    Metodo devuelve el propietario de la casa
    * 
     * @return propietario devuelve el propietario de la casa
    */

    public String getPropietario() {
        return propietario;
    }
    
    /**
    Metodo modifica el propietario de la casa
    * 
    * @param propietario es el nuevo propietario de la casa
    */

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
    Metodo que imprime todos los atributos de una vivienda introducida como parametro
    * 
    * @param casa1 es la vivienda de la cual se quiere imprimir sus parametros
    */

    
    public static void imprimirVivienda(Vivienda casa1) {
         System.out.println("Precio: " + casa1.getPrecio());
         System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
         System.out.println("Superficie en m2: " + casa1.getSuperficie());
         System.out.println("¿Dispone de parking?: " + casa1.isParking());
         System.out.println("Estado: "+ casa1.getEstado());
         System.out.println("Propietario: "+ casa1.getPropietario());
     }
    
}