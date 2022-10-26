/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mastermmind;

/**
 *
 * @author mariorosas
 */
public class Mastermmind {

    public static void main(String[] args) {
        JuegoControl juego = new JuegoControl();
        juego.jugar();
        juego.repartirPuntos(); 
        
    }
}
