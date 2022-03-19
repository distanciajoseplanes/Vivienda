
/**
 *
 * @author Pedro José Hernández Nicolás
 * 
 * Crea un nuevo constructor de la clase  Vivienda que reciba todos los parámetros de la clase.
 * 
 */

public class Vivienda 
{
    /**
     * @param precio La cantidad de euros que cuesta cada una de las viviendas
     * @param numHabitaciones El número de habitaciones que tienen las viviendas
     * @param superficie El número de metros cuadrados que miden las viviendas
     * @param parking Dice si la vivienda cuenta con parking o no
     * @param estado Estado actual de las viviendas
     * @param propietario Nombre y apellidos de los propietarios de las viviendas
     */
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /**
     * Este constructor nos permite crear un objeto llamado vivienda, con un unico atributo, que sera precio
     * @param precio La cantida de euros que cuesta cada una de las viviendas 
     */
   
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Este constructor nos permite crear un obbjeto llamado vivienda, el cual esta compuesto por todos los atributos y valores
     * @param precio La cantidad de euros que cuesta cada una de las viviendas
     * @param numHabitaciones El número de habitaciones que tienen las viviendas
     * @param superficie El número de metros cuadrados que miden las viviendas
     * @param parking Dice si la vivienda cuenta con parking o no
     * @param estado Estado actual de las viviendas
     * @param propietario Nombre y apellidos de los propietarios de las viviendas
     */
    
    public Vivienda (double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
        
    }
    
    /**
     * Metodo que devuelve el precio de la vivienda
     * @return precio La cantidad de euros que cuesta cada una de las viviendas
     */
    
    public double GetPrecio () {
        return precio;
    }
    
    /**
     * Metodo que devuelve el número de habitaciones que tiene la vivienda
     * @return numHabitaciones El número de habitaciones que tienen las viviendas
     */
    
    public int GetNumHabitaciones () {
        return numHabitaciones;
    }
    
    /**
     * Metodo que devuelve la superficie que tiene la vivienda
     * @return superficie El número de metros cuadrados que miden las viviendas
     */
    
    public double GetSuperficie () {
        return superficie;
    }
    
    /**
     * Metodo que indica si la vivienda tiene parking o no
     * @return parking Dice si la vivienda cuenta con parking o no
     */
    
    public boolean GetParking () {
        return parking;
    }
    
    /**
     * Metodo que indica el estado de la vivienda
     * @return estado Estado actual de las viviendas
     */
    
    public String GetEstado () {
        return estado;
    }
    
    /**
     * Metodo que devuelve la información personal del propietario de la vivienda
     * @return propietario Nombre y apellidos de los propietarios de las viviendas
     */
    
    public String GetPropietario () {
        return propietario;
    }
    
    /**
     * Metodo que modifica el precio de la vivienda
     * @param precio La cantidad de euros que cuesta cada una de las viviendas
     */
    
    public void SetPrecio (double precio) {
        this.precio = precio;
    }
    
    /**
     * Metodo que modifica el número de habitaciones que tiene la vivienda
     * @param numHabitaciones El número de habitaciones que tienen las viviendas
     */
    
    public void SetNumHabitaciones (int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    /**
     * Metodo que modifica la superficie que tiene la vivienda
     * @param superficie El número de metros cuadrados que miden las viviendas
     */
    
    public void SetSuperficie (double superficie) {
        this.superficie = superficie;
    }
    
    /**
     * Metodo que modifica si la vivienda tiene parking o no
     * @param parking Dice si la vivienda cuenta con parking o no
     */
    
    public void SetParking (boolean parking) {
        this.parking = parking;
    }
    
    /**
     * Metodo que modifica el estado de la vivienda
     * @param estado Estado actual de las viviendas
     */
    
    public void SetEstado (String estado) {
        this.estado = estado;
    }
    
    /**
     * Metodo que modifica la información personal del propietario de la vivienda
     * @param propietario Nombre y apellidos de los propietarios de las viviendas
     */
    
    public void SetPropietario (String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * Este constructor nos permite realizar el descuento de un precio, realizando los siguientes calculos
     * @param descuento descuento que se le aplica al precio de la vivienda
     */
    
    public void actualizarPrecio(double descuento)
    {
        precio = precio - ((descuento / 100) * precio);
    }
    
    /**
     * Este constructor nos permite imprimir todos los datos relacionados con una vivienda, utilizando los siguientes atributos
     * @param casa1 Vivienda nos indicara la información de la vivienda
     */
    
    public static void ImprimirVivienda(Vivienda casa1) {
        
        System.out.println("Precio: "+casa1.GetPrecio());
        System.out.println("Número de habitaciones: "+casa1.GetNumHabitaciones());
        System.out.println("Superficie en m2: "+casa1.GetSuperficie());
        System.out.println("¿Dispone de parking?: "+casa1.GetParking());
        System.out.println("Estado: "+casa1.GetEstado());
        System.out.println("Propietario: "+casa1.GetPropietario());
        
    }
}