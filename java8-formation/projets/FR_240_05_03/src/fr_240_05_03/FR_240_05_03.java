/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_05_03;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author fabien
 */
public class FR_240_05_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        /*List<String> liste = new ArrayList<>();
        for (int i=0; i<10; i++){
            liste.add(""+i);
        }
        
        liste.parallelStream().forEach(System.out::println);
        */
        
        List<Facture> factures = new ArrayList<>();
        factures.add(new Facture("2016-01-01", 234.45));
        factures.add(new Facture("2016-04-01", 568.45));
        factures.add(new Facture("2016-06-01", 98.45));
        factures.add(new Facture("2016-07-01", 655));
        factures.add(new Facture("2016-08-01", 23125));
        
        String resultat = factures.stream()
                .filter(f -> f.getTotal()>100)
                .parallel()
                .map(Facture::getNumero)
                .collect(Collectors.joining(":"));
        
        System.out.println("resultat "+resultat);
        
       factures.parallelStream()
                .filter(f -> f.getTotal()>100)                
                .map(Facture::getNumero)
               .sequential()
                .forEach(System.out::println);
       
        
          
        
    }
    
}
