package Modelos;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getTelefono method, of class Usuario.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Usuario instance = null;
        int expResult = 0;
        int result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Usuario.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 0;
        Usuario instance = null;
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of addDireccion method, of class Usuario.
     */
    @Test
    public void testAddDireccion() {
        System.out.println("addDireccion");
        String direccion = "";
        Usuario instance = null;
        instance.addDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDireccion method, of class Usuario.
     */
    @Test
    public void testRemoveDireccion() {
        System.out.println("removeDireccion");
        String direccion = "";
        Usuario instance = null;
        instance.removeDireccion(direccion);
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
     * Test of addFactura method, of class Usuario.
     */
    @Test
    public void testAddFactura() {
        System.out.println("addFactura");
        Factura factura = null;
        Usuario instance = null;
        instance.addFactura(factura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarrito method, of class Usuario.
     */
    @Test
    public void testGetCarrito() {
        System.out.println("getCarrito");
        Usuario instance = null;
        List<Alimento> expResult = null;
        List<Alimento> result = instance.getCarrito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDElementoCarrito method, of class Usuario.
     */
    @Test
    public void testAddDElementoCarrito() {
        System.out.println("addDElementoCarrito");
        Alimento alimento = null;
        Usuario instance = null;
        instance.addDElementoCarrito(alimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeElementoCarrit method, of class Usuario.
     */
    @Test
    public void testRemoveElementoCarrit() {
        System.out.println("removeElementoCarrit");
        Alimento alimento = null;
        Usuario instance = null;
        instance.removeElementoCarrit(alimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
