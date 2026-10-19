package ej1;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        user1.setUsername("felipe_dev");
        user1.setCorreo("felipe@udla.edu.ec");
        user1.setNivel(3);
        user1.activar();

        Usuario user2 = new Usuario();
        user2.setUsername("admin_root");
        user2.setCorreo("admin@sistema.com");
        user2.setNivel(10);
        user2.desactivar();

        System.out.println("=== USUARIOS ===");
        System.out.println("Username: " + user1.getUsername());
        System.out.println("Correo: " + user1.getCorreo());
        System.out.println("Nivel: " + user1.getNivel());
        System.out.println("Activo: " + user1.isActivo());
        System.out.println("");

        System.out.println("Username: " + user2.getUsername());
        System.out.println("Correo: " + user2.getCorreo());
        System.out.println("Nivel: " + user2.getNivel());
        System.out.println("Activo: " + user2.isActivo());

        System.out.println("\n--- Prueba de Datos Incorrectos ---");
        user1.setUsername("");
        user1.setNivel(-5);
        System.out.println("Username Usuario 1: " + user1.getUsername());
        System.out.println("Nivel Usuario 1: " + user1.getNivel());
    }
}
