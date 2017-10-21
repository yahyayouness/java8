/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_04_01;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;



/**
 *
 * @author fabien
 */
public class FR_240_04_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchMethodException {
        
        Personne p = new Personne();
        Voiture v = new Voiture();
        
        v.acheter(p);
        
        Method m = v.getClass().getMethod("acheter", Personne.class);
        
        Parameter[] lesParametres = m.getParameters();
        
        String str = lesParametres[0].getName();
        System.out.println("Nom du paramètre : "+str);
    }
    
}
