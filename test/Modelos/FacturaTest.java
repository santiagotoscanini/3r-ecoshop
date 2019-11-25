
package Modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FacturaTest {
    
    Factura instance;
    
    public FacturaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        List<ElementoCarrito> alimentos = new ArrayList<>();
        alimentos.add(new ElementoCarrito(new Alimento("F3", "C4", 1, "FS")));
        instance = new Factura(new Date(), false, alimentos, "D1", new Usuario("N1", "CI1", "D1"), 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Factura.
     */
    @Test
    public void testGetId() {
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDireccion method, of class Factura.
     */
    @Test
    public void testGetDireccion() {
        String expResult = "D1";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class Factura.
     */
    @Test
    public void testSetDireccion() {
        String expResult = "D2";
        instance.setDireccion(expResult);
        assertEquals(expResult, instance.getDireccion());
    }

    /**
     * Test of getFechaFormateada method, of class Factura.
     */
    @Test
    public void testGetFechaFormateada() {
//        System.out.println("getFechaFormateada");
//        Sistema sis = null;
//        Factura instance = null;
//        String expResult = "";
//        String result = instance.getFechaFormateada(sis);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isPagoConTarjeta method, of class Factura.
     */
    @Test
    public void testIsPagoConTarjeta() {
        boolean expResult = false;
        assertEquals(expResult, instance.isPagoConTarjeta());
    }

    /**
     * Test of setPagoConTarjeta method, of class Factura.
     */
    @Test
    public void testSetPagoConTarjeta() {
        boolean expResult = true;
        instance.setPagoConTarjeta(true);
        assertEquals(expResult, instance.isPagoConTarjeta());
    }

    /**
     * Test of getProductos method, of class Factura.
     */
    @Test
    public void testGetProductos() {
//        System.out.println("getProductos");
//        Factura instance = null;
//        List<ElementoCarrito> expResult = null;
//        List<ElementoCarrito> result = instance.getProductos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//        List<ElementoCarrito> expAlimentos = new ArrayList<>();
//        expAlimentos.add(new ElementoCarrito(new Alimento("F3", "C4", 1, "FS")));
//        assertFalse(expAlimentos, instance.getProductos());

    }

    /**
     * Test of setProductos method, of class Factura.
     */
    @Test
    public void testSetProductos() {
        List<ElementoCarrito> expAlimentos = new ArrayList<>();
        expAlimentos.add(new ElementoCarrito(new Alimento("F3", "C4", 1, "FS")));
        instance.setProductos(expAlimentos);
        assertEquals(expAlimentos, instance.getProductos());
    }

    /**
     * Test of getUsuario method, of class Factura.
     */
    @Test
    public void testGetUsuario() {
        Usuario expUsuario = new Usuario("N1", "CI1", "D1");
        assertEquals(expUsuario, instance.getUsuario());
    }

    /**
     * Test of setUsuario method, of class Factura.
     */
    @Test
    public void testSetUsuario() {
        Usuario expUsuario = new Usuario("N1", "CI2", "D1");
        instance.setUsuario(expUsuario);
        assertEquals(expUsuario, instance.getUsuario());
    }

    /**
     * Test of getFechaEmision method, of class Factura.
     */
    @Test
    public void testGetFechaEmision() {
//        System.out.println("getFechaEmision");
//        Factura instance = null;
//        Date expResult = null;
//        Date result = instance.getFechaEmision();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaEntrega method, of class Factura.
     */
    @Test
    public void testGetFechaEntrega() {
//        System.out.println("getFechaEntrega");
//        Factura instance = null;
//        Date expResult = null;
//        Date result = instance.getFechaEntrega();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontoTotal method, of class Factura.
     */
    @Test
    public void testGetMontoTotal() {
        int expResult = 1;
        assertEquals(expResult, instance.getMontoTotal());
    }

}