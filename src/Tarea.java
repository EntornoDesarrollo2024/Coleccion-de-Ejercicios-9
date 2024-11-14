public class Tarea {
    // Variables globales para almacenar el nombre y cantidad del artículo
    private static String nombreArticulo = null;
    private static int cantidadArticulo = 0;

    public static void agregarTarea(String nombre, int cantidad) {
        nombreArticulo = nombre;
        cantidadArticulo = cantidad;
    }

    public static void eliminarTarea(String nombre) {
        if (nombreArticulo != null && nombreArticulo.equals(nombre)) {
            nombreArticulo = null;
            cantidadArticulo = 0;
        }
    }

    public static String obtenerTarea() {
        if (nombreArticulo == null) {
            return "Inventario vacío";
        }
        return "Artículo: " + nombreArticulo + ", Cantidad: " + cantidadArticulo;
    }

    public static void actualizarPrioridad(String nombre, int nuevaCantidad) {
        if (nombreArticulo != null && nombreArticulo.equals(nombre)) {
            cantidadArticulo = nuevaCantidad;
        }
    }
}
