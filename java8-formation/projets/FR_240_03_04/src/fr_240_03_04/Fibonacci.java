/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_04;

/**
 *
 * @author fabien
 */
public class Fibonacci {
    static int[] suite = {1,2,3,5,8,13,21,34,55};
    static int i=0;
    static int suivante() {
        return suite[i++];
    }
}
