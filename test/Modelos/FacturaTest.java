package Modelos;

import java.util.List;
import javafx.util.Pair;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FacturaTest {
    
    public FacturaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getSucursal method, of class Factura.
     */
    @Test
    public void testGetSucursal() {
        System.out.println("getSucursal");
        Factura instance = null;
        Sucursal expResult = null;
        Sucursal result = instance.getSucursal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSucursal method, of class Factura.
     */
    @Test
    public void testSetSucursal() {
        System.out.println("setSucursal");
        Sucursal sucursal = null;
        Factura instance = null;
        instance.setSucursal(sucursal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFormateada method, of class Factura.
     */
    @Test
    public void testGetFechaFormateada() {
        System.out.println("getFechaFormateada");
        Factura instance = null;
        String expResult = "";
        String result = instance.getFechaFormateada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPagoConTarjeta method, of class Factura.
     */
    @Test
    public void testIsPagoConTarjeta() {
        System.out.println("isPagoConTarjeta");
        Factura instance = null;
        boolean expResult = false;
        boolean result = instance.isPagoConTarjeta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPagoConTarjeta method, of class Factura.
     */
    @Test
    public void testSetPagoConTarjeta() {
        System.out.println("setPagoConTarjeta");
        boolean pagoConTarjeta = false;
        Factura instance = null;
        instance.setPagoConTarjeta(pagoConTarjeta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductos method, of class Factura.
     */
    @Test
    public void testGetProductos() {
        System.out.println("getProductos");
        Factura instance = null;
        List<Pair> expResult = null;
        List<Pair> result = instance.getProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductos method, of class Factura.
     */
    @Test
    public void testSetProductos() {
        System.out.println("setProductos");
        List<Pair> productos = null;
        Factura instance = null;
        instance.setProductos(productos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
