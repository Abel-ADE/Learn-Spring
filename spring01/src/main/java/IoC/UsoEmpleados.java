/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author abel
 */
public class UsoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // Creación de objetos de tipo Empleado
        
        Empleados empleado1 = new DirectorEmpleado();
        
        // Uso de los objetos creados
        
        System.out.println(empleado1.getTareas());
        */
        
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Empleados juan = contexto.getBean("miEmpleado",Empleados.class);
        
        System.out.println(juan.getTareas());
        
        contexto.close();
        
    }
    
}
