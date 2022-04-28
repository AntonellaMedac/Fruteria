package Fruteria;

import org.junit.Test;
import static org.junit.Assert.*;

public class FruteriaTest {
    
    public FruteriaTest() {
    }

    
    @Test
    public void testNuevoCliente() {
    Fruteria fx = new Fruteria ("Sulca");
    fx.nuevoCliente(Edad.MAYOR);
    fx.nuevoCliente(Edad.JOVEN);
    
    assertNotNull(fx.getListaClientesNoAtendidos());
    }

    /**
     * Test of atenderCliente method, of class Fruteria.
     */
    @Test
    public void testAtenderCliente() {
    }

    /**
     * Test of clienteAbandona method, of class Fruteria.
     */
    @Test
    public void testClienteAbandona() {
    }

    /**
     * Test of adelantar method, of class Fruteria.
     */
    @Test
    public void testAdelantar() {
    }

    /**
     * Test of retrasar method, of class Fruteria.
     */
    @Test
    public void testRetrasar() {
    }

    /**
     * Test of dejarPasar method, of class Fruteria.
     */
    @Test
    public void testDejarPasar() {
    }

    /**
     * Test of toString method, of class Fruteria.
     */
    @Test
    public void testToString() {
    }
    
}
