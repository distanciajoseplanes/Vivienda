
package Hogar;

/**
 *
 * @author nadia franco
 * En la clase Vivienda se contienen dos constructores, el primero requiere todos los parametros de entrada
 *  y el segundo solo pide el precio, ademas se han añadido los metodos getter y setter 
 *  para todas las variables de la clase.
 */
public class Vivienda {

    /**
     * @return obtener el precio actual
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio poner un precio como parametro de entrada
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return obtener el numero de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones introducir el numero de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return obtener la superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie introducir la superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return obtener la existencia de parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking introducir si existe parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return obtener el estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado introducir el estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return obtener el propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario introducir quien es el propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio()
    {
        setPrecio(getPrecio() - getPrecio() * 0.05);
    }
    
}
