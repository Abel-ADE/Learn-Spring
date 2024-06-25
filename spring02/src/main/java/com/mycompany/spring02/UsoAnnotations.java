/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spring02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author abel
 */
public class UsoAnnotations {

    public static void main(String[] args) {
        
        // Leer XML de configuración
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Pedir un bean
        Empleados empleado1 = context.getBean("Comercial", Empleados.class);
        
        //Usar bean
        System.out.println(empleado1.getTareas());
        
        //Cerrar el contexto
        context.close();
    }
}
