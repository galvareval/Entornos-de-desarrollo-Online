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
public class TestRetirar extends TestCase {
    
    public TestRetirar(String testName) {
        super(testName);
    }
    /**
     * Test of retirar method, of class CCuenta.
     */
    public void testRetirar() throws Exception {
        System.out.println(" Prueba retiar: ");
        double cantidad = 10.0;
        double ingreso = 30.0;
        CCuenta instance = new CCuenta();
        instance.ingresar(ingreso);
        instance.retirar(cantidad);
        System.out.println("Después de retirar: " + instance.estado());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
