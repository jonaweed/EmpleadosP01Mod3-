
package cl.duoc;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class TestMontoBono {

    public TestMontoBono() {
    }
    
     @Test
    public void testMontoTotal() {
        System.out.println("montoBono");
        BussEmpleado instance = new BussEmpleado();
        Empleado empleado = instance.Buscar("55555555");
        assertTrue(empleado.montoBono() == 200000);
    }
}
