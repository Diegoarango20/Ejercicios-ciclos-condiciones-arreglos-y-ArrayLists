package com.example;

import java.util.Scanner;

public class RevisionVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[7];

        // Pedir al usuario las ventas de cada día
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese la venta del día " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
        }

        // Inicializar variables para mayor y menor venta
        double mayorVenta = ventas[0];
        double menorVenta = ventas[0];
        int diaMayor = 0;
        int diaMenor = 0;

        // Buscar el día de mayor y menor venta
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > mayorVenta) {
                mayorVenta = ventas[i];
                diaMayor = i;
            }
            if (ventas[i] < menorVenta) {
                menorVenta = ventas[i];
                diaMenor = i;
            }
        }

        // Mostrar resultados
        System.out.println("\nDía de mayor venta: Día " + (diaMayor + 1) + " con $" + mayorVenta);
        System.out.println("Día de menor venta: Día " + (diaMenor + 1) + " con $" + menorVenta);

        sc.close();

    }
}