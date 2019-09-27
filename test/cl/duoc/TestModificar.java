
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        BussEmpleado instance = new BussEmpleado();
        Empleado empleadoModificado = instance.Buscar("33333333");
        empleadoModificado.setNombre("NombreCambiado");
        boolean esperado = true;
        boolean obtenido = instance.Modificar(empleadoModificado);
        Assert.assertEquals(esperado, obtenido);
    }
}
