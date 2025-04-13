package Candidatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Internet candidatoInternet = new Internet("Candidato A");
        Radio candidatoRadio = new Radio("Candidato B");
        Television candidatoTelevision = new Television("Candidato C");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(" BIENVENIDO AL PREMIER ");
            System.out.println("1. Votar por un candidato");
            System.out.println("2. Calcular costo de campaña");
            System.out.println("3. Vaciar urnas");
            System.out.println("4. Ver número total de votos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println(" VOTA POR UN CANDIDATO ");
                    System.out.println("1. " + candidatoInternet.getNombre() + " Internet");
                    System.out.println("2. " + candidatoRadio.getNombre() + " Radio");
                    System.out.println("3. " + candidatoTelevision.getNombre() + " Televisión");
                    System.out.print("Seleccione un candidato ");
                    int candidatoOpcion = scanner.nextInt();

                    switch (candidatoOpcion) {
                        case 1 -> candidatoInternet.votar();
                        case 2 -> candidatoRadio.votar();
                        case 3 -> candidatoTelevision.votar();
                        default -> System.out.println("Candidato no válido");
                    }
                }
                case 2 -> {
                    System.out.println("COSTO DE LA CAMPAÑA  ");
                    System.out.println(candidatoInternet.getNombre() + " Internet $" + candidatoInternet.calcularCosto());
                    System.out.println(candidatoRadio.getNombre() + " Radio $" + candidatoRadio.calcularCosto());
                    System.out.println(candidatoTelevision.getNombre() + " Televisión $" + candidatoTelevision.calcularCosto());
                }
                case 3 -> {
                    candidatoInternet.vaciarUrnas();
                    candidatoRadio.vaciarUrnas();
                    candidatoTelevision.vaciarUrnas();
                    System.out.println("Urnas vaciadas.");
                }
                case 4 -> {
                    int totalVotos = candidatoInternet.getTotalVotos() + candidatoRadio.getTotalVotos() + candidatoTelevision.getTotalVotos();
                    System.out.println("Total de votos: " + totalVotos);
                }
                case 5 -> System.out.println("Gracias por participar");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}