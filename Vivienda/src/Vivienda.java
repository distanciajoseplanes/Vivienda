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
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /** constructor con los siguientes parámetros:
     * @param pr
     * @param nHab
     * @param sup
     * @param park
     * @param es
     * @param prop
     */
    
    public Vivienda (double pr,int nHab,double sup,boolean park,String es,String prop)
    {
        this.setPrecio(pr);
        this.setNumHabitaciones(NHab);
        this.setSuperficie(sup);
        this.setParking(park);
        this.setEstado(es);
        this.setPropietario(prop);
    }
    
    //* añadimos los getters*/
    
    public double getPrecio(){
        return precio;
    }
    public int getNumHabitaciones(){
        return numHabitaciones;
    }
    public double getSuperficie(){
        return superficie;
    }
    public boolean getParking(){
        return parking;
    }
    public String getEstado(){
        return estado;
    }
    public String getPropietario(){
        return propietario;
    }
    
    //*añadimos los setters*/
    
    public void setPrecio(double precio){
        try{
            this.precio = precio;
        }catch(Exception e){System.out.println(e);}
    }
    public void setNumHabitaciones(int numHabitaciones){
        try{
            this.numHabitaciones = numHabitaciones;
        }catch(Exception e){System.out.println(e);}
    }
    public void setSuperficie(double superficie){
        try{
            this.superficie = superficie;
        }catch(Exception e){System.out.println(e);}
    }
    public void setParking(boolean parking){
        try{
            this.parking = parking;
        }catch(Exception e){System.out.println(e);}
    }
    public void setEstado(String estado){
        try{
            this.estado = estado;
        }catch(Exception e){System.out.println(e);}
    }
    public void setPropietario(String propietario){
        try{
            this.propietario = propietario;
        }catch(Exception e){System.out.println(e);}
    }
    
    //* actualizamos pasando un descuento como parámetro*/
    
    public void actualizarPrecio(double descuento)
    {
        precio = precio - descuento;
    }
}