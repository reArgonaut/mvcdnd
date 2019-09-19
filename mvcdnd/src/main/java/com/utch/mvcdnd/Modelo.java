/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utch.mvcdnd;
import java.util.*;
/**
 *
 * @author asael
 */
public class Modelo {
    private int Type;
    private int dice; 
    
    public void setType(int Type){
        this.Type = Type;
    }
    public void setdice(int dice){
        this.dice = dice;
    }
    public List<Integer> historial(int getRoll){
        List<Integer> history = new ArrayList<Integer>();
        history.add(getRoll);
        return history;
    }
    
    public int getRoll(){
        int max = this.dice*this.Type; 
        int min = this.dice; 
        int range = (max - min) + 1; 
        return (int)(Math.random() * range) + min; 
  
    }
    
    
}
