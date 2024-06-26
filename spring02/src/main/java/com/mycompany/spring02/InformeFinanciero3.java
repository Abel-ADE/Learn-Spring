package com.mycompany.spring02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.springframework.stereotype.Component;

/**
 *
 * @author abel
 */
@Component
public class InformeFinanciero3 implements CrearInformeFinanciero {

    @Override
    public String getInformeFinanciero() {
        return "Informe financiero del trimestre 3";
    }
    
}
