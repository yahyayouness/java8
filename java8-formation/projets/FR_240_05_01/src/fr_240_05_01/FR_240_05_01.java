/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_05_01;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author fabien
 */
public class FR_240_05_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        List<String > liste = new ArrayList<>();
        liste.add("Fabien");
        liste.add("Xavier");
        
        Stream s = liste.stream();
        
        s.forEach(System.out::println);
        
        Stream.of("Fabien","Xavier").forEach(System.out::println);
        
        Stream.Builder b = Stream.builder();
        
        b.accept("Fabien");
        b.accept("Xavier");
        
        b.build().forEach(System.out::println);
        
        DoubleStream.Builder bd= DoubleStream.builder();
        
        bd.accept(3.4);
        bd.accept(6.7);
        
        bd.build().forEach(System.out::println);
    }
    
}
