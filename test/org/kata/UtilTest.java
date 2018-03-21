/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kata;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author mana
 */
public class UtilTest {
    @Test
    public void testMinimumWeather(){
        List<Weather> wl = new ArrayList();
        wl.add(new Weather(5, 30));
        wl.add(new Weather(6, 20));
        wl.add(new Weather(7, 10));
        Weather wm = Util.minimumWeather(wl);
        assertEquals(wm.getDay(), 7);
        assertEquals(wm.getTempDiff(), 10);
    }
    @Test
    public void testMinimumSoccer(){
        List<Soccer> sl = new ArrayList();
        sl.add(new Soccer("A", 30));
        sl.add(new Soccer("B", 20));
        sl.add(new Soccer("C", 10));
        Soccer sm = Util.minimumSoccer(sl);
        assertEquals(sm.getName(), "C");
        assertEquals(sm.getGoalDiff(), 10);
    }    
}
