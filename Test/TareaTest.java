import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TareaTest {
    @Before
    public void setUp() {
        Tarea.agregarTarea("Tarea 1", 50);
    }
    @Test
    public void testAgregarTarea() {
        Tarea.agregarTarea("Tarea 2", 30);
        assertEquals("Tarea: Tarea 2, Prioridad: 30", Tarea.obtenerTarea());
    }
    @Test
    public void testEliminarTarea() {
        Tarea.eliminarTarea("Tarea 1");
        assertEquals("Sin Tarea", Tarea.obtenerTarea());
    }
    @Test
    public void testObtenerTarea() {
        assertEquals("Tarea: Tarea 1, Prioridad: 50", Tarea.obtenerTarea());
    }
    @Test
    public void testActualizarCantidad() {
        Tarea.actualizarPrioridad("Tarea 1", 30);
        assertEquals("Tarea: Tarea 1, Prioridad: 30", Tarea.obtenerTarea());
    }
}