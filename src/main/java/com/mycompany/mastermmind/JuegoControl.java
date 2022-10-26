/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mastermmind;

import java.util.Scanner;
/**
 *
 * @author MarioRosas
 */


public class JuegoControl {
    CodigoDeColores codigoColores;
    Decodificador decodificador;
    Retroalimentacion retroalimentacion;
    Tablero tablero;
    int intentos;
    
    public JuegoControl(){
        codigoColores = new CodigoDeColores();
        decodificador = new Decodificador();
        retroalimentacion = new Retroalimentacion();
        tablero = new Tablero();
        intentos = 15;
    }
    
    //Método para iniciar el juego
    public void jugar(){
        tablero.generarColores();
        int y1 = 565;
        int y2 = 575;
        Scanner input = new Scanner(System.in);

        codigoColores.generarCombinacion();

        tablero.dibujarTablero();
        
        while(!decodificador.miCodigo.equals(codigoColores.codigoSecreto) && intentos!=0){
            System.out.println("Te quedan "+intentos+" intentos restantes\nCódigo de color:");
            String código = input.nextLine().toUpperCase();
            if(decodificador.verificarColorRepetido(código) || decodificador.verificarCodigoRepetido(código)){
                System.out.println("ERROR");
            }else{
                if("COMBINACION".equals(código)){
                    codigoColores.mostrarCombinacionSecreta();
                    tablero.mostrarCombinacionEscondida(6, codigoColores.codigoSecreto);
                    System.out.println(codigoColores.mostrarCombinacionSecreta());
                }else if("RETROALIMENTACION".equals(código)){
                    retroalimentacion.mostrarHistorial();
                }else{
                    decodificador.introducirCodigo(código);
                    tablero.dibujarCodigo(y1, decodificador.miCodigo);
                    retroalimentacion.Comparar(decodificador.miCodigo, codigoColores.codigoSecreto);
                    System.out.println("RETRO: ");
                    retroalimentacion.mostrarAciertos();
                    tablero.dibujarRetroalimentacion(y2, retroalimentacion.aciertos);
                    intentos--;
                    y1-=40;
                    y2-=40;
                }
            }
        }
    }
    
    
    public void repartirPuntos(){
        decodificador.entregarPuntos(intentos);
    }
}

