/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_03_03;

/**
 *
 * @author fabien
 */
public class Article {
    private String nom;
    private int prix;
    
    Article(String nom, int prix ){
        this.nom=nom;
        this.prix=prix;
    }
    
    int getPrix() { return prix;}
    String getNom() { return nom;}
}
