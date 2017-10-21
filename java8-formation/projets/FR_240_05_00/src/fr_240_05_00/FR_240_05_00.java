/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_05_00;

import java.util.*;
import java.util.stream.Stream;

/**
 *
 * @author fabien
 */
public class FR_240_05_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<String> uneListe = new ArrayList<>();
       uneListe.add("fabien");
       uneListe.add("xavier");
       uneListe.add("brissonneau");
       
       uneListe.stream()
               .filter(s-> s.length() <7)
               .forEach(System.out::println);
       
       
       Stream.of("fabien","xavier","brissonneau")
               .filter(s->s.length()<7)
               .map(String::toUpperCase)
               .forEach(System.out::println);
       
       Optional somme = Stream.of("fabien","xavier","brissonneau")
               .filter(s->s.length()<7)
               .map( s -> s.length())
               .reduce( (l1,l2) -> l1+l2 );
                       
       System.out.println("Somme : "+somme.get());
              
       
    }
    
}
