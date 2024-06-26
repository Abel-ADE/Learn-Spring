/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.spring02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author abel
 */
public class UsoAnnotations {

    public static void main(String[] args) {
        
        // Leer XML de configuración
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //Leer la clase de configuración
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        // Pedir un bean
        Empleados empleado1 = context.getBean("directorFinanciero", Empleados.class);
        
        //Usar bean
        System.out.println(empleado1.getInforme());
        
        //Cerrar el contexto
        context.close();
    }
}
