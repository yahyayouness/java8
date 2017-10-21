/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr_240_07_02;

import java.net.URLPermission;
import java.security.AccessControlException;
import java.security.AccessController;

/**
 *
 * @author fabien
 */
public class FR_240_07_02 {

    
    
    public static void main(String[] args) {
    
        URLPermission maPermission = new URLPermission("http://www.ei6.biz");
        try {
        AccessController.checkPermission(maPermission);
        System.out.println("permission accordée");
        }
        catch(AccessControlException ace)
        {
            System.out.println(ace);
        } 
    }
    
}
