import java.util.Scanner;

public class Main {
    public void generarShip() {
        final String consonantes = "bcdfghjlmnñpqrstvwxyzBCDFGHJLMNÑPQRSTVWXYZ";
        Scanner in = new Scanner(System.in);
        System.out.println("¡Bienvenido al generador de ships!\nIntroduce '0' para salir.");

        String nombre1;
        String nombre2;
        do {


            System.out.print("Nombre 1: ");
            nombre1 = in.next();

            System.out.print("Nombre 2: ");
            nombre2 = in.next();

            String subNombre1 = nombre1.substring(0, (nombre1.length() / 2));
            String subNombre2 = nombre2.substring((nombre2.length() / 2));

            if (consonantes.contains(subNombre1.substring(subNombre1.length() - 1)) && consonantes.contains(subNombre2.substring(0, 1))) {
                subNombre2 = nombre2.substring((nombre2.length() / 2) - 1);
            }

            String nombreShip = (subNombre1 + subNombre2);

            System.out.println("El ship es: " + nombreShip);
        } while (nombre1.equals("0") || nombre2.equals("0"));
    }

    public static void main(String[] args) {
        Main ship = new Main();
        ship.generarShip();
    }
}