
package Modelos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ElementoCarritoTest {

    ElementoCarrito instance;
    
    public ElementoCarritoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ElementoCarrito(new Alimento("s","d",1,"2"));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAlimento method, of class ElementoCarrito.
     */
    @Test
    public void testGetAlimento() {
       Alimento expResult = new Alimento("F3", "C3", 1, "Frutas");
       assertFalse(expResult.equals(instance.getAlimento()));
    }

    /**
     * Test of getUnidades method, of class ElementoCarrito.
     */
    @Test
    public void testGetUnidades() {
        int expResult = 1;
        int result = instance.getUnidades();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCompostable method, of class ElementoCarrito.
     */
    @Test
    public void testGetCompostable() {
        boolean expResult = true;
        boolean result = instance.getCompostable();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAlimento method, of class ElementoCarrito.
     */
    @Test
    public void testSetAlimento() {
        Alimento expResult = new Alimento("F3", "C4", 1, "Frutos secos");
        instance.setAlimento(expResult);
        assertEquals(expResult, instance.getAlimento());
    }

    /**
     * Test of setUnidades method, of class ElementoCarrito.
     */
    @Test
    public void testSetUnidades() {
        int expResult = 3;
        instance.setUnidades(3);
        assertEquals(expResult, instance.getUnidades());
    }

    /**
     * Test of setCompostable method, of class ElementoCarrito.
     */
    @Test
    public void testSetCompostableFalse() {
        boolean expResult = false;
        instance.setCompostable(false);
        assertEquals(expResult, instance.getCompostable());
    }

    /**
     * Test of setCompostable method, of class ElementoCarrito.
     */
    @Test
    public void testSetCompostableTrue() {
        boolean expResult = true;
        instance.setCompostable(true);
        assertEquals(expResult, instance.getCompostable());
    }

    
    /**
     * Test of equals method, of class ElementoCarrito.
     */
    @Test
    public void testEquals() {
        ElementoCarrito nuevo = new ElementoCarrito (new Alimento("n2", "d2", 1, "Frutos secos"));
        assertFalse(nuevo.equals(instance));
    }
    
}
