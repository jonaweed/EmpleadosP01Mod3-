
package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class TestListar {

    public TestListar() {
    }
    
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "22222222";
        BussEmpleado instance = new BussEmpleado();
        String rutEsperado = rut;
        String rutObtenido = instance.Buscar(rut).getRut();
        Assert.assertEquals(rutEsperado, rutObtenido);
    }

}
