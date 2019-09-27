
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    public TestAgregar() {
    }
    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado empleado = new Empleado("17763031-0", "Maria Maldonado", 28, 3);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido= instance.Crear(empleado);
        Assert.assertEquals(esperado, obtenido);
    }
}
