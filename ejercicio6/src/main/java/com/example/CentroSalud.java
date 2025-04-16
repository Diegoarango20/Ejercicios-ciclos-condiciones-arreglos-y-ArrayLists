package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CentroSalud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> prioridades = new ArrayList<>();

        // 1. Ingresar los datos de 5 pacientes
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del paciente " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            nombres.add(nombre);

            System.out.print("Prioridad (1 = alta, 2 = media, 3 = baja): ");
            int prioridad = sc.nextInt();
            sc.nextLine(); // Limpiar salto de línea

            while (prioridad < 1 || prioridad > 3) {
                System.out.print("Prioridad inválida. Ingrese 1, 2 o 3: ");
                prioridad = sc.nextInt();
                sc.nextLine(); // Limpiar
            }

            prioridades.add(prioridad);
        }

        // 2. Ordenar por prioridad (burbuja simple)
        for (int i = 0; i < prioridades.size() - 1; i++) {
            for (int j = i + 1; j < prioridades.size(); j++) {
                if (prioridades.get(i) > prioridades.get(j)) {
                    // Intercambiar prioridades
                    int tempPrioridad = prioridades.get(i);
                    prioridades.set(i, prioridades.get(j));
                    prioridades.set(j, tempPrioridad);

                    // Intercambiar nombres también (mantener relación)
                    String tempNombre = nombres.get(i);
                    nombres.set(i, nombres.get(j));
                    nombres.set(j, tempNombre);
                }
            }
        }

        // 3. Mostrar pacientes ordenados por prioridad
        System.out.println("\nPacientes en orden de atención (prioridad alta a baja):");
        for (int i = 0; i < nombres.size(); i++) {
            String tipo = switch (prioridades.get(i)) {
                case 1 -> "Alta";
                case 2 -> "Media";
                case 3 -> "Baja";
                default -> "Desconocida";
            };
            System.out.println("- " + nombres.get(i) + " (Prioridad: " + tipo + ")");
        }

        sc.close();

    }
}