/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mastermmind;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author MarioRosas
 */
public class Tablero{
    Canvas myCanvas;
    Colores color;
    HashMap<String,Color> pintura;
    
    public Tablero(){
        myCanvas = new Canvas("Mastermind", 400, 750, new Color(196,225,224));
        color = new Colores();
        pintura = new HashMap<>();
    }
    
    //Método que asigna el color a un hashmap
    public void generarColores(){
        pintura.put(color.color[0], Color.red);
        pintura.put(color.color[1], Color.green);
        pintura.put(color.color[2], Color.blue);
        pintura.put(color.color[3], Color.yellow);
        pintura.put(color.color[4], Color.MAGENTA);
        pintura.put(color.color[5], Color.ORANGE);
        pintura.put(color.color[6], Color.black);
        pintura.put(color.color[7], Color.white);
    }
    
    //Método que dibuja el tablero incial
    public void dibujarTablero(){
        int x1=245;
        int y1=15;
        int x2=5;
        int y2=5;
        for(int j=0;j<15;j++){
            for(int i=0;i<6;i++){
                myCanvas.fillCircle(x1, y1, 20, Color.GRAY);
                myCanvas.fillCircle(x2, y2, 35, Color.GRAY);
                x2+=40;
                x1+=22;
            }
            x1=245;
            y1+=40;
            x2=5;
            y2+=40;
        }
        int x3 = 50;
        for(int k=0;k<8;k++){
            myCanvas.fillCircle(x3, 615, 35, pintura.get(color.colores.get(k)));
            myCanvas.setFont(new Font("Ink Free",Font.PLAIN,20));
            myCanvas.drawString(color.color[k], x3+3, 675,Color.black);
            x3+=40;
        }
    }
        //Método que dibuja los intentos del jugador
    public void dibujarCodigo(int y,ArrayList<String> paint){
        int x=5;
        for(int i=0;i<6;i++){
            myCanvas.fillCircle(x, y, 35, pintura.get(paint.get(i)));
            x+=40;
        }
    }
    
    //Método que modela la retroalimentación en cuanto a aciertos y errores
    public void dibujarRetroalimentacion(int y,ArrayList<String> paint){
        int x=245;
        for(int i=0;i<paint.size();i++){
            myCanvas.fillCircle(x, y, 20, pintura.get(paint.get(i)));
            x+=22;
        }
    }
    
    //este metodo dibuja el codigo secreto
    public void mostrarCombinacionEscondida(int turn,ArrayList<String> paint){
        int x=150;
        for(int i=0;i<turn;i++){
            myCanvas.fillCircle(x, 710, 35, pintura.get(paint.get(i)));
            x+=40;
        }
    }
}

