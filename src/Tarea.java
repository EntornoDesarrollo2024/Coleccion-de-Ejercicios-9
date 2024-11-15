public class Tarea {
    // Variables globales para almacenar el nombre y cantidad del artículo
    private static String nombreTarea = null;
    private static int cantidadTarea = 0;

    public static void agregarTarea(String nombre, int cantidad) {
        nombreTarea = nombre;
        cantidadTarea = cantidad;
    }

    public static void eliminarTarea(String nombre) {
        if (nombreTarea != null && nombreTarea.equals(nombre)) {
            nombreTarea = null;
            cantidadTarea = 0;
        }
    }

    public static String obtenerTarea() {
        if (nombreTarea == null) {
            return "Sin Tarea";
        }
        return "Tarea: " + nombreTarea + ", Prioridad: " + cantidadTarea;
    }

    public static void actualizarPrioridad(String nombre, int nuevaCantidad) {
        if (nombreTarea != null && nombreTarea.equals(nombre)) {
            cantidadTarea = nuevaCantidad;
        }
    }
}

