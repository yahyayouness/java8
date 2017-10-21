/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_07_00;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author fabien
 */
public class FR_240_07_00 {

    private static Map<String,Integer> compteur = 
            new ConcurrentHashMap<String,Integer>(1990);
    
    public static void comptageIncrement(String str) {
        
        Integer cp = compteur.get(str);
        if(cp == null) {
            compteur.put(str, 1);
        }
        else
        {
            compteur.put(str, cp+1);
        }
    }
    
    public static void main(String[] args) {
        
        comptageIncrement("chaine");
        comptageIncrement("chaine");
        comptageIncrement("chaine");
        
        compteur.forEach((s,i)-> System.out.println(" clé  "+s+" valeur "+i));
    }
    
}
