/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kata;

/**
 *
 * @author boyu yang
 */
public class Soccer {
    private String name;
    private int goal_diff;
    
    public Soccer (){
        name = null;
        goal_diff = 0;
    }
    public Soccer (String n, int g){
        name = n;
        goal_diff = g;
    }    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getGoalDiff(){
        return goal_diff;
    }
    public void setGoalDiff(int d){
        goal_diff = d;
    }    
}
