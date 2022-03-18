/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paqui Elena
 */
public class Hogar {

    private double precio;
    int numHabitaciones;
    double superficie;
    boolean parking;
    private String estado;
    private String propietario;
    
    
    
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
    
    
    public static void main(String[] args) {
        Vivienda casa1 = new Vivienda(120000);
        
        
        
        System.out.println("Precio: " + casa1.precio);
        System.out.println("Número de habitaciones: "+ casa1.numHabitaciones);
        System.out.println("Superficie en m2: " + casa1.superficie);
        System.out.println("¿Dispone de parking?: " + casa1.parking);
        System.out.println("Estado: "+ casa1.estado);
        System.out.println("Propietario: "+ casa1.propietario);
    }
    
    public void imprimirVivienda(Hogar casa1)
    {
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa1.getParking());
        System.out.println("Estado: "+ casa1.getEstado());
        System.out.println("Propietario: "+ casa1.getPropietario());
    }
    
}
