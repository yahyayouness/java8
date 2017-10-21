/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_08_02;

/**
 *
 * @author fabien
 */
public class FR_240_08_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer v= Integer.MAX_VALUE*2;
        
        for( int i=0 ; i<10; i++) {
            System.out.println(Integer.toUnsignedString(v));
            v++;
        }
        
    }
    
}
