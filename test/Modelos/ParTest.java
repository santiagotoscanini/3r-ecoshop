package Modelos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ParTest {

    private Par<Alimento, Integer> instance;
    private Alimento alimento;
    
    public ParTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.alimento = new Alimento("Alimento prueba test","desc alimento test",20,"Frutos Secos");
        this.instance = new Par<>(alimento, 1);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPrimerValor method, of class Par.
     */
    @Test
    public void testGetPrimerValor() {
        assertEquals(alimento, instance.getPrimerValor());
    }

    /**
     * Test of setPrimerValor method, of class Par.
     */
    @Test
    public void testSetPrimerValor() {
        Alimento expResult = new Alimento("A2", "D2", 2, "FS");
        instance.setPrimerValor(expResult);
        assertEquals(expResult, instance.getPrimerValor());
    }

    /**
     * Test of getSegundoValor method, of class Par.
     */
    @Test
    public void testGetSegundoValor() {
        Integer expResult = 1;
        assertEquals(expResult, instance.getSegundoValor());
    }

    /**
     * Test of setSegundoValor method, of class Par.
     */
    @Test
    public void testSetSegundoValor() {
        Integer expResult = 2;
        instance.setSegundoValor(2);
        assertEquals(expResult, instance.getSegundoValor());
    }

    /**
     * Test of compareTo method, of class Par.
     */
    @Test
    public void testCompareTo() {
        Par<Alimento, Integer> expResult = new Par(new Alimento("A1", "D3", 1, "FS"), 1);
        assertTrue(instance.compareTo(expResult) == 0);
    }

}
