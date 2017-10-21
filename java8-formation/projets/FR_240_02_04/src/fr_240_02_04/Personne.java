/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_02_04;

/**
 *
 * @author fabien
 */
public class Personne {
    private String nom;
    private int age;
    
    public Personne(String nom,int age) {
        this.nom = nom;
        this.age = age;
    }
    
    public static int compareA(Personne p1, Personne p2) {
        return p1.age-p2.age;
    }
    
    @Override
    public String toString() {
        return nom+" : "+age;
    }
}
