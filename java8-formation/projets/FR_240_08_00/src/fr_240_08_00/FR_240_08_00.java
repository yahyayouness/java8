/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_08_00;

import java.util.Arrays;

/**
 *
 * @author fabien
 */
public class FR_240_08_00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     for( int max=100000; max<100000000; max*=10) {
         System.out.println(" Pour max valant "+max);
         triParallele(max);
         System.out.print(" et ");
         triSequentiel(max);
         System.out.println("");
     }
        
    }
     public static void triParallele(int max) {
         
        int[] donnees = new int[max];
        for( int i=0; i<max; i++) {
            donnees[i] =(int)( Math.random()*100);
        }
        long t0 = System.currentTimeMillis();
        Arrays.parallelSort(donnees);
        long t1 = System.currentTimeMillis();
        
        System.out.print("parallele sort en "+(t1-t0));
    }
    public static void triSequentiel(int max) {
         
        int[] donnees = new int[max];
        for( int i=0; i<max; i++) {
            donnees[i] =(int)( Math.random()*100);
        }
        long t0 = System.currentTimeMillis();
        Arrays.sort(donnees);
        long t1 = System.currentTimeMillis();
        
        
        System.out.print("sort en "+(t1-t0));
    }
    
}
