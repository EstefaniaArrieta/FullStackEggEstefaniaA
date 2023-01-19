/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Mascota;

/**
 *
 * @author Martin
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mascota m1=new Mascota("rojo", "perro", "mario", "beagle", 15, true);
        
        System.out.println(m1.getColor());
        
        m1.setColor("verde");
        
        System.out.println(m1.getColor());
        
        // TODO code application logic here
    }
    
}
