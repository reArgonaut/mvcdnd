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
    private List<Integer> history = new ArrayList<>();
    
    public void setType(int Type){
        this.Type = Type;
    }
    public void setdice(int dice){
        this.dice = dice;
    }
    public void sethistorial(int getRoll){
        history.add(getRoll);
    }
    public List<Integer> gethistorial(){
        return this.history;
    }
    
    public int getRoll(){
        int max = this.dice*this.Type; 
        int min = this.dice; 
        int range = (max - min) + 1; 
        return (int)(Math.random() * range) + min; 
  
    }
    
    
}
