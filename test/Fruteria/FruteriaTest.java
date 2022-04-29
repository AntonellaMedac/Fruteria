package Fruteria;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class FruteriaTest {
    
    public FruteriaTest() {
    }

    
    @Test
    public void testNuevoCliente() {
    Fruteria f1 = new Fruteria ("Sulca");
    f1.nuevoCliente(Edad.MAYOR);
    f1.nuevoCliente(Edad.JOVEN);
    
    assertNotNull(f1.getListaClientesNoAtendidos());
    }

    /**
     * Test of atenderCliente method, of class Fruteria.
     */
    @Test
    public void testAtenderCliente() {
        Fruteria f1 = new Fruteria ("Sulca");
        f1.nuevoCliente(Edad.MAYOR);
        f1.atenderCliente();
        assertFalse(!f1.getListaClientesNoAtendidos().isEmpty());
        
    }

    /**
     * Test of clienteAbandona method, of class Fruteria.
     */
    @Test
    public void testClienteAbandonayDesapareceDeLaLista() {
        Fruteria f1 = new Fruteria("Sulca");
        f1.nuevoCliente(Edad.MAYOR);
        ArrayList<Cliente> copia = (ArrayList<Cliente>) f1.getListaClientesNoAtendidos().clone();
        f1.clienteAbandona(f1.getListaClientesNoAtendidos().get(0).getnTicket());
        assertNotEquals(copia,f1.getListaClientesNoAtendidos());
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
