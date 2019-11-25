
package Modelos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SucursalTest {
    
    Sucursal instance = new Sucursal("Dir1", 7548943);
    
    public SucursalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDireccion method, of class Sucursal.
     */
    @Test
    public void testGetDireccion() {
        String expResult = "Dir1";
        assertEquals(expResult, instance.getDireccion());
    }

    /**
     * Test of setDireccion method, of class Sucursal.
     */
    @Test
    public void testSetDireccion() {
        String expResult = "Dir2";
        instance.setDireccion(expResult);
        assertEquals(expResult, instance.getDireccion());
    }

    /**
     * Test of getTelefono method, of class Sucursal.
     */
    @Test
    public void testGetTelefono() {
        int expResult = 7548943;
        assertEquals(expResult, instance.getTelefono());
    }

    /**
     * Test of setTelefono method, of class Sucursal.
     */
    @Test
    public void testSetTelefono() {
        int expResult = 884578920;
        instance.setTelefono(expResult);
        assertEquals(expResult, instance.getTelefono());
    }

    /**
     * Test of getId method, of class Sucursal.
     */
    @Test
    public void testGetId() {
        int expResult = 1;
        assertEquals(expResult, instance.getId());
    }
    
}
