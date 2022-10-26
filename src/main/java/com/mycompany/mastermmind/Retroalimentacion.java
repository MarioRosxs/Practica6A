/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mastermmind;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author MarioRosas
 */
public class Retroalimentacion {
    ArrayList<String> aciertos;
    ArrayList<String> historial;
    
    public Retroalimentacion(){
        aciertos = new ArrayList();
        historial = new ArrayList();
    }
    // Método para comparar aciertos o error
    public void Comparar(ArrayList x,ArrayList y){
        aciertos.clear();
        for(int i=0; i<y.size(); i++){
            for(int j=0; j<y.size(); j++){
                if (x.get(i).equals(y.get(i))){
                    aciertos.add("NE");//cuadro negro
                    break;
                }
                if (x.get(i).equals(y.get(j))){
                    aciertos.add("BL");//cuadro blanco
                    break;
                }
            }
        }
        Collections.shuffle(aciertos);
        historial.addAll(aciertos);
        historial.add("|");
    }
    //Método para mostrar aciertos
    public ArrayList<String> mostrarAciertos(){
        for(int i=0;i<aciertos.size();i++){
            if("BL".equals(aciertos.get(i))){
                System.out.print("white ");
            }else{
                System.out.print("black ");
            }
        }
        System.out.print("\n");
        return aciertos;
    }
    
    public void mostrarHistorial(){
        System.out.println(historial);
    }
}


