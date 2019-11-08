package Modelos;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UsuarioTest {

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
        System.out.println("getNombre");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntos method, of class Usuario.
     */
    @Test
    public void testGetPuntos() {
        System.out.println("getPuntos");
        Usuario instance = null;
        int expResult = 0;
        int result = instance.getPuntos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPuntos method, of class Usuario.
     */
    @Test
    public void testSetPuntos() {
        System.out.println("setPuntos");
        int puntos = 0;
        Usuario instance = null;
        instance.setPuntos(puntos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirecciones method, of class Usuario.
     */
    @Test
    public void testGetDirecciones() {
        System.out.println("getDirecciones");
        Usuario instance = null;
        List<String> expResult = null;
        List<String> result = instance.getDirecciones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFacturas method, of class Usuario.
     */
    @Test
    public void testGetFacturas() {
        System.out.println("getFacturas");
        Usuario instance = null;
        List<Factura> expResult = null;
        List<Factura> result = instance.getFacturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarDireccion method, of class Usuario.
     */
    @Test
    public void testAgregarDireccion() {
        System.out.println("agregarDireccion");
        String direccion = "";
        Usuario instance = null;
        instance.addDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarDireccion method, of class Usuario.
     */
    @Test
    public void testQuitarDireccion() {
        System.out.println("quitarDireccion");
        String direccion = "";
        Usuario instance = null;
        instance.removeDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarFactura method, of class Usuario.
     */
    @Test
    public void testAgregarFactura() {
        System.out.println("agregarFactura");
        Factura factura = null;
        Usuario instance = null;
        instance.addFactura(factura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
