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
        int opcion;
        int res;
        
        do{
            v.menu();
            opcion = leerEntero();
            switch(opcion){
                // d4
                case 1:
                    res = repetirOp(v.cDados(), 4, m);
                    m.sethistorial(res);
                    v.resDado(res);
                    break;
                // d6
                case 2:
                    res = repetirOp(v.cDados(), 6, m);
                    m.sethistorial(res);
                    v.resDado(res);
                    break;
                // d8
                case 3:
                    res = repetirOp(v.cDados(), 8, m);
                    m.sethistorial(res);
                    v.resDado(res);
                    break;
                // d10
                case 4:
                    res = repetirOp(v.cDados(), 10, m);
                    m.sethistorial(res);
                    v.resDado(res);
                    break;
                // d12
                case 5:
                    res = repetirOp(v.cDados(), 12, m);
                    m.sethistorial(res);
                    v.resDado(res);
                    break;
                // d100
                case 6:
                    res = repetirOp(v.cDados(), 100, m);
                    m.sethistorial(res);
                    v.resDado(res);
                    break;
                // d20
                case 7:
                    res = repetirOp(v.cDados(), 20, m);
                    m.sethistorial(res);
                    v.resDado(res);
                    break;
                // Varios tipos
                case 8:
                    v.menu();
                    break;
                case 9:
                    v.historial(m.gethistorial());
                    break;
                case 10:
                    break;
            }
        }while(opcion!=10);
        
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
