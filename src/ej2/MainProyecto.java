package ej2;

public class MainProyecto {
    public static void main(String[] args) {
        Proyecto proy1 = new Proyecto();
        proy1.setNombre("Sistema IoT Agricultura");
        proy1.setResponsable("Felipe");
        proy1.setProgreso(40);

        System.out.println("=== PROYECTO ===");
        System.out.println("Nombre: " + proy1.getNombre());
        System.out.println("Responsable: " + proy1.getResponsable());
        System.out.println("Progreso inicial: " + proy1.getProgreso() + "%");
        System.out.println("Terminado: " + proy1.isTerminado());

        System.out.println("\n--- Avanzando Proyecto ---");
        proy1.avanzar(35);
        System.out.println("Progreso luego de avanzar 35%: " + proy1.getProgreso() + "%");

        proy1.avanzar(50);
        System.out.println("Progreso luego de intentar superar 100%: " + proy1.getProgreso() + "%");
        System.out.println("Terminado: " + proy1.isTerminado());
    }
}
