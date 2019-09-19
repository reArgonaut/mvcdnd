package com.utch.mvcdnd;

import com.utch.mvcdnd.Vista;
import com.utch.mvcdnd.Modelo;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author carlos
 */
public class Controlador {
    private Vista v;
    private Modelo m;
    
    
    public Controlador(Vista v, Modelo m){
        this.v = v;
        this.m = m;
        init();
    }
    
    public void init(){
        v.menu();
        
        int opcion;
        
        do{
            opcion = leerEntero();
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    break;
            }
        }while(opcion!=9);
        
    }
    
    public int leerEntero(){
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n=0;        
        try{
            n = Integer.parseInt(r.readLine());
        }catch(Exception e){
            e.printStackTrace();
        }
        return n;
    }
    
    
}
