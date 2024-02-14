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
public class TestIngresar extends TestCase {
    
    public TestIngresar(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * Test of ingresar method, of class CCuenta.
     */
    public void testIngresar() throws Exception {
        System.out.println("Prueba método ingresar");
        double cantidad = 0;
        CCuenta instance = new CCuenta();
        instance.ingresar(cantidad);
        System.out.println("Después de ingresar: " + instance.estado());
        // TODO review the generated test code and remove the default call to fail.
    }
}
