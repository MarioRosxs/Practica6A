/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mastermmind;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MarioRosas
 */

public class Colores {
    ArrayList<String> colores;
    String[] color = {"RO","VE","AZ","AM","MA","NA","NE","BL"};
    
    public Colores(){
        colores = new ArrayList();
        colores.addAll(Arrays.asList(color));
    }
}
