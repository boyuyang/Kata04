/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kata;

import java.util.List;

/**
 *
 * @author mana
 */
public class Util {
   public static Difference getMinimum(List<Difference> list){
        int min = list.get(0).getDifference();
        Difference mw = list.get(0);
        for (Difference d : list){
            if (d.getDifference() < min){
                min = d.getDifference();
                mw = d;
            }
        }
        return mw;
    }
}
