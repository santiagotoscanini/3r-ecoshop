
package Modelos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SistemaTest {
    
    Sistema instance = new Sistema();
    
    public SistemaTest() {
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
     * Test of setSelectedUser method, of class Sistema.
     */
    @Test
    public void testSetSelectedUser() {
        Usuario expResult = new Usuario("N1", "CI1", "D1");
        instance.setSelectedUser(new Usuario("N1", "CI1", "D1"));
        assertEquals(expResult, instance.getSelectedUser());
    }

    /**
     * Test of getSelectedUser method, of class Sistema.
     */
    @Test
    public void testGetSelectedUser() {
        Usuario expResult = new Usuario("N1", "CI1", "D1");
        instance.setSelectedUser(new Usuario("N1", "CI1", "D1"));
        assertEquals(expResult, instance.getSelectedUser());
    }

    /**
     * Test of addSucursal method, of class Sistema.
     */
    @Test
    public void testAddSucursal() {
        Sucursal sucursal = new Sucursal("D1", 4245667);
        List<Sucursal> expResult = instance.getSucursales();
        expResult.add(sucursal);
        instance.addSucursal(sucursal);
        assertEquals(expResult, instance.getSucursales());
    }

    /**
     * Test of eliminarSucursalPorId method, of class Sistema.
     */
    @Test
    public void testEliminarSucursalPorId() {
        Sucursal sucursal = new Sucursal("D1", 4245667);
        List<Sucursal> expResult = instance.getSucursales();
        instance.addSucursal(sucursal);
        instance.eliminarSucursalPorId(sucursal.getId());
        assertEquals(expResult, instance.getSucursales());
    }
    
    /**
     * Test of eliminarSucursalPorId method, of class Sistema.
     */
    @Test
    public void testEliminarSucursalPorIdNoExistente() {
        List<Sucursal> expResult = instance.getSucursales();
        instance.eliminarSucursalPorId(-1);
        assertEquals(expResult, instance.getSucursales());
    }

    /**
     * Test of eliminarAlimentoPorId method, of class Sistema.
     */
    @Test
    public void testEliminarAlimentoPorId() {
        Alimento alimento = new Alimento("A1", "C1", 1, "FS");
        List<Alimento> expResult = instance.getAlimentos();
        instance.addAlimento(alimento);
        instance.eliminarAlimentoPorId(alimento.getId());
        assertEquals(expResult, instance.getAlimentos());
    }

    /**
     * Test of getSucursales method, of class Sistema.
     */
    @Test
    public void testGetSucursales() {
        List<Sucursal> expResult = instance.getSucursales();
        assertEquals(expResult, instance.getSucursales());
    }
    
    /**
     * Test of getSucursales method, of class Sistema.
     */
    @Test
    public void testGetSucursalesConUnaSucursal() {
        List<Sucursal> expResult = instance.getSucursales();
        Sucursal nueva = new Sucursal("Dir2", 324544665);
        expResult.add(nueva);
        instance.addSucursal(nueva);
        assertEquals(expResult, instance.getSucursales());
    }

    /**
     * Test of addUsuario method, of class Sistema.
     */
    @Test
    public void testAddUsuario() {
        Usuario expResult = new Usuario("N1", "CI1", "Dir1");
        instance.addUsuario(new Usuario("N1", "CI1", "Dir1"));
        assertEquals(expResult, instance.getRanking().get(instance.getRanking().indexOf(expResult)));
    }

    /**
     * Test of getRanking method, of class Sistema.
     */
    @Test
    public void testGetRanking() {
        Usuario usuario = new Usuario("N1", "CI1", "Dir1");
        
        List<Usuario> expResult = instance.getRanking();
        expResult.add(usuario);
        instance.addUsuario(usuario);
        
        assertEquals(expResult, instance.getRanking());
    }

    /**
     * Test of getMasVendidos method, of class Sistema.
     */
    @Test
    public void testGetMasVendidos() {
        Alimento[] expResult = new Alimento[instance.getAlimentos().size()];
        assertEquals(expResult, instance.getMasVendidos());
    }

    /**
     * Test of addCantidadAlimento method, of class Sistema.
     */
    @Test
    public void testAddCantidadAlimento() {
        Alimento alimento = new Alimento("A1", "D1", 1, "fs");
        instance.addAlimento(alimento);
        instance.addCantidadAlimento(alimento.getId(), 3);
        assertEquals(alimento, instance.getMasVendidos()[0]);
    }

    /**
     * Test of addAlimento method, of class Sistema.
     */
    @Test
    public void testAddAlimento() {
        Alimento alimento = new Alimento("A1", "C1", 1, "fs");
        instance.addAlimento(alimento);
        assertEquals(alimento, instance.getAlimento(alimento.getId()));
    }

    /**
     * Test of getMaxAlimento method, of class Sistema.
     */
    @Test
    public void testGetMaxAlimento() {
        Alimento alimento = new Alimento("A1", "D1", 1, "FC");
        Alimento alimento2 = new Alimento("A2", "D2", 1, "FC");
        instance.addAlimento(alimento);
        instance.addAlimento(alimento2);
        instance.addCantidadAlimento(alimento.getId(), 5);
        assertEquals(alimento, instance.getMaxAlimento());
        
    }

    /**
     * Test of getAlimentos method, of class Sistema.
     */
    @Test
    public void testGetAlimentos() {
        List<Alimento> expResult =  instance.getAlimentos();
        Alimento alimento = new Alimento("A1", "D1", 1, "FC");
        Alimento alimento2 = new Alimento("A2", "D2", 1, "FC");
        instance.addAlimento(alimento);
        instance.addAlimento(alimento2);
        expResult.add(alimento);
        expResult.add(alimento2);
        assertEquals(expResult, instance.getAlimentos());
    }

    /**
     * Test of getFormat method, of class Sistema.
     */
    @Test
    public void testGetFormat() {
        DateFormat expFormato = new SimpleDateFormat("dd/mm/YYYY HH:mm");
        assertEquals(expFormato, instance.getFormat());
    }

    /**
     * Test of getCantEnvReu method, of class Sistema.
     */
    @Test
    public void testGetCantEnvReu() {
        int expResult = 5;
        instance.setCantEnvReu(5);
        assertEquals(expResult, instance.getCantEnvReu());
    }

    /**
     * Test of setCantEnvReu method, of class Sistema.
     */
    @Test
    public void testSetCantEnvReu() {
        int expResult = 5;
        instance.setCantEnvReu(5);
        assertEquals(expResult, instance.getCantEnvReu());
    }

    /**
     * Test of getCantEnvComp method, of class Sistema.
     */
    @Test
    public void testGetCantEnvComp() {
        int expResult = 5;
        instance.setCantEnvComp(5);
        assertEquals(expResult, instance.getCantEnvComp());
    }

    /**
     * Test of setCantEnvComp method, of class Sistema.
     */
    @Test
    public void testSetCantEnvComp() {
        int expResult = 5;
        instance.setCantEnvComp(5);
        assertEquals(expResult, instance.getCantEnvComp());
    }

    /**
     * Test of getCantKilos method, of class Sistema.
     */
    @Test
    public void testGetCantKilos() {
        double expResult = 0.14;
        assertEquals(expResult, instance.getCantKilos(), 0);
    }

    /**
     * Test of getAlimento method, of class Sistema.
     */
    @Test
    public void testGetAlimento() {
        Alimento expResult = new Alimento("A1", "D1", 1, "FS");
        instance.addAlimento(expResult);
        assertEquals(expResult, instance.getAlimento(expResult.getId()));
    }
    
}
