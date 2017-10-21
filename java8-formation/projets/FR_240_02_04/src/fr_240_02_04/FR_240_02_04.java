/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_02_04;

import java.util.Arrays;

/**
 *
 * @author fabien
 */
public class FR_240_02_04 {

    
    public static void main(String[] args) {
       
        Personne[] leTableau = new Personne[2];
        
        leTableau[0] = new Personne("Fabien",48);
        leTableau[1] = new Personne("Corinne",47);
        
        System.out.println(leTableau[0]);
        System.out.println(leTableau[1]);
        
        Arrays.sort(leTableau,Personne::compareA);
        
        System.out.println(leTableau[0]);
        System.out.println(leTableau[1]);
        
    }
    
}
