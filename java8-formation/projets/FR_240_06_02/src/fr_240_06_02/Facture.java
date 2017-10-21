/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_06_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

/**
 *
 * @author fabien
 */
public class Facture {
    private String numero;
    private LocalDate date;
    
    public Facture(String numero) {
        this.numero=numero;
        this.date = LocalDate.now();
    }
    
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
    private DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder()
                    .appendLiteral(" Le ")
                    .appendValue(ChronoField.DAY_OF_MONTH)
                    .appendLiteral( " du mois n°")
                    .appendValue(ChronoField.MONTH_OF_YEAR)
                    .appendLiteral(" de l'an ")
                    .appendValue(ChronoField.YEAR);
    
    @Override
    public String toString() {
        
        return "Numéro "+numero+" date "+date.format(dtfb.toFormatter()); 
    }
    
    public void accept(String str) {
        date = LocalDate.parse(str,dtfb.toFormatter());
    }
}
