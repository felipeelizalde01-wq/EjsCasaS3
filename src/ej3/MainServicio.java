package ej3;

public class MainServicio {
    public static void main(String[] args) {
        Servicio s1 = new Servicio();
        s1.setNombre("Nginx Web Server");
        s1.setPuerto(8080);
        s1.setCantidadPeticiones(0);

        s1.iniciar();
        s1.registrarPeticion();
        s1.registrarPeticion();

        System.out.println("=== SERVICIO ===");
        System.out.println("Nombre: " + s1.getNombre());
        System.out.println("Puerto: " + s1.getPuerto());
        System.out.println("Activo: " + s1.isActivo());
        System.out.println("Peticiones: " + s1.getCantidadPeticiones());

        System.out.println("\n--- Prueba de Datos Incorrectos ---");
        s1.setPuerto(-80);
        s1.setCantidadPeticiones(-10);
        System.out.println("Puerto actual: " + s1.getPuerto());
        System.out.println("Peticiones actuales: " + s1.getCantidadPeticiones());
    }
}
