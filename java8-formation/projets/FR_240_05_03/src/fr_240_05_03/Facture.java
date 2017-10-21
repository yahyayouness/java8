/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_05_03;

/**
 *
 * @author fabien
 */
public class Facture {
    private String numero;
    private double total;
    
    public String getNumero() { return numero;}
    public double getTotal() { return total;}
    
    public Facture(String numero, double total) {
        this.numero=numero;
        this.total=total;
    }
    
    @Override
    public String toString() {
        return "numero "+numero+" total "+total;
    }
}
