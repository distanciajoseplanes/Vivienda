/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salva navarro
 */
public class Vivienda 
{
        /**
         * Precio de una vivienda
         */
        private double precio;
        /**
         * Numero de habitaciones de una vivienda
         */
        private int numHabitaciones;
        /**
         * Superficie de una vivienda
         */
        private double superficie;
        /**
         * Atributo para saber si una vivienda tiene parking
         */
        private boolean parking;
        /**
         * Estado de una vivienda
         */
        private String estado;
        /**
         * Propietario de una vivienda
         */
        private String propietario;
        
        /**
         * Metodo que devuelve el precio de una vivienda
         * @return precio precio de la vivienda
         */
        public double getPrecio() {
            return precio;
        }
        
        /**
         * Metodo que modifica el atributo precio de una vivienda
         * @param precio  nuevo precio de la vivienda
         */
        public void setPrecio(double precio) {
            this.precio = precio;
        }
        
        /**
         * Metodo que devuelve el numero de habitaciones de una vivienda
         * 
         * @return numHabitaciones numero de habitaciones de la vivienda
         */
        public int getNumHabitaciones() {
            return numHabitaciones;
        }
        
        /**
         * Metodo que modifica el numero de habitaciones de una vivienda
         * @param num nuevo numero de habitaciones de la vivienda
         */
        public void setNumHabitaciones(int num) {
            this.numHabitaciones = num;
        }

        /**
         * Metodo que devuelve la superficie de una vivienda
         * @return superficie superficie de la vivienda
         */
        public double getSuperficie() {
            return superficie;
        }
        
        /**
         * Metodo que modifica la superficie de una vivienda
         * @param superficie superficie de la vivienda
         */
        public void setSuperficie(double superficie) {
            this.superficie = superficie;
        }
        
        /**
         * Metodo que devuelve si una vivienda tiene parking
         * @return si hay parking en la vivienda
         */
        public boolean getParking() {
            return parking;
        }
        
        /**
         * Metodo que modifica el atributo parking de una vivienda
         * @param hay parking en la vivienda
         */
        public void setParking(boolean hay) {
            this.parking = hay;
        }
        
        /**
         * Metodo que devuelve el estado de una vivienda
         * @return estado estado de la vivienda
         */
        public String getEstado(){
            return estado;
        }

        /**
         * Metodo que modifica el estado de una vivienda
         * @param estado nuevo estado de la vivienda
         */
        public void setEstado(String estado) {
            this.estado = estado;
        }
        
        /**
         * Metodo que devuelve el propietario de una vivienda
         * @return propietario propietario de la vivienda
         */
        public String getPropietario() {
            return propietario;
        }
        
        /**
         * Metodo que modifica el propietario de una vivienda
         * @param propietario nuevo propietario de la vivienda
         */
        public void setPropietario(String propietario) {
            this.propietario = propietario;
        }
    
    /**
     * Este constructor permite crear un objeto vivienda con
     * el unico atributo precio
     * 
     * @param precio precio de la vivienda creada
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Este constructor permite crear un objeto vivienda a partir
     * de todos sus atributos
     * 
     * @param precio precio de una vivienda
     * @param numHabitaciones numero de habitaciones de una vivienda
     * @param superficie superficie de una vivienda
     * @param parking la vivienda tiene o no parking
     * @param estado estado de la vivienda
     * @param propietario propietario de la vivienda
     */
    public Vivienda( double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;   
    }   
    
    /**
     * Este metodo permite realizar un descuento del precio a partir
     * del porcentaje que se pase como parametro
     * 
     *@param descuento porcentaje entre 1 y 100 que se descuenta del precio
     */
    public void actualizarPrecio(double descuento)
    {
        precio -= precio * descuento;
    }
    
    /**
     * 
     * Este metodo imprime toda la imformacion relacionada con la vivienda
     * pasada como parametro     
     * 
     *  @param casa1 vivienda  para imprimir informacion
     */
    public static void imprimirVivienda(Vivienda casa1) {
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa1.getParking());
        System.out.println("Estado: "+ casa1.getEstado());
        System.out.println("Propietario: "+ casa1.getPropietario());
    }
}