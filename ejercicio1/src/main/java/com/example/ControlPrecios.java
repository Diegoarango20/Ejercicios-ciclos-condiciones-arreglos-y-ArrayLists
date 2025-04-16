package com.example;

import java.util.Scanner;

public class ControlPrecios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        double[] precios = new double[5];

        // Pedimos al usuario que ingrese nombres y precios
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            System.out.print("Ingrese el precio de " + nombres[i] + ": ");
            precios[i] = sc.nextDouble();
            sc.nextLine(); // Limpiar buffer
        }

        // Mostrar productos con precio mayor a 50.000
        System.out.println("\nProductos con precio mayor a 50.000 COP:");
        for (int i = 0; i < 5; i++) {
            if (precios[i] > 50000) {
                System.out.println(nombres[i] + " - $" + precios[i]);
            }
        }

        sc.close();

    }
}