/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_02_03;

/**
 *
 * @author fabien
 */
public class PersonnePhysique implements IPersonne{

    private String nom;
    @Override
    public String getNom() {
        return nom;
    }

    public PersonnePhysique(String nom) {
        this.nom= nom;
    }
    @Override
    public String toString() {
        return nom+" "+getSiret();
    }
}
