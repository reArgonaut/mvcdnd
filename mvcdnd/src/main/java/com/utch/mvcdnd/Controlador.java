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
                // d4
                case 1:
                    int res = repetirOp(v.cDados(), 4, m);
                    m.historial(res);
                    v.resDado(res);
                    break;
                // d6
                case 2:
                    v.resDado(repetirOp(v.cDados(), 6, m));
                    break;
                // d8
                case 3:
                    v.resDado(repetirOp(v.cDados(), 8, m));
                    break;
                // d10
                case 4:
                    v.resDado(repetirOp(v.cDados(), 10, m));
                    break;
                // d12
                case 5:
                    v.resDado(repetirOp(v.cDados(), 12, m));
                    break;
                // d100
                case 6:
                    v.resDado(repetirOp(v.cDados(), 100, m));
                    break;
                // d20
                case 7:
                    v.resDado(repetirOp(v.cDados(), 20, m));
                    break;
                // Varios tipos
                case 8:
                    v.menu();
                    break;
                case 9:
                    v.historial();
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
    
    public int repetirOp(int repes, int tipo, Modelo m){
        m.setType(tipo);
        m.setdice(repes);
        return m.getRoll();
    }
    
    
}
