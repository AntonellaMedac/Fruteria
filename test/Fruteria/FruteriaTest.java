package Fruteria;

import org.junit.Assert;
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
    fx.nuevoCliente(Edad.MAYOR);
    fx.nuevoCliente(Edad.JOVEN);
    fx.nuevoCliente(Edad.MAYOR);
    
    //Comrpueba que se añada a la lista de No atendidos
    assertNotNull(fx.getListaClientesNoAtendidos());
    
    //assertEquals(fx.getContadorClientes() == fx.nuevoCliente(Edad.MAYOR));
    
    //Comprobar que los tickets se asignan de manera correlativa
    }
    
    /**
     * Test of atenderCliente method, of class Fruteria.
     */
    @Test
    public void testAtenderCliente() {
        
        //Manu ya comprobo si uno se elimino
        //Comprobar que se añada el cliente a la otra lista
        //Comprobar dentro de la lista que hubiera preferencias a los mayores
        
    }

    /**
     * Test of clienteAbandona method, of class Fruteria.
     */
    @Test
    public void testClienteAbandona() {
        
        Fruteria fx = new Fruteria ("Sulca");
        fx.nuevoCliente(Edad.MAYOR);
        fx.nuevoCliente(Edad.JOVEN);
        fx.nuevoCliente(Edad.JOVEN);
        
        fx.clienteAbandona(1);
        fx.clienteAbandona(2);
        
        int ticket = fx.getListaClientesNoAtendidos().get(0).getnTicket();
        int ticket2 = 3;
        
        
        Assert.assertEquals(ticket, ticket2);//Comprueba que el ticket corresponda al tercer cliente 
    }

    /**
     * Test of adelantar method, of class Fruteria.
     */
    @Test
    public void testAdelantar() {
        
        //Creamos dos clientes, el que va delante deja pasar al de atras
    }

    /**
     * Test of retrasar method, of class Fruteria.
     */
    @Test
    public void testRetrasar() {
        
        Fruteria fx = new Fruteria ("Sulca");
        //Creamos dos clientes, uno deja pasar al que tiene detras
        fx.nuevoCliente(Edad.MAYOR);
        fx.nuevoCliente(Edad.JOVEN);
        
        int ticket1 = fx.getListaClientesNoAtendidos().get(0).getnTicket();
        int ticket2 = fx.getListaClientesNoAtendidos().get(1).getnTicket();
        
        fx.retrasar(ticket1);
        
        
        Assert.assertEquals(ticket1, fx.getListaClientesNoAtendidos().get(1).getnTicket());//Comprueba que el cliente retrasado concuerde con el numero del ticket de la posicion siguiente
        
         
    }

    /**
     * Test of dejarPasar method, of class Fruteria.
     */
    @Test
    public void testDejarPasar() {
        
    }

    private void assertEquals(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
