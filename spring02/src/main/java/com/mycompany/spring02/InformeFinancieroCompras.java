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
@Component
public class InformeFinancieroCompras implements CrearInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "Informe financiero del departamento de compras";
    }
    
}
