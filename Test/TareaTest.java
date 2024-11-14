import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TareaTest {
    @Before
    public void setUp() {
        Tarea.agregarTarea("Manzanas", 50);
    }
    @Test
    public void testAgregarTarea() {
        Tarea.agregarTarea("Peras", 30);
        assertEquals("Artículo: Peras, Cantidad: 30", Tarea.obtenerTarea());
    }
    @Test
    public void testEliminarTarea() {
        Tarea.eliminarTarea("Manzanas");
        assertEquals("Inventario vacío", Tarea.obtenerTarea());
    }
    @Test
    public void testObtenerTarea() {
        assertEquals("Artículo: Manzanas, Cantidad: 50", Tarea.obtenerTarea());
    }
    @Test
    public void testActualizarCantidad() {
        Tarea.actualizarPrioridad("Manzanas", 30);
        assertEquals("Artículo: Manzanas, Cantidad: 30", Tarea.obtenerTarea());
    }
}