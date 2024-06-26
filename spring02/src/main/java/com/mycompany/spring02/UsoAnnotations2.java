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
public class UsoAnnotations2 {

    public static void main(String[] args) {
        
        /*// Leer XML de configuración
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");*/
        
        //Leer la clase de configuración
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        // Pedir beans
        Empleados empleado1 = context.getBean("comercial", Empleados.class);
        Empleados empleado2 = context.getBean("comercial", Empleados.class);
        
        //Usar bean
        System.out.println(empleado1);
        System.out.println(empleado2);
        
        System.out.println("¿Son iguales?: " + empleado1.equals(empleado2));
        
        //Cerrar el contexto
        context.close();
    }
}
