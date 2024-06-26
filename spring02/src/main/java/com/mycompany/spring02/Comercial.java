/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spring02;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author abel
 */
@Component
//@Scope("prototype")
public class Comercial implements Empleados{
    @Autowired
    @Qualifier("informeFinanciero4")
    private CrearInformeFinanciero informe1;

    @Override
    public String getTareas() {
        return "Vender mucho";
    }

    @Override
    public String getInforme() {
        //return "Informe del comercial";
        return informe1.getInformeFinanciero();
    }
    
    //Método después de la creación del Bean
    @PostConstruct
    public void ejecutaDespuesCreación(){
        System.out.println("Bean Creado");
    }
    
    //Método después apagado contenedor Spring
    @PreDestroy
    public void ejecutaAntesDestruccion(){
        System.out.println("El Bean será destruído");
    }
    
    //Dependencia con método seter - Java Annotations
    /*@Autowired
    public void setInforme1(CrearInformeFinanciero informe1) {
        this.informe1 = informe1;
    }*/

    //Dependencia con constructor - Java Annotations
    /*@Autowired
    public Comercial(CrearInformeFinanciero informe1) {
        this.informe1 = informe1;
    }*/
}
