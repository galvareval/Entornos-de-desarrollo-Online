/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package prácticaunidad3;

import junit.framework.TestCase;

/**
 *
 * @author gianf
 */
public class TestIngresarRetirar extends TestCase {
    
    public TestIngresarRetirar(String testName) {
        super(testName);
    }

    /**
     * Test of retirar ingresar .
     */
    public void testRetirar() throws Exception {
        double retiro = 10.0;
        double ingreso = 30.0;
        CCuenta instance = new CCuenta();
        System.out.println("Prueba Ingresar/retiar ");
        System.out.println("Estado inicial: " + instance.estado());
        System.out.println("Ingresamos: " + ingreso);
        instance.ingresar(ingreso);
        System.out.println("Estado depués de ingresar: " + instance.estado());
        System.out.println("Retiramos :" + retiro);
        instance.retirar(retiro);
        System.out.println("Estado después de retirar: " + instance.estado());
    }  
}
