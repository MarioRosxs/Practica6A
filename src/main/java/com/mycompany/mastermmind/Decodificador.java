/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mastermmind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author MarioRosas
 */

public class Decodificador {

    int puntos;
    ArrayList<String> miCodigo;
    HashSet<String> codigosAnteriores;

    public Decodificador() {
        puntos = 0;
        codigosAnteriores = new HashSet<>();
        miCodigo = new ArrayList();
    }

    //Método para ingresar código de colores de jugador
    public ArrayList<String> introducirCodigo(String mycode) {
        miCodigo.clear();
        String[] codigo = mycode.split("\\s+");
        Collections.addAll(miCodigo, codigo);
        codigosAnteriores.add(mycode);
        return miCodigo;
    }

    //Método para comprobar que el codigo no ha sido repetido
    public boolean verificarCodigoRepetido(String mycode) {
        return codigosAnteriores.contains(mycode);
    }

    public boolean verificarColorRepetido(String mycode){
        String[] codigo = mycode.split("\\s+");
        boolean res = false;
        for(int i=0;i<codigo.length;i++){
            for(int j=i+1;j<codigo.length;j++){
                if(codigo[i].equals(codigo[j])){
                    res = true;
                }
            }
        }
        return res;
    }


    public void entregarPuntos(int x) {
        System.out.println("Haz ganado con " + x + " puntos");
        puntos += x;
    }
}

