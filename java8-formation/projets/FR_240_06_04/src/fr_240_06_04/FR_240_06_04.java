/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_06_04;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author fabien
 */
public class FR_240_06_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        LocalDateTime date = LocalDateTime.of(1968, Month.JUNE, 6, 6, 0, 0);
        
        JapaneseDate jdate = JapaneseDate.from(date);
        System.out.println(jdate);
        
        MinguoDate mdate = MinguoDate.from(date);
        System.out.println(mdate);
        
        DateTimeFormatter formateur = DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(date.format(formateur));
        
        formateur = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(date.format(formateur));
        
        formateur = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(date.format(formateur));
    }
    
}
