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
   public static Weather minimumWeather(List<Weather> list){
        int min = list.get(0).getTempDiff();
        Weather mw = list.get(0);
        for (Weather w : list){
            if (w.getTempDiff() < min){
                min = w.getTempDiff();
                mw = w;
            }
        }
        return mw;
    }
    public static Soccer minimumSoccer(List<Soccer> list){
        int min = list.get(0).getGoalDiff();
        Soccer sc = list.get(0);
        for (Soccer s : list){
            if (s.getGoalDiff() < min){
                min = s.getGoalDiff();
                sc = s;
            }
        }
        return sc;
    }        
}
