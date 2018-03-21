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
public class Weather {
    private int day;
    private int temp_diff;
    
    public Weather (){
        day = 0;
        temp_diff = 0;
    }
    public Weather (int d, int t){
        day = d;
        temp_diff = t;
    }    
    public int getDay(){
        return day;
    }
    public void setDay(int d){
        day = d;
    }
    public int getTempDiff(){
        return temp_diff;
    }
    public void setTempDiff(int d){
        temp_diff = d;
    }
}
