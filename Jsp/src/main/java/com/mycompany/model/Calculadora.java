/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author abel
 */
public class Calculadora {

    private int resultado;

    public int metodoSuma(int num1, int num2) {
        resultado = num1 + num2;
        return resultado;
    }

    public int metodoResta(int num1, int num2) {
        resultado = num1 - num2;
        return resultado;
    }

    public int metodoMultiplica(int num1, int num2) {
        resultado = num1 * num2;
        return resultado;
    }
}
