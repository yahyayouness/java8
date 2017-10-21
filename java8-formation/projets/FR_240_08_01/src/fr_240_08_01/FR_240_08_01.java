/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_08_01;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 *
 * @author fabien
 */
public class FR_240_08_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
       //encodage Basic
        String str64 = Base64.getEncoder().encodeToString("fabien brissonneau".getBytes("utf-8"));
        System.out.println(str64);
       
       // décodage
        byte[] lesOctets = Base64.getDecoder().decode(str64);
        System.out.println(new String(lesOctets,"utf-8"));
        
        //URL
        String strURL64 = Base64.getUrlEncoder().encodeToString("serveur/donnees?param".getBytes("utf-8"));
        System.out.println(strURL64);
        
        StringBuilder sb = new StringBuilder();
        for( int i = 0; i<10; i++) {
            sb.append(UUID.randomUUID().toString());
        }
        byte[] donnees = sb.toString().getBytes("utf-8");
        
        String strMIME64 = Base64.getMimeEncoder().encodeToString(donnees);
       
        System.out.println(strMIME64);
    }
    
}
