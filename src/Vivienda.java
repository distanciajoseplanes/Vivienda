/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Vivienda 
{
    double precio;
    int numHabitaciones;
    double superficie;
    boolean parking;
    String estado;
    String propietario;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio()
    {
        precio = precio - precio * 0.05;
    }
}