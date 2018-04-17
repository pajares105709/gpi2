/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpedidosartesanos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author linux1
 */
public class VentanaPedidosTest {
    
    VentanaPedidos ven;
    
    public VentanaPedidosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ven = new VentanaPedidos();
        ven.setCantMesa(2);
        ven.setCantSilla(2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class VentanaPedidos.
     
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VentanaPedidos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    @Test
    public void testCalcularPrecios() {
        ven.calcularPrecios();
        Double real = (Double) ven.getTotalMesa();
        Double esperado = (Double) ven.getPrecioMesa()*2;
        System.out.println(real + " mesa " + esperado);
        assertEquals(esperado, real, 0.01);
    }
    
    @Test
    public void testCalcularPrecios2() {
        ven.calcularPrecios();
        Double real = (Double) ven.getTotalSilla();
        Double esperado = (Double) ven.getPrecioSilla()*2;
        System.out.println(real + " silla " + esperado);
        assertEquals(esperado, real, 0.01);
    }
    
}
