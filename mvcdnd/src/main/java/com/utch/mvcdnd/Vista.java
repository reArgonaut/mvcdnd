/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utch.mvcdnd;

import java.util.Scanner;


/**
 *
 * @author Adrian
 */
public class Vista {
    
    
    public Vista(){
      
    }
    
    
    
    public void menu(){
        
        System.out.println("BIENVENIDO AVENTURERO!");
        System.out.println("");
        System.out.println("==========================");
        System.out.println("=      1.- DICE d4       =");
        System.out.println("=      2.- DICE d6       =");
        System.out.println("=      3.- DICE d8       =");
        System.out.println("=      4.- DICE d10      =");
        System.out.println("=      5.- DICE d12      =");
        System.out.println("=      6.- DICE d100     =");
        System.out.println("=      7.- DICE d20      =");
        System.out.println("=    8.- Varios Dados    =");
        System.out.println("=       9.- SALIR        =");
        System.out.println("==========================");
        System.out.println("");
        System.out.println("Elige la opcion a rolear");
    }
    
    
    //Regresara true si va a tirar mas de un dado del mismo tipo
    public int cDados(){
        Scanner leer = new Scanner(System.in);
        int c;
        System.out.println("Cuantos dados vas a tirar?");
        c=leer.nextInt();
        return c;
    }
    
    public void historial(){
        System.out.println("Historial de Tiradas: ");
        
    }
    
    public void resDado(int res){
      System.out.println("Tiraste un: "+res);
    }
}
