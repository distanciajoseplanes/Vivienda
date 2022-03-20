/**
 * @version  1.0
 * @author Paqui Elena
 * @see Hogar
 */

public class Vivienda 
{
    /**
     * Atributo precio de Vivienda. Tipo double
     */
    private double precio;
    /**
     * Atributo numHabitaciones. Tipo int
     */
    private int numHabitaciones;
    /**
     * Atributo superficie. Tipo double.
     */
    private double superficie;
    /**
     * Atributo parking. Tipo boolean
     */
    private boolean parking;
    /**
     * Atributo estado. Tipo cadena.
     */
    private String estado;
    /**
     * Atributo propietario. Tipo cadena.
     */
    private String propietario;

    /**
     *Constructor con 6 parámetros.
     * Crea objetos Vivienda con precio, numHabitaciones, superficie,
     * parking, estado y propietario.
     * @param precio 
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, 
                    boolean parking, String estado, String propietario) {
        
        this.precio          = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie      = superficie;
        this.parking         = parking;
        this.estado          = estado;
        this.propietario     = propietario;
    }
    
    /**
     *Constructor con 1 parámetro
     * Crea objetos Vivienda con precio.
     * @param precio
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }

    /**
     *
     * @return el valor de precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     *
     * @return el número de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     *
     * @param numHabitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     *
     * @return la superficie de la vivienda.
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     *
     * @param superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     *
     * @return si tiene o no parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     *
     * @param parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     *
     * @return el estado de la vivienda.
     */
    public String getEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     *
     * @return propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     *
     * @param propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }    
    
    /**
     *Este método actualiza el precio de la vivienda según el descuento aplicado.
     * 
     * @param descuento double que se multiplicará al precio para obtener la cantidad descontada.
     */
    public void actualizarPrecio( double descuento )
    {
        precio = precio - precio * descuento;
    }
}