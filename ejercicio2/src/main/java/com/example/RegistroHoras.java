package com.example;

import java.util.Scanner;

public class RegistroHoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] horas = new double[3][5];

        // ingresar las horas

        for (int i = 0; i < 3; i++) {
            System.out.println("Trabajador " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print("  Día " + (j + 1) + " - Horas trabajadas: ");
                horas[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        // Calcular y mostrar el total de horas por trabajador
        System.out.println("\nTotal de horas por trabajador:");
        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total += horas[i][j];
            }
            System.out.println("Trabajador " + (i + 1) + ": " + total + " horas");
        }

        sc.close();

    }
}