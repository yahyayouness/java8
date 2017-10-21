/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_05_02;

/**
 *
 * @author fabien
 */
public class Facture {
    private String numero;
    private double total;
    private String client;
    
    public String getNumero() { return numero;}
    public double getTotal() { return total;}
    public String getClient() { return client;}
    
    public Facture(String numero, double total, String client) {
        this.numero = numero;
        this.total = total;
        this.client=client;
    }
    
    @Override
    public String toString() {
        return "Numero "+numero+" total "+total+" client "+client;
    }
}
