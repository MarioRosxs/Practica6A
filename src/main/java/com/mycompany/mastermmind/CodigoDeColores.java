/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mastermmind;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MarioRosas
 */


public class CodigoDeColores {
    ArrayList<String> codigoSecreto;
    Colores color;
    public CodigoDeColores(){
        codigoSecreto = new ArrayList();
        color = new Colores();
    }
    
    //Método que genera combinación aleatoria
    public void generarCombinacion(){
        Collections.shuffle(color.colores);
        for(int j=0; j<6; j++){
            codigoSecreto.add(color.colores.get(j));
        }
    }
    
    //Método para mostrar la combinación
    public String mostrarCombinacionSecreta(){
        String txt = "";
        for(int i=0;i<codigoSecreto.size();i++){
            txt = txt+"|"+codigoSecreto.get(i);
        }
        return txt;
    }
}

