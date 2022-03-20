/**
 * Esta clase define el objeto Vivienda, el cual contiene los datos de precio, número de habitaciones, superficie, estado, propietario y si tiene parking.
 * @author: Adelaide Guillemette
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
     * Constructor para la vivienda únicamente con el precio
     * @param precio El parámetro precio define el precio de la vivienda
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Constructor para la vivienda con todos los datos de la misma
     * @param precio El parámetro precio define el precio de la vivienda
     * @param numHabitaciones El parámetro numHabitaciones define el número de habitaciones de la vivienda
     * @param superficie El parámetro superficie define la superficie de la vivienda
     * @param parking El parámetro parking define si la vivienda tiene parking
     * @param estado El parámetro estado define el estado de la vivienda
     * @param propietario El parámetro propietario define el propietario de la vivienda
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, 
            boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    /**
     * Método para aplicar un descuento al precio de la vivienda
     * @param descuento El parámetro descuento aplica un descuento en porcentaje al precio de la vivienda
     */
     public void actualizarPrecio (double descuento) {
        this.precio = precio - (precio*(descuento/100));
    }
    
    
     /**
     * Método que devuelve el precio de la vivienda
     * @return El precio e la vivienda
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método para definir el precio de la vivienda
     * @param precio El parámetro precio define el precio de la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     /**
     * Método que devuelve el numero de habitaciones de la vivienda
     * @return El numero de habitaciones de la vivienda
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    
    /**
     * Método para definir el número de habitacioens de la vivienda
     * @param numHabitaciones El parámetro numhabitaciones define las habitaciones de la vivienda
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

     /**
     * Método que devuelve La superficie de la vivienda
     * @return La superficie de la vivienda
     */
    public double getSuperficie() {
        return superficie;
    }
    
    /**
     * Método para definir la superficie de la vivienda
     * @param superficie El parámetro superficie define la superficie de la vivienda
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

     /**
     * Método que devuelve Si la vivienda tiene parking
     * @return Si la vivienda tiene parking
     */
    public boolean isParking() {
        return parking;
    }
    
    /**
     * Método para definir si la vivienda tiene parking
     * @param parking El parámetro parking define si la vivienda tiene parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

     /**
     * Método que devuelve el estado de la vivienda
     * @return El estado de la vivienda
     */
    public String getEstado() {
        return estado;
    }
    
    /**
     * Método para asignar un estado a la vivienda
     * @param estado El parámetro estado define el estado de la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

     /**
     * Método que devuelve el propietario de la vivienda
     * @return El propietario de la vivienda
     */
    public String getPropietario() {
        return propietario;
    }
    
    /**
     * Método para asignar un propietario a la vivienda
     * @param propietario El parámetro propietario define el nombre del propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    /**
     * Método que devuelve todos los valores de la vivienda
     */
    public void imprimirVivienda(){
        
        System.out.println("Precio: " + this.precio);
        System.out.println("Número de habitaciones: "+ this.numHabitaciones);
        System.out.println("Superficie en m2: " + this.superficie);
        System.out.println("¿Dispone de parking?: " + this.parking);
        System.out.println("Estado: "+ this.estado);
        System.out.println("Propietario: "+ this.propietario);
        
    }
    
    
}
