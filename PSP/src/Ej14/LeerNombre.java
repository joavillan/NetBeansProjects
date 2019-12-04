/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej14; 

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Joaquin
 */
public class LeerNombre {
    public static void main(String[] args) throws IOException {
        
        // TODO code application logic here
        System.out.println(args);
        if(args != "Pepe"){
            System.exit(1);
        }else{
            System.exit(-1);
        }
    }
}
