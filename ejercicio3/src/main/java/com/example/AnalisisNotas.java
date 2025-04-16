package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class AnalisisNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        // Ingresar las 10 notas

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            double nota = sc.nextDouble();

            // Validar que la nota esté en el rango 0-5
            while (nota < 0 || nota > 5) {
                System.out.print("Nota inválida. Ingrese un valor entre 0 y 5: ");
                nota = sc.nextDouble();
            }

            notas.add(nota); // Agregar la nota al ArrayList
        }

        // Calcular promedio y cantidad de aprobados
        double suma = 0;
        int aprobados = 0;

        // Recorremos las notas para calcular el promedio y contar aprobados
        for (double nota : notas) {
            suma += nota;
            if (nota >= 3.5) {
                aprobados++;
            }
        }

        double promedio = suma / notas.size(); // Calcular promedio

        // Mostrar los resultados
        System.out.println("\nPromedio general: " + promedio);
        System.out.println("Cantidad de estudiantes que aprobaron: " + aprobados);

        sc.close(); // Cerrar el scanner

    }
}