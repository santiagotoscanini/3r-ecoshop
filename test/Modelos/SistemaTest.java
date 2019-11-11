package Modelos;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaTest {
    
    public SistemaTest() {
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
     * Test of getUsuarios method, of class Sistema.
     */
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        Sistema instance = new Sistema();
        List<Usuario> expResult = null;
        List<Usuario> result = instance.getUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUsuario method, of class Sistema.
     */
    @Test
    public void testAddUsuario() {
        System.out.println("addUsuario");
        Usuario usuario = null;
        Sistema instance = new Sistema();
        instance.addUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSucursales method, of class Sistema.
     */
    @Test
    public void testGetSucursales() {
        System.out.println("getSucursales");
        Sistema instance = new Sistema();
        List<Sucursal> expResult = null;
        List<Sucursal> result = instance.getSucursales();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSucursal method, of class Sistema.
     */
    @Test
    public void testAddSucursal() {
        System.out.println("addSucursal");
        Sucursal sucursal = null;
        Sistema instance = new Sistema();
        instance.addSucursal(sucursal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFacturas method, of class Sistema.
     */
    @Test
    public void testGetFacturas() {
        System.out.println("getFacturas");
        Sistema instance = new Sistema();
        List<Factura> expResult = null;
        List<Factura> result = instance.getFacturas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFactura method, of class Sistema.
     */
    @Test
    public void testAddFactura() {
        System.out.println("addFactura");
        Factura factura = null;
        Sistema instance = new Sistema();
        instance.addFactura(factura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlimentos method, of class Sistema.
     */
    @Test
    public void testGetAlimentos() {
        System.out.println("getAlimentos");
        Sistema instance = new Sistema();
        List<Alimento> expResult = null;
        List<Alimento> result = instance.getAlimentos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAlimento method, of class Sistema.
     */
    @Test
    public void testAddAlimento() {
        System.out.println("addAlimento");
        Alimento alimento = null;
        Sistema instance = new Sistema();
        instance.addAlimento(alimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
