/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring02;

import org.springframework.stereotype.Component;

/**
 *
 * @author abel
 */
@Component("Comercial")
public class Comercial implements Empleados{

    @Override
    public String getTareas() {
        return "Vender mucho";
    }

    @Override
    public String getInforme() {
        return "Informe del comercial";
    }
    
}
