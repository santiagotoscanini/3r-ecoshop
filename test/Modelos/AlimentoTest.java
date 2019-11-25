package Modelos;

import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlimentoTest {
    
    Alimento instance = new Alimento("Test1","Desc1",1,"F1");
    
    public AlimentoTest() {
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
     * Test of getNombre method, of class Alimento.
     */
    @Test
    public void testGetNombre() {
        String expResult = "Test1";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Alimento.
     */
    @Test
    public void testSetNombre() {
        String expResult = "Frutilla";
        instance.setNombre("Frutilla");
        assertEquals(expResult, instance.getNombre());
    }

    /**
     * Test of getDescripcion method, of class Alimento.
     */
    @Test
    public void testGetDescripcion() {
        String expResult = "Desc1";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescripcion method, of class Alimento.
     */
    @Test
    public void testSetDescripcion() {
        String expResult = "1kg de futilla congelada";
        instance.setDescripcion("1kg de futilla congelada");
        assertEquals(expResult, instance.getDescripcion());
    }

    /**
     * Test of getPrecio method, of class Alimento.
     */
    @Test
    public void testGetPrecio() {
        int expResult = 1;
        int result = instance.getPrecio();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrecio method, of class Alimento.
     */
    @Test
    public void testSetPrecio() {
        int expResult = 200;
        instance.setPrecio(200);
        assertEquals(expResult, instance.getPrecio());
    }

    /**
     * Test of getId method, of class Alimento.
     */
    @Test
    public void testGetId() {
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategoria method, of class Alimento.
     */
    @Test
    public void testSetCategoria() {
        String expResult = "Fruta Congelada";
        instance.setCategoria("Fruta Congelada");
        assertEquals(expResult, instance.getCategoria());
    }

    /**
     * Test of getCategoria method, of class Alimento.
     */
    @Test
    public void testGetCategoria() {
        String expResult = "F1";
        String result = instance.getCategoria();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Alimento.
     */
    @Test
    public void testEquals() {
        Alimento nuevo = new Alimento("n2", "d2", 1, "Frutos secos");
        assertFalse(nuevo.equals(instance));
    }

    /**
     * Test of toString method, of class Alimento.
     */
    @Test
    public void testToString() {
        String expResult = "1kg de frutillas";
        instance.setNombre("1kg de frutillas");
        assertEquals(expResult, instance.toString()); 
    }
    
}
