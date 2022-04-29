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
    public void testDejarPasarComprobarPosicionYEdad() {
        Fruteria fx = new Fruteria("Juan");
        fx.nuevoCliente(Edad.JOVEN);
        fx.nuevoCliente(Edad.MAYOR);
        
        fx.dejarPasar();
        //comprobamos que el ticket de la posicion 1 efectivamenta ya no es la misma de antes 
        assertNotEquals(fx.getListaClientesNoAtendidos().get(1),fx.getListaClientesNoAtendidos().get(0).getnTicket() );
        //nos aseguramos de que el vcalor de la edad es Mayor
        assertTrue(fx.getListaClientesNoAtendidos().get(0).getEdad()==Edad.MAYOR);
    
    }

    /**
     * Test of toString method, of class Fruteria.
     */
    @Test
    public void testToString() {
    }
    
}
