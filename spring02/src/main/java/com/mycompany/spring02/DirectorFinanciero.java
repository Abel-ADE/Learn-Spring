/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author abel
 */
@Component
public class DirectorFinanciero implements Empleados {

    @Autowired
    @Qualifier("informeFinancieroCompras")
    private CrearInformeFinanciero informeFinanciero;
    
    @Override
    public String getTareas() {
        return "Gestión de las Finanzas";
    }

    @Override
    public String getInforme() {
        return informeFinanciero.getInformeFinanciero();
    }
    
}
