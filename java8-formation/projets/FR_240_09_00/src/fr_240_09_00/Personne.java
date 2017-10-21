/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_09_00;

/**
 *
 * @author fabien
 */
public class Personne {
    native void affiche(int i);
    
    private static int compteur=0;
    
    public Personne() {
        affiche(compteur++);
    }
}
