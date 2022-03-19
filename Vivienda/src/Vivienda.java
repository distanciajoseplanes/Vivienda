/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Vivienda {
    
  /**
 * Esta clase es una clase que define un tipo de vivienda con sus caracterísitcas
 * @version 1.1, 19/03/2022
 * @author Andrea Zomeño
 */

    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
 /**
 * Métodos que definen nuestra clase vivienda
 * @version 1.1, 19/03/2022
 * @author Andrea Zomeño
 */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        //Campos de la clase
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.parking = parking;
        this.estado = estado;
        this.superficie = superficie;
        this.propietario = propietario;
    } //Cierre del método

    Vivienda(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 /**
 * Este método nos sirve para actualizar el precio de nuestra vivienda, si se le aplica el descuento
 * @version 1.1, 19/03/2022
 * @author Andrea Zomeño
     * @param descuento
 */
    public void actualizarPrecio(int descuento) {
     /**

     * Método que genera un descuento

     */
        precio = precio - precio * 0.05;

        precio = precio - descuento;

    } //Cierre del método
 /**
 * Con este método podemos imprimir como es nuestra vivienda y que características tiene
 * @version 1.1, 19/03/2022
 * @author Andrea Zomeño
     * @param casa1
 */
    
    public void imprimirVivienda(Vivienda casa1) {
    /**

     * Método que imprime los datos de la vivienta

     */
        System.out.println("Precio: " + casa1.precio);
        System.out.println("Número de habitaciones: " + casa1.numHabitaciones);
        System.out.println("Superficie en m2: " + casa1.superficie);
        System.out.println("¿Dispone de parking?: " + casa1.parking);
        System.out.println("Estado: " + casa1.estado);
        System.out.println("Propietario: " + casa1.propietario);
    } //Cierre del método
 /**
 * Getters y Setters
 * @version 1.1, 19/03/2022
 * @author Andrea Zomeño
     * @return precio
 */
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
