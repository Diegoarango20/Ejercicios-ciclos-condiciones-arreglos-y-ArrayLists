package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ClasificacionCompras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> compras = new ArrayList<>();

        // Montos de las compras para los clientes

        System.out.println("Ingrese los montos de las compras de 8 clientes:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Monto de la compra del cliente " + (i + 1) + ": ");
            double monto = sc.nextDouble(); 
            compras.add(monto); 
        }

        // Variables para contar las compras

        int pequeno = 0, mediano = 0, grande = 0;

        // Clasificación de las compras

        for (double monto : compras) {
            if (monto < 50000) {
                pequeno++; 
            } else if (monto >= 50000 && monto <= 100000) {
                mediano++; 
            } else {
                grande++; 
            }
        }

        // Mostrar los resultados
        
        System.out.println("\nClasificación de las compras:");
        System.out.println("Clientes con compras pequeñas (< 50.000 COP): " + pequeno);
        System.out.println("Clientes con compras medianas (50.000 - 100.000 COP): " + mediano);
        System.out.println("Clientes con compras grandes (> 100.000 COP): " + grande);

        sc.close();
    }
}