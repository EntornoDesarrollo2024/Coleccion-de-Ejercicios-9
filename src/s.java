class LoginSimple {

    private static final String usuario1 = "usuario1";
    private static final String contrasena1 = "contrasena123";

    private static final String usuario2 = "usuario2";
    private static final String contrasena2 = "miContrasena";

    // Metodo para iniciar sesión
    public static String iniciarSesion(String usuario, String contrasena) {
        if ((usuario.equals(usuario1) && contrasena.equals(contrasena1)) ||
                (usuario.equals(usuario2) && contrasena.equals(contrasena2))) {
            return "Inicio de sesión exitoso";
        }
        return "Usuario o contraseña incorrectos";
    }


    //Metodo principal para probar
    public static void main(String[] args) {
        System.out.println(iniciarSesion("usuario1", "contrasena123")); // Inicio de sesión exitoso
        System.out.println(iniciarSesion("usuario2", "miContrasena")); // Inicio de sesión exitoso
        System.out.println(iniciarSesion("usuario1", "incorrecta")); // Usuario o contraseña incorrectos
        System.out.println(iniciarSesion("usuario3", "miContrasena")); // Usuario o contraseña incorrectos
    }
}

