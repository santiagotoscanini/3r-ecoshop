
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


public class UsuarioTest {
    
    Usuario instance = new Usuario("N1", "CI2", "D1");
    
    public UsuarioTest() {
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
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        String expResult = "N1";
        assertEquals(expResult, instance.getNombre());
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        String expResult = "N2";
        instance.setNombre(expResult);
        assertEquals(expResult, instance.getNombre());
    }

    /**
     * Test of getPuntos method, of class Usuario.
     */
    @Test
    public void testGetPuntos() {
        double expResult = 0.0;
        assertEquals(expResult, instance.getPuntos(), 0);
    }

    /**
     * Test of sumarPunto method, of class Usuario.
     */
    @Test
    public void testSumarPunto() {
        instance.sumarPuntos(1.2);
        double expResult = 1.2;
        assertEquals(expResult, instance.getPuntos(), 0);
    }

    /**
     * Test of getDirecciones method, of class Usuario.
     */
    @Test
    public void testGetDirecciones() {
        List<String> expResult = new ArrayList<>();
        expResult.add("D1");
        assertEquals(expResult, instance.getDirecciones());
    }

    /**
     * Test of addDireccion method, of class Usuario.
     */
    @Test
    public void testAddDireccion() {
        String nuevaDir = "D2";
        List<String> expResult = new ArrayList<>();
        expResult.add("D1");
        expResult.add("D2");
        instance.addDireccion(nuevaDir);
        assertEquals(expResult, instance.getDirecciones());
    }

    /**
     * Test of removeDireccion method, of class Usuario.
     */
    @Test
    public void testRemoveDireccion() {
        String nuevaDir = "D2";
        List<String> expResult = new ArrayList<>();
        expResult.add("D1");
        instance.removeDireccion("D2");
        assertEquals(expResult, instance.getDirecciones());
    }

    /**
     * Test of getFacturas method, of class Usuario.
     */
    @Test
    public void testGetFacturas() {
        List<Factura> expResult = new ArrayList();
        assertEquals(expResult, instance.getFacturas());
    }

    /**
     * Test of addFactura method, of class Usuario.
     */
    @Test
    public void testAddFactura() {
        List<Factura> expResult = new ArrayList();
        List<ElementoCarrito> productos = new ArrayList();
        productos.add(new ElementoCarrito(new Alimento("A1", "D1", 1, "FS")));
        Factura factura = new Factura(new Date(), false, productos, "Dir1", new Usuario("N1", "CI1", "Dir1"), 1);
        expResult.add(factura);
        instance.addFactura(factura);
        assertEquals(expResult, instance.getFacturas());
    }

    /**
     * Test of compareTo method, of class Usuario.
     */
    @Test
    public void testCompareTo() {
        Usuario expResult = new Usuario("N3", "CI2", "D1");
        assertTrue(instance.compareTo(expResult) == 0);
    }

    /**
     * Test of getElementosCarrito method, of class Usuario.
     */
    @Test
    public void testGetElementosCarrito() {
        List<ElementoCarrito> productos = new ArrayList();
        assertEquals(productos, instance.getElementosCarrito());
    }

    /**
     * Test of agregarElementoCarrito method, of class Usuario.
     */
    @Test
    public void testAgregarElementoCarrito() {
        List<ElementoCarrito> productos = instance.getElementosCarrito();
        ElementoCarrito elemento = new ElementoCarrito(new Alimento("A1", "D1", 1, "FS"));
        productos.add(elemento);
        instance.agregarElementoCarrito(elemento);
        assertEquals(productos, instance.getElementosCarrito());
    }

    /**
     * Test of setElementosCarrito method, of class Usuario.
     */
    @Test
    public void testSetElementosCarrito() {
        List<ElementoCarrito> productos = new ArrayList();
        ElementoCarrito elemento = new ElementoCarrito(new Alimento("A2", "D1", 1, "FS"));
        productos.add(elemento);
        instance.setElementosCarrito(productos);
        assertEquals(productos, instance.getElementosCarrito());
    }

    /**
     * Test of equals method, of class Usuario.
     */
    @Test
    public void testEquals() {
        Usuario expResult = new Usuario("N3", "CI2", "D1");
        assertTrue(instance.equals(expResult));
    }
    
}
