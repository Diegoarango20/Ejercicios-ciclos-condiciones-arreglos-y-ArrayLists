package com.example;

import java.util.Scanner;

public class EvaluacionProductos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] estado = new int[50];

        int productosBuenos = 0;
        int productosDefectuosos = 0;

        // Ingresar el estado de los productos (1 = bueno, 0 = defectuoso)

        for (int i = 0; i < estado.length; i++) {
            System.out.print("Ingrese el estado del producto " + (i + 1) + " (1 = bueno, 0 = defectuoso): ");
            int estadoProducto = sc.nextInt();

            // Validar que el estado sea 1 o 0

            while (estadoProducto != 0 && estadoProducto != 1) {
                System.out.println("Estado inválido. ingrese 1 para bueno o 0 para defectuoso.");
                System.out.print("Ingrese el estado del producto " + (i + 1) + " (1 = bueno, 0 = defectuoso): ");
                estadoProducto = sc.nextInt();
            }

            estado[i] = estadoProducto;

            // Contar productos buenos y defectuosos

            if (estadoProducto == 1) {
                productosBuenos++;
            } else {
                productosDefectuosos++;
            }
        }

        // Calcular el porcentaje de defectuosos
        double porcentajeDefectuosos = (productosDefectuosos / 50.0) * 100;

        // Resultados
        
        System.out.println("\nCantidad de productos buenos: " + productosBuenos);
        System.out.println("Cantidad de productos defectuosos: " + productosDefectuosos);
        System.out.println("Porcentaje de productos defectuosos: " + porcentajeDefectuosos + "%");






        
        sc.close();
    }
}