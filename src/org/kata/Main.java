/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author boyu yang
 */
public class Main {
    public static List<Weather> readWeather(String fn){
        List<Weather> list = new ArrayList();
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File(fn)));
            String line = br.readLine();
            while (line != null) {
                if (line.contains("Dy") || line.contains("mo")){
                    line = br.readLine();
                    continue;
                }
                StringTokenizer st = new StringTokenizer(line, " ");
                Weather w = new Weather();
                if (st.hasMoreTokens()){
                    String tk = st.nextToken();
                    Integer d = Integer.parseInt(tk);
                    w.setDay(d); 
                } else {
                    line = br.readLine();
                    continue;
                }
                int max = 0;
                if (st.hasMoreTokens()){
                    String tk = st.nextToken();
                    int p = tk.indexOf("*");
                    if (p > 0){
                        tk = tk.substring(0, p);
                    }
                    max = Integer.parseInt(tk);
                }
                int min = 0;
                if (st.hasMoreTokens()){
                    String tk = st.nextToken();
                    int p = tk.indexOf("*");
                    if (p > 0){
                        tk = tk.substring(0, p);
                    }
                    min = Integer.parseInt(tk);
                }
                w.setTempDiff(max - min); 
                list.add(w);
                line = br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
    public static List<Soccer> readFootball(String fn){
        List<Soccer> list = new ArrayList();
        try{
            BufferedReader br = new BufferedReader(new FileReader(new File(fn)));
            String line = br.readLine();
            while (line != null) {
               //System.out.println(line);
                if (line.contains("Team") || line.contains("---")){
                    line = br.readLine();
                    continue;
                }
                Soccer s = new Soccer();
                StringTokenizer st = new StringTokenizer(line, " ");
                if (st.hasMoreTokens()){
                    st.nextToken();
                }
                if (st.hasMoreTokens()){
                    String tk = st.nextToken();
                    s.setName(tk); 
                    //System.out.println(tk);
                }
                if (st.hasMoreTokens()){
                    st.nextToken();
                }
                if (st.hasMoreTokens()){
                    st.nextToken();
                }
                if (st.hasMoreTokens()){
                    st.nextToken();
                }
                if (st.hasMoreTokens()){
                    st.nextToken();
                }
                int f = 0;
                if (st.hasMoreTokens()){
                    String tk = st.nextToken();
                    f = Integer.parseInt(tk);
                }
                if (st.hasMoreTokens()){
                    st.nextToken();
                }
                int a = 0;
                if (st.hasMoreTokens()){
                    String tk = st.nextToken();
                    a = Integer.parseInt(tk);
                }
                int diff = Math.abs(f - a);
                s.setGoalDiff(diff); 
                list.add(s);
                line = br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
 
    public static void main(String[] args){
        String file_name = "C:/test/kata04/weather.dat";
        List<Weather> rs = readWeather(file_name);
        Weather w = Util.minimumWeather(rs);
        System.out.println(w.getDay() + " : " + w.getTempDiff());
        file_name = "C:/test/kata04/football.dat";
        List<Soccer> rs2 = readFootball(file_name);
        Soccer s = Util.minimumSoccer(rs2);
        System.out.println(s.getName() + " : " + s.getGoalDiff());
    }
}
