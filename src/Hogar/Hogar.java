/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * Esta clase permite crear una vivienda
 * @author Miriam Cegarra Garcia
 * @author paqui
 * @version 13/13/2023/A
 *
 */
public class Hogar 
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Vivienda casa1 = new Vivienda(120000,3,120,true,"seminueva","Pepe Pérez");
        
        casa1.imprimirVivienda(casa1);
    }
    
}
