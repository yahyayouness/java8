/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_06_03;

import java.time.LocalDate;
import java.time.chrono.*;
import java.util.Set;

/**
 *
 * @author fabien
 */
public class FR_240_06_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Set<Chronology> lesChronos = Chronology.getAvailableChronologies();
        for( Chronology c : lesChronos) {
            System.out.println(c.toString());
        }
        
        Chronology japanese = Chronology.of("Japanese");
        System.out.println(japanese);
        
        ChronoLocalDate cld = japanese.dateNow();
        
        System.out.println(cld);
        
        System.out.println(cld.getEra());
        
        System.out.println(cld.lengthOfYear());
               
        
    }
}
