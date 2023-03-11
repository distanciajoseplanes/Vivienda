/**
 * La clase Vivienda representa una vivienda con atributos como el precio, número de habitaciones,
 * superficie, si tiene parking, su estado y propietario.
 */
package Hogar;

/**
 *
 * @author JCabanes
 */
public class Vivienda {
    
     /**
     * El precio de la vivienda.
     */
    private double precio;
    
     /**
     * El número de habitaciones de la vivienda.
     */
    private int numHabitaciones;
     /**
     * La superficie en metros cuadrados de la vivienda.
     */
    private double superficie;
     /**
     * Indica si la vivienda tiene parking o no.
     */
    private boolean parking;
     /**
     * El estado de la vivienda.
     */
    private String estado;
     /**
     * El propietario de la vivienda.
     */
    private String propietario;
    
    /**
     * Crea una instancia de la clase Vivienda con un precio.
     * @param precio El precio de la vivienda.
     */
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
     /**
     * Actualiza el precio de la vivienda aplicando un descuento.
     * @param descuento El porcentaje de descuento a aplicar al precio actual.
     */
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * (descuento / 100);
    }
    //Constructores
    /**
     * Se establecen tres constructores, uno vacío para simplemente inicilizar el objeto, un segundo con un precio especificado y un tercero con todas las propiedades
     * 
     */
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
    
    // IMPRIMIR VIVIENDA
    
    /**
     * Imprime todas la información del objeto casa1
     * @param casa1 - Objeto de la clase Vivienda
     */
    public static void imprimirVivienda(Vivienda casa1) {
    System.out.println("Precio: " + casa1.getPrecio());
    System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
    System.out.println("Superficie en m2: " + casa1.getSuperficie());
    System.out.println("¿Dispone de parking?: " + casa1.isParking());
    System.out.println("Estado: "+ casa1.getEstado());
    System.out.println("Propietario: "+ casa1.getPropietario());
}
    // GETTERS Y SETTERS
    
    /**
     * SE ESTABLECEN LOS GETTERS Y SETTERS DE CADA VARIABLE
     * @return Getters y setters de las variables de clase.
     */
    
     /**
     * Obtiene el precio de la vivienda.
     * @return El precio actual de la vivienda.
     */
    
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Establece el precio de la vivienda.
     * @param precio El nuevo precio de la vivienda.
     */
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     * Obtiene el número de habitaciones de la vivienda.
     * @return El número de habitaciones de la vivienda.
     */
    
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    /**
     * Establece el número de habitaciones de la vivienda.
     * @param numHabitaciones El nuevo número de habitaciones.
     */
    
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    
    /**
     * Obtiene la superficie en metros cuadrados de la vivienda.
     * @return La superficie en metros cuadrados de la vivienda.
     */
    
    public double getSuperficie() {
        return superficie;
    }
    
    /**
     * Establece la superficie en metros cuadrados de la vivienda.
     * @param superficie La nueva superficie de la vivienda.
     */
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    
    /**
     * Indica si la vivienda tiene parking o no.
     * @return true si la vivienda tiene parking, false si no lo tiene.
     */
    
    public boolean isParking() {
        return parking;
    }
    
    /**
     * Establece si la vivienda tiene parking o no.
     * @param parking true si la vivienda tiene parking, false si no lo tiene.
     */
    
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    
/**
 * Devuelve el estado de la vivienda.
 * @return El estado de la vivienda.
 */
    public String getEstado() {
        return estado;
    }
    
/**
 * Establece el estado de la vivienda.
 * @param estado El nuevo estado de la vivienda.
 */
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
/**
 * Devuelve el propietario de la vivienda.
 * @return El propietario de la vivienda.
 */
    public String getPropietario() {
        return propietario;
    }
    
/**
 * Establece el propietario de la vivienda.
 * @param propietario El nuevo propietario de la vivienda.
 */
    
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}