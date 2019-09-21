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
    private int[] dices, allDices = {4,6,8,10,12,100,20};
    
    public void setType(int Type){
        this.Type = Type;
    }
    public void setdice(int dice){
        this.dice = dice;
    }
    public void sethistorial(int getRoll){
        history.add(getRoll);
    }
    
    public int[] getAllDices(){
        return this.allDices;
    }
    
    //Tipos de dado
    public void initDices(int dice){
        dices = new int[dice];
    }
    
    public void setDices(int index,int dice){
        dices[index] = dice;
    }
    
    public int[] getDices(){
        return this.dices;
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
