/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar Sanchez
 */
public class Hogar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vivienda casa1 = new Vivienda(120000);//creamos el objeto
        
        Vivienda.imprimirVivienda(casa1); // imprimimos el objeto
    }
    
}
